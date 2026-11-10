package com.tenco.class_websocket_v1.sse;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "chat_tb")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String msg;

    @Builder
    public Chat(String msg) {
        this.msg = msg;
    }
}
