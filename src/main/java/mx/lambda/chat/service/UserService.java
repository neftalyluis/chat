/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.lambda.chat.service;

import mx.lambda.chat.domain.User;

/**
 *
 * @author neftaly
 */
public interface UserService {
    
    public boolean createUser(String name, String mail, String password);
    
    public boolean updateUser(User u);
    
    public boolean deleteUser(User u);
    
}
