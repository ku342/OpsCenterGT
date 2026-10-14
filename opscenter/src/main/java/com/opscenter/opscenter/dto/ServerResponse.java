package com.opscenter.opscenter.dto;

public record ServerResponse(
    long id,
    String name,
    String host,
    int port
){}


