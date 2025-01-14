package com.pdk.eduhub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pdk.eduhub.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
