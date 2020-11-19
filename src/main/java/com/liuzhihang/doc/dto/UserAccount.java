package com.liuzhihang.doc.dto;


import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author liuzhihang
 * @date 2020/9/11 15:47
 */
@Data
public class UserAccount implements Serializable {

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
     * 用户id
     */
    private String userId;

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

    /**
     * 账户状态 N正常 F冻结
     */
    private String acctStatus;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 创建人员
     */
    private String createOperator;

    /**
     * 更新人员
     */
    private String lastModifyOperator;

    /**
     * 备注
     */
    private String memo;

    /**
     * 用户级别
     */
    private String userLevel;

    /**
     * 协议状态
     */
    private String protocolStatus;

}
