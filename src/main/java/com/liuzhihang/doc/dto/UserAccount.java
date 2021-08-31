package com.liuzhihang.doc.dto;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author liuzhihang
 * @date 2020/9/11 15:47
 */
@Builder
@Setter
@Getter
@Data
public class UserAccount implements Serializable {

    private String userId;

}
