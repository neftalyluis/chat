/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.lambda.chat.service;

import java.util.List;
import mx.lambda.chat.domain.Conversation;
import mx.lambda.chat.domain.User;

/**
 *
 * @author neftaly
 */
public interface ConversationService {
    
    public List<Conversation> getAllConversationsFromUser(User u);

    public List<Conversation> getAllConversationsFromUserId(Long id);
    
}
