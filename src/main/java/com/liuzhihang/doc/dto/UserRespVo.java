package com.liuzhihang.doc.dto;

import lombok.Data;

import java.util.List;

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

    private UserRespVo userRespVo;
    private UserRespVo userRespVo1;
    private UserRespVo userRespVo2;
    private List<UserReqVo> UserReqVoList1;
    private List<UserReqVo> UserReqVoList2;

}
