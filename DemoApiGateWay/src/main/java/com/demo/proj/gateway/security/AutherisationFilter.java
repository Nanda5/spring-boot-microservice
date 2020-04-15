package com.demo.proj.gateway.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

public class AutherisationFilter extends BasicAuthenticationFilter {
	@Autowired
	private Environment env;

	public AutherisationFilter(AuthenticationManager authenticationManager) {
		super(authenticationManager);
	}

	/*
	 * protected void doFilterInternal(HttpServletRequest req, HttpServletResponse
	 * res, FilterChain chain)throws IOException, ServletException { String
	 * authorizationHeader=
	 * 
	 * 
	 * }
	 */
}
