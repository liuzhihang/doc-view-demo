package com.liuzhihang.doc.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author liuzhihang
 * @date 2020/10/30 15:23
 */
@Data
public class UserRespVo {
    /**
     * 用户名字
     */
    private String userName;

    /**
     * 用户 id
     */
    private String userId;

    /**
     * 测试接口数据
     *
     * @DocView.Required
     */
    private UserRespVo userRespVo;
    /**
     * @DocView.Required
     */
    private UserRespVo userRespVo1;
    /**
     * @DocView.Required
     */
    private UserRespVo userRespVo2;
    /**
     * @DocView.Required
     */
    private List<UserReqVo> userReqVoList1;
    private List<String> ss;
    private Map<String, String> sss;

}
