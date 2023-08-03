package pl.gm.chatapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import pl.gm.chatapi.chat.database.model.ChatMessageEntity;
import pl.gm.chatapi.chat.database.repository.ChatMessageRepository;

import java.util.List;

@SpringBootApplication
@Slf4j
public class ChatApiApplication {

	@Autowired
	private ChatMessageRepository repository;

	@EventListener(ApplicationReadyEvent.class)
	public void runAfterStartup() {
		List<ChatMessageEntity> allMessages = this.repository.findAll();
		log.info("Number of messages: " + allMessages.size());

		ChatMessageEntity message = new ChatMessageEntity();
		message.setId(1L);
		message.setContent("Hello");
		message.setSender("Greg");
		log.info("Saving new message...");
		this.repository.save(message);

		allMessages = this.repository.findAll();
		log.info("Number of messages: " + allMessages.size());
	}

	public static void main(String[] args) {
		SpringApplication.run(ChatApiApplication.class, args);
	}
}
