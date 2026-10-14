package com.opscenter.opscenter.service;
import com.opscenter.opscenter.dto.ServerResponse;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.opscenter.opscenter.dto.ServerRequest;
import org.springframework.web.bind.annotation.RequestBody;
@Service 
public class ServerService {

    
    private final List<ServerResponse> servers = new ArrayList<>();
    private long nextId = 1;
    public List<ServerResponse> getServers() {
    return servers;}




public ServerResponse addServer(ServerRequest serverRequest) {
    ServerResponse newServer = new ServerResponse(nextId++, serverRequest.name(), serverRequest.host());
    servers.add(newServer);
    return newServer;

}


public boolean deleteServer(Long id) {
return servers.removeIf(server -> server.id() == id);
}


}