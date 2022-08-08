package com.cbchat.cbchat.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChattingMessage {

    private Long id;

    private String message;

    private LocalDateTime createdTime;
}
