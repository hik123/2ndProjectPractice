package com.green.projrentalprac.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class UserSignupDto {
    @JsonIgnore
    private int iuser;
    private int iaddr;
    private String restAddr;
    private String uid;
    private String upw;
    private String nick;
    private String storePic;
    private String requstPic;
    private String phone;
    private String email;
    private double x;
    private double y;
}
