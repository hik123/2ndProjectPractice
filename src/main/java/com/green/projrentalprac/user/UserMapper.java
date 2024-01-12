package com.green.projrentalprac.user;

import com.green.projrentalprac.user.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int insUser(UserSignupDto dto);
    UserSigninProcVo selUser(UserSigninDto dto);
    UserFindUidVo findUid(UserFindUidDto dto);
    UserFindUidVo findUidCheck(String phone);

    UserInfoCheckVo selUserInfoCheck(int iuser);
    int findUpw(UserFindUpwDto dto);
    int updInfo(UserUpdInfoDto dto);

    List<UserDelVo> selDelTarget(int iuser);


    int delUser(int iuser);
    int delPics(int iuser);
    int delProdPaymt(int iuser);
    int updPayment(int iuser);
    int delProduct(int iproduct);


}
