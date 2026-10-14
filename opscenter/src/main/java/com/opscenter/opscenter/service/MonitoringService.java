package com.opscenter.opscenter.service;
import java.net.Socket;
import java.net.InetSocketAddress;
import java.io.IOException;
import org.springframework.stereotype.Service;

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









} // fin de la clase MonitoringService
