//User_Repository

package com.vaibhav.repository;
import java.io.Serializable;


import org.springframework.data.repository.CrudRepository;

import com.vaibhav.entity.UserRegistration;

public interface UserRepository extends CrudRepository <UserRegistration, Serializable> {

}
