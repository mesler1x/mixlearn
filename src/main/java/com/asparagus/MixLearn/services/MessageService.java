package com.asparagus.MixLearn.services;

import com.asparagus.MixLearn.model.Message;
import com.asparagus.MixLearn.model.User;
import com.asparagus.MixLearn.repository.MessageRepository;
import com.asparagus.MixLearn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class MessageService {
    private final MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public List<Message> findAll() {
        return messageRepository.findAll();
    }

    public Optional<Message> findOne(Long id) {
        Optional<Message> foundMessage = messageRepository.findById(id);
        return foundMessage;
    }

    @Transactional
    public Message save(Message message){
        return messageRepository.save(message);
    }
}
