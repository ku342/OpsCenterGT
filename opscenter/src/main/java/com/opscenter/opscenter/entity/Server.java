package com.opscenter.opscenter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "servers")
public class Server {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String host;
    private int port;

public Server() {
}


public Server(String name, String host, int port) {
    this.name = name;
    this.host = host;
    this.port = port;
}

// Getters

public Long getId() {
    return id;
}

public String getName() {
    return name;
}

public String getHost() {
    return host;
}

public int getPort() {
    return port;
}

// Setters

public void setId(Long id) {
    this.id = id;
}

public void setName(String name) {
    this.name = name;
}

public void setHost(String host) {
    this.host = host;
}

public void setPort(int port) {
    this.port = port;
}
}
