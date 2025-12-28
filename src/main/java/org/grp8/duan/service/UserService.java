package org.grp8.duan.service;

import org.grp8.duan.entity.Users;
import org.grp8.duan.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;


    public List<Users> findUserByName(String username) {
        List<Users> u = userRepo.findByFullNameContaining(username);
        if(u.isEmpty()){
            throw new RuntimeException("User not found");
        }
        return u;

    }

    public Users findByUserEmail(String userEmail){
        Users u = userRepo.findByEmail(userEmail);
        if(u == null){
            throw new RuntimeException("User not found");
        }
        return u;



    }



}
