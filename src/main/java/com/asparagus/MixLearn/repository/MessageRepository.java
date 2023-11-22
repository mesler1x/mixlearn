package com.asparagus.MixLearn.repository;

import com.asparagus.MixLearn.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
