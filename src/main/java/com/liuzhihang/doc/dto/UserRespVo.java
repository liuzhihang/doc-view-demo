package com.liuzhihang.doc.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author liuzhihang
 * @date 2020/10/30 15:23
 */
@Data
public class UserRespVo {

    private String userId;

    private String userName;

    /**
     * 理财账户id
     */
    private String shareAcctId;

    /**
     * 别名
     */
    private String aliasName;

    /**
     * 签约号
     */
    private String contractId;

    /**
     * 商户id
     */
    private String merchantId;

    /**
     * 产品编码
     */
    private String productCode;


    /**
     * 资产类别
     */
    private String assetType;

    /**
     * 资产总金额
     */
    private BigDecimal balance;

    /**
     * 冻结金额
     */
    private BigDecimal freezeAmount;

    /**
     * 累计收益金额
     */
    private BigDecimal revenueAmount;

    /**
     * 昨日收益金额
     */
    private BigDecimal lastRevenue;

    /**
     * 币种
     */
    private String currency;


}
