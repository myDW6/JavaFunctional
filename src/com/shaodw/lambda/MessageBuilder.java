package com.shaodw.lambda;

@FunctionalInterface
public interface MessageBuilder {
    //定义一个拼接消息的抽象方法 返回拼接的消息
    public abstract String buildMessage();
}
