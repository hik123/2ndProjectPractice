package com.green.projrentalprac.user;


import com.green.projrentalprac.common.ResVo;
import com.green.projrentalprac.common.exception.BadInformationException;
import com.green.projrentalprac.user.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper mapper;

    public ResVo postSignup(UserSignupDto dto) {
        String salt = BCrypt.gensalt();
        String hashedPw = BCrypt.hashpw(dto.getUpw(), salt);

        dto.setUpw(hashedPw);

        int result = mapper.insUser(dto);
        log.debug("dto : {}", dto);
        if(result == 0) {
            throw new BadInformationException("dfaada!!!");
        }
        return new ResVo(1);
    }

    public UserSigninVo postSignin(UserSigninDto dto) {
        UserSigninVo vo = mapper.selUser(dto);
        if(vo == null) {
            throw new BadInformationException("dfafas!!");
        }
        //if(BCrypt.checkpw()){}
        log.info("dto : {}", dto);
        return vo;
    }

    public UserFindUidVo selFindUid(UserFindUidDto dto) {
        UserFindUidVo vo = mapper.findUid(dto);
        return vo;
    }

    public ResVo patchFindUpw(UserFindUpwDto dto) {
        int result = mapper.findUpw(dto);
        return new ResVo(result);
    }

    public ResVo putInfo(UserUpdInfoDto dto) {
        int result = mapper.updInfo(dto);
        return new ResVo(result);
    }
}
