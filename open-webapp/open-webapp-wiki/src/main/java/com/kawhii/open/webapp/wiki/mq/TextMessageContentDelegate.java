package com.kawhii.open.webapp.wiki.mq;


/**
 * @author Carl
 * @version 创建时间：2018/1/18
 * @since 1.0.0
 */
public class TextMessageContentDelegate {
    //收到消息时执行
    public void receiveMessage(String msg) {
        System.out.println("收到消息：" + msg);
    }
}
