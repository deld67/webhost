package ru.geekbrains.preexaml6.client;


import java.io.IOException;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class NetworkClient {
    public static void main(String[] args) {
        System.out.println("Send GET");
        SendGetRequest();
    }

    public static void SendGetRequest() {
        try {
            Socket socket = new Socket( "localhost", 8080 );
            StringBuilder output = new StringBuilder();
            output.append( "GET /?name=Victor HTTP/1.1" ).append( "\r\n" );
            output.append( "Host: " ).append( "localhost:8080" ).append( "\r\n" );
            output.append( "User-Agent: " ).append( "Mozilla/5.0 (Windows NT 6.1; rv:18.0) Gecko/20100101 Firefox/18.0" ).append( "\r\n" );
            output.append( "Accept: " ).append( "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8 " ).append( "\r\n" );
            output.append( "Accept-Language: " ).append( "ru-RU,ru;q=0.8,en-US;q=0.5,en;q=0.3" ).append( "\r\n" );
            output.append( "Accept-Encoding: " ).append( "gzip, deflate" ).append( "\r\n" );
            output.append( "Cookie: " ).append( "wp-settings" ).append( "\r\n" );
            output.append( "Connection: " ).append( "keep-alive" ).append( "\r\n" );
            output.append( "\r\n" );

            socket.getOutputStream().write( output.toString().getBytes( StandardCharsets.UTF_8 ) );
            socket.getOutputStream().flush();
            socket.getOutputStream().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sendPostRequest(){
        try {
            Socket socket = new Socket( "localhost", 8080 );
            StringBuilder output = new StringBuilder();
            output.append( "POST / HTTP/1.1" ).append( "\r\n" );
            output.append( "Host: " ).append( "localhost:8080" ).append( "\r\n" );
            output.append( "Cookie: " ).append( "income=1" ).append( "\r\n" );
            output.append( "Content-Type: " ).append( "text/plain;charset=UTF-8" ).append( "\r\n" );
            output.append( "Content-Length: " ).append( "35" ).append( "\r\n" );
            output.append( "\r\n" );
            output.append("name=Dima");
            socket.getOutputStream().write( output.toString().getBytes( StandardCharsets.UTF_8 ) );
            socket.getOutputStream().flush();
            socket.getOutputStream().close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
