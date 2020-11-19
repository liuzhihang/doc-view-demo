package com.liuzhihang.doc.service;


import com.liuzhihang.doc.dto.Result;
import com.liuzhihang.doc.dto.UserAccount;
import com.liuzhihang.doc.dto.UserDateAccount;

import java.time.LocalDate;

/**
 * 测试 dubbo 生成文档
 *
 * @author liuzhihang
 * @date 2020/9/10 11:47
 */
public interface UserFacade {

    /**
     * 查询用户昨日账户信息
     *
     * @param mobile
     * @param date
     * @return
     */
    Result<UserDateAccount> queryUserDateAccount(String mobile, LocalDate date);


    /**
     * 校验是否有昨日账户
     *
     * @param date
     * @return
     */
    Result checkAllAcctRecord(LocalDate date);


    Result<UserAccount> queryUserAccount(String mobile);
}
