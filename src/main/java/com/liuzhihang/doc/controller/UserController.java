package com.liuzhihang.doc.controller;

import com.liuzhihang.doc.dto.*;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试接口
 *
 * @author liuzhihang
 * @date 2020/3/6 12:53
 * @DocView.Title 用户相关接口
 */
@RequestMapping("/user")
@RestController
public class UserController {


    /**
     * 这是一段接口描述信息
     *
     * @param reqVo reqVo
     * @return {@link Result<UserRespVo>}
     * @docName 接口名称测试
     */
    @PostMapping("/respGenericTest")
    public ResultX<UserRespVo, UserAccount> respGenericTest(@RequestBody UserReqVo reqVo) {

        return null;
    }


    /**
     * 测试 get 请求
     *
     * @param userId
     * @return
     * @name 测试接口  中间带空格
     * @description 这是一个文档的描述，省略十万字 ...
     * 还有换行
     * <p>
     * 换行
     */
    @GetMapping("/getTest")
    public UserRespVo getTest(@Parameter String userId, @RequestHeader String token) {

        return null;
    }

    /**
     * 测试 get 请求
     *
     * @return
     * @name 测试接口
     * @description 这是一个文档的描述，省略十万字 ...
     * 还有换行
     * <p>
     * 换行 感觉现在 IDEA 也不算多卡了奥术大师大萨达撒大驱蚊器额大萨达撒大二十七日回来的花覅拉我护额入秋后未入户违法和IQ李文华
     * 换行
     * 换行
     */
    @GetMapping("/test2")
    public List<String> test2() {

        return new ArrayList<>();
    }

    /**
     * @return
     */
    @GetMapping("/test3")
    public List<UserRespVo> test3() {

        return new ArrayList<>();
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
     * 这是一个测试接口<p>测试换行
     * 换行
     * 测试换行
     *
     * @param userId
     * @param userName
     * @return {@link Result<UserRespVo>}
     */
    @PostMapping("/requestParam")
    public Result<String> requestParam(@RequestParam(required = false) String userId, @RequestParam String userName) {

        return null;
    }


    /**
     * @return {@link Map<String, UserRespVo>}
     * @@name responseMap
     */
    @PostMapping("/responseMap")
    public Map<String, UserRespVo> responseMap() {

        return new HashMap<>(2);
    }


}
