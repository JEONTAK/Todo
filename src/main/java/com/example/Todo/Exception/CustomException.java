package com.example.Todo.Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CustomException extends RuntimeException {
    private final ErrorCode errorCode;
}
