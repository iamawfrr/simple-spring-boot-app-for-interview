package com.ndev.ssbafi.user.dao.repository;

import com.ndev.ssbafi.user.dao.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
