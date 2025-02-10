package com.tencent.supersonic.common.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Text2SQLExemplar implements Serializable {
    // text2sql的具体例子，消息题
    public static final String PROPERTY_KEY = "sql_exemplar";

    // 问题
    private String question;

    // 附加信息
    private String sideInfo;

    // 数据库模式
    private String dbSchema;

    // sql语句
    private String sql;
}
