package com.liuzhihang.doc.controller;

import com.liuzhihang.doc.dto.Result;
import com.liuzhihang.doc.dto.UserReqVo;
import com.liuzhihang.doc.dto.UserRespVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 测试接口
 *
 * @author liuzhihang
 * @date 2020/3/6 12:53
 * @description 用户相关接口
 */
@RequestMapping("/user")
@Controller
public class UserController {

    /**
     * 测试 get 请求
     *
     * @param userId
     * @return
     * @name 测试接口
     * @description 这是一个文档的描述，省略十万字 ...
     */
    @GetMapping("/getTest")
    public UserRespVo getTest(String userId, @RequestHeader String token) {

        return null;
    }


    /**
     * @param reqVo
     * @return
     */
    @PostMapping("/postTest")
    public UserRespVo postTest(@RequestBody UserReqVo reqVo) {

        return null;
    }

    /**
     * 返回泛型测试
     *
     * @param reqVo
     * @return
     */
    @PostMapping("/respGenericTest")
    public Result<UserRespVo> respGenericTest(@RequestBody UserReqVo reqVo) {

        return null;
    }
}
