package com.kevin.springmq.rabbitmqcommon.enums;

import lombok.Getter;

/**
 * @ClassName: TopicRouteEnum
 * @Description: 消息队列topic交换路由key配置枚举
 * @Author: Kevin
 * @Date: 2018/8/15 17:57
 */
@Getter
public enum TopicRouteEnum {

    /**
     * 测试消息 topic路由key配置
     */
    TOPIC_MSG_ROUTE("testmq.msg.topic.all");

    private String topicRouteKey;

    TopicRouteEnum(String topicRouteKey) {
        this.topicRouteKey = topicRouteKey;
    }


}
