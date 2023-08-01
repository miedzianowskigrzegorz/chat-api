# WebSocket Chatroom with Spring Boot

A simple Spring Boot project with WebSocket support acting as a chatroom. Users can join the main channel and send real-time messages. The project is integrated with Maven, making dependency management easy.

## Technologies

- Spring Boot 3.1.2
- WebSocket

## Running the Application

1. Clone the repository:

2. Run the application:

```
mvn spring-boot:run
```

3. Open your web browser and go to:
```
http://localhost:8080
```

## How to Use

- Navigate to the main channel.
- Enter your nickname and click "Start Chatting"
- Type messages in the text field and click "Send".

Messages will be visible to all users present on the channel.

## Additional Information

- The WebSocket server is configured in the WebSocketConfiguration class.
- The ChatMessage class is the chat message model, containing information about the content and sender.
- The ChatController handles WebSocket communication logic, including receiving and broadcasting messages.




