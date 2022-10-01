package com.security.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService 
{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{
		if("admin".equals(username))
		{
			return new User("admin","$2a$12$Zx4Ik6hGoOaHwP8DQpwLJOoBBFYzTTJMprieN9w/FybTq9hl15NiC",
					new ArrayList<>());
		}
		else
		{
			throw new UsernameNotFoundException("USER NOT FOUND" + username);
		}
	}
	
}
