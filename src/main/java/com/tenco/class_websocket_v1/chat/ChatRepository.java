package com.tenco.class_websocket_v1.chat;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat, Integer> {
}
