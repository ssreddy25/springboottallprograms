package com.ojas.securityconfiguration;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.ojas.entity.UserInfo;
import com.ojas.repository.UserInfoRepositry;

@Component
public class UserInfoUserDetailsServices implements UserDetailsService {

	@Autowired
	private UserInfoRepositry userInfoRepositry;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		  Optional<UserInfo> userInfo = userInfoRepositry.findByName(username);
			return userInfo.map(UserInfoUserDetails::new)
					.orElseThrow(()->new UsernameNotFoundException("user not found"));
			
			
	}

//	@Override
//	public UserInfoUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//              Optional<UserInfo> userInfo = userInfoRepositry.findByName(username);
//			return userInfo.map(UserInfoUserDetails::new)
//					.orElseThrow(()->new UsernameNotFoundException("user not found"));
//	
//              
//		
//	}

}
