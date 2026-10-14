package com.opscenter.opscenter.service;

import org.springframework.stereotype.Service;

import com.opscenter.opscenter.dto.StatusResponse;

@Service 
public class StatusService{
    
    public StatusResponse getStatus() {
        return new StatusResponse("OpsCenter", "OK");
    }
}

