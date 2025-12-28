package org.grp8.duan.repository;

import org.grp8.duan.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<Users,String> {
    Users findByFullName(String username);
    List<Users> findByFullNameContaining(String username);
    Users findByEmail(String email);
    Users findByPassword(String password);
    Users findByPhone(String phone);
    Users findByAddress(String address);


}
