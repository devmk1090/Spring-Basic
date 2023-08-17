package com.devk.srping.basic;

import com.devk.srping.basic.repository.JdbcTemplateMemberRepository;
import com.devk.srping.basic.repository.JpaMemberRepository;
import com.devk.srping.basic.repository.MemberRepository;
import com.devk.srping.basic.repository.MemoryMemberRepository;
import com.devk.srping.basic.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

//    private EntityManager em;
//
//    @Autowired
//    public SpringConfig(EntityManager em) {
//        this.em = em;
//    }
//
//    @Bean
//    public MemberService memberService() {
//        return new MemberService(memberRepository());
//    }

//    @Bean
//    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//        return new JdbcTemplateMemberRepository(dataSource);
//        return new JpaMemberRepository(em);
//    }
}
