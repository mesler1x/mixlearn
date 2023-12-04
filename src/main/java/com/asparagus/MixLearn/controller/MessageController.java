package com.asparagus.MixLearn.controller;

import com.asparagus.MixLearn.exception.MessageNotFoundException;
import com.asparagus.MixLearn.model.Message;
import com.asparagus.MixLearn.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173/")
public class MessageController {

    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/message")
    Message newMessage(@RequestBody Message message){
        return messageService.save(message);
    }

    @GetMapping("/message/{id}")
    Message messageById(@PathVariable Long id){
        return messageService.findOne(id).orElseThrow(()->new MessageNotFoundException(id));
    }

    @GetMapping("/messages")
    List<Message> messageList(){
<<<<<<< Updated upstream
        return messageService.findAll();
    }


=======
        return messageRepository.findAll();
    }
>>>>>>> Stashed changes
}
