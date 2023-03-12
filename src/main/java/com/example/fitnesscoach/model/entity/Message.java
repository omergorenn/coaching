package com.example.fitnesscoach.model.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.w3c.dom.Text;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@Data
@Entity
@Table(name = "messages")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sender_id", nullable = false)
    private User senderID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "receiver_id", nullable = false)
    private Coach receiverID;

    @Column
    private String message_content;

    @Column(nullable = false)
    private LocalDateTime sentAt;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "ENUM('Unread', 'Read', 'Archived') DEFAULT 'Unread'")
    private String status;

    @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT false")
    private boolean senderNotification;

    @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT false")
    private boolean receiverNotification;

}
