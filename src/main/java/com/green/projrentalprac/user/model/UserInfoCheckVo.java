package com.green.projrentalprac.user.model;


import lombok.Data;

@Data
public class UserInfoCheckVo {
    private String addr;
    private String restAddr;
    private String nick;
    private String pic;
    private String phone;
    private String email;
    private double raiting;
    private double y;
    private double x;
}
