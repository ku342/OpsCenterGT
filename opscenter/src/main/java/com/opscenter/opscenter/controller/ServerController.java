package com.opscenter.opscenter.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.opscenter.opscenter.dto.ServerResponse;
import com.opscenter.opscenter.service.ServerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.opscenter.opscenter.dto.ServerRequest;
import jakarta.validation.Valid;

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


@PostMapping("/serverlist")
public ServerResponse addServer(@Valid @RequestBody ServerRequest serverRequest) {
    return serverService.addServer(serverRequest);
}

@DeleteMapping ("/serverlist/{id}")
public boolean deleteServer(@PathVariable Long id) {
    return serverService.deleteServer(id);

}



}