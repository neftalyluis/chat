/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.lambda.chat.repository;

import java.util.List;
import mx.lambda.chat.domain.Conversation;
import mx.lambda.chat.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author neftaly
 */
public interface ConversationDAO extends CrudRepository<Conversation, Long> {

    public List<Conversation> findBySender(User sender);

    public List<Conversation> findByReceiver(User receiver);

}
