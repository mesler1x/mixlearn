package com.asparagus.MixLearn.repository;

import com.asparagus.MixLearn.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
