package com.board.uni.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@RequiredArgsConstructor
@Controller
public class MemberController {

    @GetMapping("/")
    public String home() {
        return "home";
    }


//    @PostMapping("/login")
//    public @ResponseBody ResponseDto loginMembers(@RequestBody RequestAccountDto requestAccountDto, HttpServletResponse response, HttpServletRequest request) {
//        if(request.getHeader("Authorization") != null || request.getHeader("Refresh") != null) {
//            throw new CustomException(ErrorCode.LOGIN_TOKEN_DETECTED);
//        }
//        Map<String, String> tokenSet = accountService.selectAccount(requestAccountDto.getEmail(), requestAccountDto.getPassword());
//        response.setHeader("Authorization", "Bearer " + tokenSet.get("accessToken"));
//
//        return new ResponseDto(200, "success", "로그인 성공", tokenSet);
//
//    }

}
