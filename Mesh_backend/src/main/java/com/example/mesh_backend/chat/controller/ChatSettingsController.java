package com.example.mesh_backend.chat.controller;

import com.example.mesh_backend.chat.dto.request.ChatSettingsUpdateRequest;
import com.example.mesh_backend.chat.dto.response.ChatSettingsResponse;
import com.example.mesh_backend.chat.service.ChatSettingsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/v1/chat/settings")
public class ChatSettingsController {

    private final ChatSettingsService chatSettingsService;


    // 채팅방 설정 수정
    @PatchMapping("/{chatRoomId}")
    public ResponseEntity<ChatSettingsResponse> updateChatSettings(
            @PathVariable("chatRoomId") Long chatRoomId,
            @RequestBody ChatSettingsUpdateRequest request) {
        ChatSettingsResponse updatedSettings = chatSettingsService.updateChatSettings(chatRoomId, request);
        return ResponseEntity.ok(updatedSettings);
    }


    // 채팅방 설정 조회
    @GetMapping("/{chatRoomId}")
    public ResponseEntity<ChatSettingsResponse> getChatSettings(  @PathVariable("chatRoomId") Long chatRoomId) {
        ChatSettingsResponse settings = chatSettingsService.getChatSettings(chatRoomId);
        return ResponseEntity.ok(settings);
    }
}