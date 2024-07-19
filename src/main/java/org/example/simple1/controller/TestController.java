package org.example.simple1.controller;

import lombok.RequiredArgsConstructor;
import org.example.simple1.dto.MemberDto;
import org.example.simple1.entity.Member;
import org.example.simple1.repository.MemberRepositoty;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class TestController {

    private final MemberRepositoty memberRepositoty;

    @GetMapping("/")
    public MemberDto test() {
        MemberDto memberDto = new MemberDto();
        memberDto.setName("갓성진 킹수정 홍신 갓지 짱!");
        memberDto.setAge(1234);

        memberRepositoty.save(new Member("member1"));

        return memberDto;

    }
}