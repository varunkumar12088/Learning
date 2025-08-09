package com.learning.domain;

import lombok.Data;

import java.util.Map;

@Data
public class Response {

    private String fullName;
    private String message;
    private Map<String, String> instance;
    private Long epoch;
}
