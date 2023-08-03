package pl.gm.chatapi.chat.database.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.gm.chatapi.chat.database.model.ChatMessageEntity;
import pl.gm.chatapi.chat.database.repository.ChatMessageRepository;

import java.util.List;

@RestController
@RequestMapping("/messages")
@Slf4j
public class DatabaseController {

    @Autowired
    private ChatMessageRepository repository;

    @GetMapping
    public List<ChatMessageEntity> getAllMessages() {
        return repository.findAll();
    }
}
