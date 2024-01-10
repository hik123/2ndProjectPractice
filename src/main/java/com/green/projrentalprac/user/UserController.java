package com.green.projrentalprac.user;


import com.green.projrentalprac.common.ResVo;
import com.green.projrentalprac.user.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {
    private final UserService service;


    @PostMapping("/signup")
    public ResVo postSignup(@RequestBody UserSignupDto dto) {
        log.info("dto : {}", dto);

        return service.postSignup(dto);
    }

    @PostMapping("/signin")
    public UserSigninVo postSignin(UserSigninDto dto) {
        log.info("dto : {}", dto);
        return service.postSignin(dto);
    }

    @PostMapping("/id")
     public UserFindUidVo getFindUid(@RequestBody UserFindUidDto dto) {
        log.info("dto : {}", dto);
        return service.selFindUid(dto);
    }

    @PatchMapping("/pw")
    public ResVo patchFindUpw(UserFindUpwDto dto) {
        log.info("dto : {}", dto);
        return service.patchFindUpw(dto);
    }

    @PutMapping
    public ResVo putInfo(UserUpdInfoDto dto) {
        log.info("dto : {}", dto);
        return service.putInfo(dto);
    }


}
