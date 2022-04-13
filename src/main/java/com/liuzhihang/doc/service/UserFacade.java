package com.liuzhihang.doc.service;


import com.liuzhihang.doc.dto.Result;
import com.liuzhihang.doc.dto.UserAccount;
import com.liuzhihang.doc.dto.UserDateAccount;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * 普通接口
 *
 * @author liuzhihang
 * @date 2020/9/10 11:47
 */
public interface UserFacade {

    /**
     * 查询用户昨日账户信息/分级
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

    Result<UserAccount> test(UserAccount mobile);

    Result<UserAccount> listUser(List<UserAccount> userAccountList);

    Result<UserAccount> mapUser(Map<String, UserAccount> mapUser);
}
