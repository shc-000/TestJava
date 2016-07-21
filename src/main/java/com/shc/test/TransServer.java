package com.shc.test;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TransServer {

    /**
    * @param args
    * @throws IOException 
    */
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10002);
        Socket socket = ss.accept();
        BufferedReader bufr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String str = null;
        while((str = bufr.readLine())!=null){
            bufw.write(str.toUpperCase());
            bufw.flush();
        }
        socket.close();
        ss.close();

    }

}
