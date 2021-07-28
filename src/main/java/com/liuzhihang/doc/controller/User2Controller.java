package com.liuzhihang.doc.controller;

import com.liuzhihang.doc.dto.Result;
import com.liuzhihang.doc.dto.UserReqVo;
import com.liuzhihang.doc.dto.UserRespVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试接口
 *
 * @author liuzhihang
 * @date 2020/3/6 12:53
 * @description 用户相关接口
 */
@RequestMapping("/user2")
@RestController
@Api(tags = {"用户接口相关", "用户11"})
@Tag(name = "用户接口")
public class User2Controller {


    /**
     * @param reqVo
     * @return
     */
    @ApiOperation(value = "swagger 这是一个接口", hidden = true)
    @Operation(summary = "swagger3 这是一个接口", hidden = true)
    @PostMapping("/postTest")
    public Result<UserRespVo> postTest(@RequestBody UserReqVo reqVo) {

        return null;
    }

    @PostMapping("/postTest1")
    public Result<UserRespVo> postTest1(@ApiParam("擦拭打打分") String userId) {

        return null;
    }

}
