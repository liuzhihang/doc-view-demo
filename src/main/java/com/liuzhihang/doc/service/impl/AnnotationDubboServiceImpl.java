package com.liuzhihang.doc.service.impl;

import com.liuzhihang.doc.dto.Result;
import com.liuzhihang.doc.dto.UserDateAccount;
import com.liuzhihang.doc.service.AnnotationDubboService;
import org.apache.dubbo.config.annotation.DubboService;

import java.time.LocalDate;

/**
 * @author zijun.lzh
 * @version AnnotationDubboServiceImpl.java, v 0.1 2022/4/13 16:37 zijun
 */
@DubboService
public class AnnotationDubboServiceImpl implements AnnotationDubboService {
    @Override
    public Result<UserDateAccount> queryUserDateAccount(String mobile, LocalDate date) {
        return null;
    }

    @Override
    public Result checkAllAcctRecord(LocalDate date) {
        return null;
    }
}
