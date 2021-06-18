package com.mqex.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = Message.class)

public class Message {
    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    String messageText;
    Long messageId;

    public Message(Long messageId, String messageText) {
        this.messageId = messageId;
        this.messageText = messageText;
    }

    public Message() {
    }
    @Override
    public String toString() {
        return "Message [messageText=" + messageText + ", messageId=" + messageId + "]";
    }

}
