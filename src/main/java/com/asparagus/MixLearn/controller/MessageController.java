package com.asparagus.MixLearn.controller;

import com.asparagus.MixLearn.exception.MessageNotFoundException;
import com.asparagus.MixLearn.exception.UserNotFoundException;
import com.asparagus.MixLearn.model.Message;
import com.asparagus.MixLearn.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:5173/")
public class MessageController {
    @Autowired
    private MessageRepository messageRepository;

    @PostMapping("/message")
    Message newMessage(@RequestBody Message message){
        return messageRepository.save(message);
    }

    @GetMapping("/message/{id}")
    Message messageById(@PathVariable Long id){
        return messageRepository.findById(id).orElseThrow(()->new MessageNotFoundException(id));
    }
}
