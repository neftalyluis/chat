/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.lambda.chat.service;

import mx.lambda.chat.domain.User;
import mx.lambda.chat.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author neftaly
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public boolean createUser(String name, String mail, String password) {
        try {

            User u = new User();
            u.setEmail(mail);
            u.setName(name);
            u.setPassword(password);

            userDAO.save(u);

            return true;

        } catch (Exception e) {

            return false;
        }
    }

    @Override
    public boolean updateUser(User u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteUser(User u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
