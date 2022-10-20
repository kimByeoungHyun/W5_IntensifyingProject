package com.example.loginlivesession2.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@Getter
public enum ErrorCode {
    NotFoundPost(HttpStatus.NOT_FOUND.value(), "P001", "게시물을 찾을 수 없습니다."),
    NotFoundUser(HttpStatus.NOT_FOUND.value(), "P002",  "작성자가 일치하지 않습니다."),
    NotFoundComment(HttpStatus.NOT_FOUND.value(), "P003", "댓글이 존재하지 않습니다."),
    NotFoundCommentUser(HttpStatus.NOT_FOUND.value(),  "P004", "댓글 작성자가 아닙니다.")
    ;

    private final int httpStatus;
    private final String errorCode;
    private final String message;

}