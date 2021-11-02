package com.liuzhihang.doc.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author liuzhihang
 * @date 2020/10/30 15:24
 */
@Data
public class Result<T> {

    public static String SUCCESS_CODE = "00000";
    public static String SUCCESS_MSG = "SUCCESS";
    /**
     * 响应码
     *
     * @required
     */
    private String code;

    /**
     * 响应信息
     */
    private String msg;

    /**
     * 响应数据
     */
    private T data;
//    private List<T> dataList;
//    private Map<String, T> dataMap;
}
