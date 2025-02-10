package com.tencent.supersonic.headless.api.pojo.request;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.tencent.supersonic.common.pojo.ChatApp;
import com.tencent.supersonic.common.pojo.Text2SQLExemplar;
import com.tencent.supersonic.common.pojo.User;
import com.tencent.supersonic.common.pojo.enums.Text2SQLType;
import com.tencent.supersonic.headless.api.pojo.QueryDataType;
import com.tencent.supersonic.headless.api.pojo.SemanticParseInfo;
import com.tencent.supersonic.headless.api.pojo.enums.MapModeEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
public class QueryNLReq extends SemanticQueryReq implements Serializable {
    private String queryText; // 用户的输入
    private Set<Long> dataSetIds = Sets.newHashSet(); // 数据集ID
    private User user; // 用户信息
    private QueryFilters queryFilters; // 查询过滤器
    private boolean saveAnswer = true; // 是否保存答案，默认为true
    private Text2SQLType text2SQLType = Text2SQLType.LLM_OR_RULE; // 基于规则还是LLM，还是二者兼具
    private MapModeEnum mapModeEnum = MapModeEnum.STRICT; // 生成的结构化查询的宽松度
    private QueryDataType queryDataType = QueryDataType.ALL;
    private Map<String, ChatApp> chatAppConfig;
    private List<Text2SQLExemplar> dynamicExemplars = Lists.newArrayList(); // text，sql，附加信息消息体
    private SemanticParseInfo contextParseInfo; // 上下文表单信息
    private SemanticParseInfo selectedParseInfo; // 选择的表单信息
    private boolean descriptionMapped;

    @Override
    public String toCustomizedString() {
        StringBuilder stringBuilder = new StringBuilder("{");
        stringBuilder.append("\"queryText\":").append(dataSetId);
        stringBuilder.append("\"dataSetId\":").append(dataSetId);
        stringBuilder.append("\"modelIds\":").append(modelIds);
        stringBuilder.append(",\"params\":").append(params);
        stringBuilder.append(",\"cacheInfo\":").append(cacheInfo);
        stringBuilder.append(",\"mapMode\":").append(mapModeEnum);
        stringBuilder.append(",\"dataType\":").append(queryDataType);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
