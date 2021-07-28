package com.liuzhihang.doc.dto;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 测试
 */
@Setter
@Getter
@Data
@Builder
public class TestMan {

    public static void main(String[] args) {

        System.out.println(paramNameHandler("xxxx_yyyy"));

    }


    public static String paramNameHandler(String jsonKey) {

        jsonKey = jsonKey.trim();

        // 是否需要驼峰转换

        if (jsonKey.contains("_") || jsonKey.contains("-") || jsonKey.contains(" ")) {
            String[] split = jsonKey.split("[_\\- ]");

            StringBuilder camelCased = new StringBuilder();
            for (int i = 1; i < split.length; i++) {
                camelCased.append(split[i].substring(0, 1).toUpperCase()).append(split[i].substring(1));
            }
            return split[0] + camelCased;

        }


        return jsonKey;
    }


}
