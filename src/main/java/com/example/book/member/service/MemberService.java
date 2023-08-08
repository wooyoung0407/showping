package com.example.book.member.service;

import com.example.book.member.entity.Member;
import com.example.book.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;
    public Member join(String username, String password, String email, String nickname){

        Member member = new Member();
            member.setUsername(username);
            member.setPassword(passwordEncoder.encode(password));
            member.setEmail(email);
            member.setNickname(nickname);
            this.memberRepository.save(member);

            return member;
    }
}
