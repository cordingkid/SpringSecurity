package kr.or.ddit.security;

import javax.inject.Inject;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import kr.or.ddit.mapper.MemberMapper;
import kr.or.ddit.vo.CustomUser;
import kr.or.ddit.vo.MemberVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomUserDetailsService implements UserDetailsService{

	@Inject
	private BCryptPasswordEncoder pe;
	
	@Inject
	private MemberMapper memberMapper;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		String password = "pwd1";
		
		// 인코딩된 암호화 비밀번호를 알아본다.
		log.info("### 인코딩된 비밀번호를 확인합니다 ### : " + pe.encode(password));
		log.info("### 인코딩된 비밀번호를 확인합니다 ### : " + pe.encode(password));
		log.info("### 인코딩된 비밀번호를 확인합니다 ### : " + pe.encode(password));
		log.info("### 인코딩된 비밀번호를 확인합니다 ### : " + pe.encode(password));
		log.info("### 인코딩된 비밀번호를 확인합니다 ### : " + pe.encode(password));
		log.info("### 인코딩된 비밀번호를 확인합니다 ### : " + pe.encode(password));
		
		log.info("load User by username : " + username);
		
		// userName은 사용자명이 아니라 사용자 아이디를 의미
		// member를 가지고 최종 리턴해서 넘겨야할 UserDetails를 만들어줌
		MemberVO member;
		
		try {
			member = memberMapper.readByUserId(username);
			log.info("query by member mapper : " + member);
			return member == null ? null : new CustomUser(member);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return null;
	}

}


























