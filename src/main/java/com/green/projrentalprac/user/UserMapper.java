package com.green.projrentalprac.user;

import com.green.projrentalprac.user.model.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insUser(UserSignupDto dto);
    UserSigninVo selUser(UserSigninDto dto);
    UserFindUidVo findUid(UserFindUidDto dto);
    UserFindUidVo findUidCheck(String phone);

    int findUpw(UserFindUpwDto dto);
    int updInfo(UserUpdInfoDto dto);
}
