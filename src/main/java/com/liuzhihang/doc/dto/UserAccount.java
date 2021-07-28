package com.liuzhihang.doc.dto;


import lombok.Data;

import java.io.Serializable;

/**
 * @author liuzhihang
 * @date 2020/9/11 15:47
 */
@Data
public class UserAccount implements Serializable {

    /**
     * 理财账户id
     */
    private String userId;

    /**
     * 别名
     */
    private String aliasName;

    /**
     * 商户id
     */
    private String merchantId;

    /**
     * 产品编码
     */
    private String productCode;



}
