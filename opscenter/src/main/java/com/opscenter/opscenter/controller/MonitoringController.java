package com.opscenter.opscenter.controller;
import com.opscenter.opscenter.service.MonitoringService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
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
    


}
