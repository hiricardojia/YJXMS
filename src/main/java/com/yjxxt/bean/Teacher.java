package com.yjxxt.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Teacher {
    private Integer id;

    private String teacherName;

    private String teacherPwd;

    private String sex;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateDate;

    private Integer isValid;

    private String email;

    private String clazzName;

    private String roleName;

    private  String  roleid;

    private String clazzid;

    private  String  job;

    private String   rclass;

    private String phone;

    private String address;

}