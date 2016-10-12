/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.lambda.chat.domain;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

/**
 *
 * @author neftaly
 */
@Entity
public class Conversation extends ParentModel {

    @OneToOne
    private User sender;

    @OneToOne
    private User receiver;

    @Lob
    @Column(nullable = false)
    private List<String> payload;

    /**
     * @return the sender
     */
    public User getSender() {
        return sender;
    }

    /**
     * @param sender the sender to set
     */
    public void setSender(User sender) {
        this.sender = sender;
    }

    /**
     * @return the receiver
     */
    public User getReceiver() {
        return receiver;
    }

    /**
     * @param receiver the receiver to set
     */
    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    /**
     * @return the payload
     */
    public List<String> getPayload() {
        return payload;
    }

    /**
     * @param payload the payload to set
     */
    public void setPayload(List<String> payload) {
        this.payload = payload;
    }

}
