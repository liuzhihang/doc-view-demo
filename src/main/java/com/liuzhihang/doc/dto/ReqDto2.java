package com.liuzhihang.doc.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author liuzhihang
 * @date 2020/3/6 12:59
 */
@Data
public class ReqDto2 {


    private String reqDto2Param1;
    private String reqDto2Param2;

    private String userName;

    private String pwd;

    private int age;

    private Date date;


    //{
    //    "reqDto2Param1": "",
    //    "reqDto2Param2": "",
    //    "userName": "",
    //    "pwd": "",
    //    "age": 0
    //}

    // {
    //    "reqDto2Param1": "",
    //    "reqDto2Param2": "",
    //    "userName": "",
    //    "pwd": "",
    //    "age": 0
    //}{
    //    "reqDto2Param1": "",
    //    "reqDto2Param2": "",
    //    "userName": "",
    //    "pwd": "",
    //    "age": 0,
    //    "date": null
    //}
}
