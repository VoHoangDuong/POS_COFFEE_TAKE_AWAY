package com.codegym.casestudy.serivce.user;
import com.codegym.casestudy.model.User;
import com.codegym.casestudy.serivce.IGeneralService;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserService extends IGeneralService<User>{
    Iterable<User> findAllByOrderByRole_id();
}