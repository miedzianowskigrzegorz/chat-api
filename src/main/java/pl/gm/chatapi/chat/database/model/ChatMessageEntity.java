package pl.gm.chatapi.chat.database.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "messages")
@Data
public class ChatMessageEntity {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "sender", nullable = false)
    private String sender;
}
