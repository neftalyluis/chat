/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.lambda.chat.repository;

import mx.lambda.chat.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author neftaly
 */
public interface UserDAO extends CrudRepository<User, Long> {

    public User findById(Long id);

    public User findByEmail(String email);

    public User findByName(String name);

}
