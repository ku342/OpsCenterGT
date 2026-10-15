package com.opscenter.opscenter.controller;
import com.opscenter.opscenter.service.MonitoringService;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
public class MonitoringController {
    private final MonitoringService monitoringService;

    public MonitoringController(MonitoringService monitoringService) {
        this.monitoringService = monitoringService;
    }

    @GetMapping("/monitor/test")
    public boolean testConnection(
        @RequestParam ("host")String host, 
        @RequestParam ("port")int port)
    {
        return monitoringService.isPortOpen(host, port);
    }
    
    @GetMapping("/serverlist/{id}/check") 
    public ResponseEntity<Boolean> checkServer(@PathVariable Long id) {
        Optional<Boolean> result = monitoringService.checkServer(id); 
        if(result.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        else {
            return ResponseEntity.ok(result.get());
        }
    }

}
