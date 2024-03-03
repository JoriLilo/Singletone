package SINGELTONE;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Create a singleton Servers of lazy type. This singleton stores the list of servers (as String). Implement the following functionalities:
//adding a server to the list
//a method adding the server to the list should return boolean (true if the server has been added to the list, false if it's otherwise)
//adding is possible, if its name starts from http or https
//adding a duplicated name is impossible.
//downloading a list of servers, that names start from http.
//downloading a list of servers, that names start from https.





public class ServerSingeleton {
    private static ServerSingeleton instance;

    private static ServerSingeleton servers;



    public synchronized static ServerSingeleton getInstance(){
        if(instance== null){
            instance= new ServerSingeleton();
        }
        return instance;
    }

    public synchronized  boolean addServer(String server) {
              if (server == null || server.isEmpty()) {
            return false;
        }
        if (server.contains(server)) {
            return false;
        }
        if (!server.startsWith("http") && !server.startsWith("https")) {
                        return false;
            }
               servers.(server);
                return true;
           }



    public synchronized List<String> getServersThatStartWithHTTP() {
               return servers.stream()
                        .filter(server -> server.startsWith("http"))
                .collect(Collectors.toList());
           }
    public synchronized List<String> getServersThatStartWithHTTPS() {
               return servers.stream()
                        .filter(server -> server.startsWith("https"))
                .collect(Collectors.toList());
           }
}
