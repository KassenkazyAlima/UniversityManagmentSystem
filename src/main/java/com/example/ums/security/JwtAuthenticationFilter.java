package com.example.ums.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;


import java.io.IOException;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final JwtTokenProvider jwtTokenProvider;

    public JwtAuthenticationFilter(JwtTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        String token = jwtTokenProvider.resolveToken(request);

        if (token != null && jwtTokenProvider.validateToken(token)) {
            // Ensure that this is cast to UsernamePasswordAuthenticationToken
            UsernamePasswordAuthenticationToken auth =
                    (UsernamePasswordAuthenticationToken) jwtTokenProvider.getAuthentication(token);

            // Set the authentication details for the request
            auth.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

            // Set the authentication object in the SecurityContext
            SecurityContextHolder.getContext().setAuthentication(auth);
        }

        // Proceed with the filter chain
        filterChain.doFilter(request, response);
    }

}
