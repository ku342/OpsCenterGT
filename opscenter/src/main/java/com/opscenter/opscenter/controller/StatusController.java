package com.opscenter.opscenter.controller;




import org.springframework.web.bind.annotation.RestController;
import com.opscenter.opscenter.dto.StatusResponse;
import com.opscenter.opscenter.service.StatusService;
    @RestController 


public class StatusController {
    private final StatusService statusService;

    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }

    public StatusResponse getStatus() {
        return statusService.getStatus();
    }


}
