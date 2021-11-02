package com.liuzhihang.doc.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author liuzhihang
 * @date 2020/10/30 15:23
 */
@Data
@ApiModel("用户")
public class UserReqVo {

    @NotNull
    @ApiModelProperty(value = "账户号", required = true, notes = "描述")
    private String accountNo;

    @ApiParam(name = "银行卡号")
    private String bankCode;

    @NotBlank
    private String bankName;

    @Schema(required = true, name = "卡号", title = "标题", description = "描述")
    private String cardNo;

    @NonNull
    private InnerUser innerUser;

    @Data
    public static class InnerUser {

        @NotBlank
        private String userId;
        private String userName;
    }

}
