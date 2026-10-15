package com.opscenter.opscenter.service;
import java.net.Socket;
import java.util.Optional;
import java.net.InetSocketAddress;
import java.io.IOException;
import org.springframework.stereotype.Service;
import com.opscenter.opscenter.dto.ServerResponse;

@Service 
public class MonitoringService {
    private final ServerService serverService;

public MonitoringService(ServerService serverService) {
    this.serverService = serverService;
}


    public boolean isPortOpen(String host, int port) {
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress(host,port),2000);
            return true;
        }
        catch (IOException e) {
            return false;
        }
    }

public Optional<Boolean> checkServer(long id) {

    Optional<ServerResponse> result = serverService.findServerById(id);

    if (result.isEmpty()) {
        return Optional.empty();
    }
    else {
        ServerResponse server = result.get();

        boolean available = isPortOpen(server.host(), server.port());

        return Optional.of(available);
    }
}





} // fin de la clase MonitoringService
