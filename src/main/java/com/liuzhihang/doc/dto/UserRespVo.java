package com.liuzhihang.doc.dto;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author liuzhihang
 * @date 2020/10/30 15:23
 */
@Data
public class UserRespVo extends Model<UserRespVo> {
    /**
     * 用户名字
     */
    private String userName;

    private UserAccount userAccount;

}
