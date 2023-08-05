package com.devk.srping.basic;

import com.devk.srping.basic.repository.MemberRepository;
import com.devk.srping.basic.repository.MemoryMemberRepository;
import com.devk.srping.basic.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
