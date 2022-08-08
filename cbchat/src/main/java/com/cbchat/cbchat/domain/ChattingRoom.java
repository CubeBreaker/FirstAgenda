package com.cbchat.cbchat.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChattingRoom {

    private Long id;

    private List<ChattingMessage> chattingMessages;

    private LocalDateTime createdTime;
}
