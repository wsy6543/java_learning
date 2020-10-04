package com.lagou.model04.work.work05;

import java.io.Serializable;

public class Message  implements Serializable {
    private MessageType type;
    private String url;
    private String text;

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public Message() {
    }

    public Message(MessageType type, String url, String text) {
        this.type = type;
        this.url = url;
        this.text = text;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "type=" + type +
                ", url='" + url + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
