package com.opscenter.opscenter.controller;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.opscenter.opscenter.dto.ServerResponse;
import com.opscenter.opscenter.service.ServerService;

@RestController 
public class ServerController {
    private final ServerService serverService;
    public ServerController(ServerService serverService) {
        this.serverService = serverService;
    }

@GetMapping("/serverlist")
public List<ServerResponse> getServers() {
    return serverService.getServers();
}


}
