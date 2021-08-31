package com.liuzhihang.doc.dto;


import lombok.Data;

import java.io.Serializable;

/**
 * @author liuzhihang
 * @date 2020/9/11 15:47
 */
@Data
public class UserDateAccount implements Serializable {

    /**
     * 1123111
     */
    private Long balanceAmount;

    /**
     * 账户 id
     */
    private Long accountId;

    /**
     * 账户名称
     */
    // 账户名称
    private Long accountName;

}
