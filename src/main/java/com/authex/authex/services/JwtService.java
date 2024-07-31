package com.authex.authex.services;

import org.springframework.stereotype.Service;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;

import java.time.Instant;
import java.util.stream.*;


@Service
public class JwtService {
    private final JwtEncoder encoder;

    public JwtService(JwtEncoder encoder) {
        this.encoder = encoder;
    }

    public String gerenateToken(Authentication authentication) {
        Instant now = Instant.now();
        long exp = 3600L;

        String scopes = authentication.getAuthorities().stream()
            .map(GrantedAuthority::getAuthority)
            .collect(Collectors.joining(" "));

        var claims = JwtClaimsSet.builder()
            .issuer("authEx")
            .issuedAt(now)
            .expiresAt(now.plusSeconds(exp))
            .subject(authentication.getName())
            .claim("scope", scopes)
            .build();

            return this.encoder.encode(JwtEncoderParameters.from(claims)).getTokenValue();
    }
}
