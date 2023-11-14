package com.medium.machadoah.userapi.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter @Setter
public class StandardError {
    private LocalDateTime localDateTime;
    private String error;
    private Integer status;
    private String path;
}
