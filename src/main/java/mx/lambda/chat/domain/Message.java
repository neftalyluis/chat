/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.lambda.chat.domain;

import java.util.Date;

/**
 *
 * @author samas
 */
public class Message {
    
    private String content;
    private Date sent;

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the sent
     */
    public Date getSent() {
        return sent;
    }

    /**
     * @param sent the sent to set
     */
    public void setSent(Date sent) {
        this.sent = sent;
    }
    
}
