package com.green.projrentalprac.user;

import com.green.projrentalprac.user.model.UserFindUidVo;
import com.green.projrentalprac.user.model.UserSignupDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insUser(UserSignupDto dto);
    UserFindUidVo selFindUid(String phone);
}
