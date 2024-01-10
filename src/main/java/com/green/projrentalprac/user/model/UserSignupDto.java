package com.green.projrentalprac.user.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSignupDto {
    @JsonIgnore
    private int iuser;
    private int iaddr;
    private String addr;
    private String restAddr;
    private String uid;
    private String upw;
    private String nick;
    private String pic;
    private String phone;
    private String email;
    private double x;
    private double y;
}
