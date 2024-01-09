package com.green.projrentalprac.user;


import com.green.projrentalprac.common.ResVo;
import com.green.projrentalprac.user.model.UserFindUidVo;
import com.green.projrentalprac.user.model.UserSignupDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper mapper;

    public ResVo postSignup(UserSignupDto dto) {
        int result = mapper.insUser(dto);
        log.debug("dto : {}", dto);
        if(result == 1) {
            return new ResVo(1);
        }
        return new ResVo(0);
    }

    public UserFindUidVo selFindUid(String phone) {
        return mapper.selFindUid(phone);
    }
}
