
# WebSocket Chatroom with Spring Boot and Docker Compose

A simple Spring Boot project with WebSocket support acting as a chatroom. Users can join the main channel and send real-time messages. The project is integrated with Maven, making dependency management easy.

## Technologies

- Spring Boot 3.1.2
- WebSocket
- Docker Compose

## Running the Application

1. Clone the repository:

2. Navigate to the docker directory.

3. Run the application using Docker Compose:

```
docker-compose up
```

4. Open your web browser and go to:
```
http://localhost:8080 - chat
http://localhost:8080/messages - return all messages from database as JSON.

```

## How to Use

- Enter your nickname and click "Start Chatting"
- Type messages in the text field and click "Send".

Messages will be visible to all users present on the channel.

## Additional Information

- The WebSocket server is configured in the WebSocketConfiguration class.
- The ChatMessage class is the chat message model, containing information about the content and sender.
- The ChatController handles WebSocket communication logic, including receiving and broadcasting messages.
```

Zaktualizowany opis zawiera informację o dodanym Docker Compose, który pozwala na uruchomienie aplikacji w kontenerach. Użytkownicy będą teraz mogli z łatwością uruchomić aplikację za pomocą komendy `docker-compose up`, co ułatwia proces wdrażania i testowania. Zachęcaj użytkowników do wypróbowania aplikacji w oparciu o nowe instrukcje.



