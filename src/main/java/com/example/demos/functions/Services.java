package com.example.demos.functions;


import com.example.demos.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demos.Repository.userrepository;



@Service
public class Services implements Servicesimpl {

@Autowired
private userrepository registereduser; //repository


    @Override
public void saveuserinfo(User user){    //method to save userinfo
    registereduser.save(user);
}


}



