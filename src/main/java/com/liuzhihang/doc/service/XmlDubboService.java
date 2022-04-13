package com.liuzhihang.doc.service;

import com.liuzhihang.doc.dto.Result;
import com.liuzhihang.doc.dto.UserDateAccount;
import org.apache.dubbo.config.annotation.DubboService;

import java.time.LocalDate;

/**
 * xml 配置 dubbo 接口
 *
 * @author liuzhihang
 * @version AnnotationDubboService.java, v 0.1 2022/4/13 16:06 zijun
 */
@DubboService
public interface XmlDubboService {

    /**
     * 方法 1
     *
     * @param mobile
     * @param date
     * @return
     */
    Result<UserDateAccount> queryUserDateAccount(String mobile, LocalDate date);


    /**
     * 方法 2
     *
     * @param date
     * @return
     */
    Result checkAllAcctRecord(LocalDate date);

}
