package com.shc.test;

import java.io.BufferedReader;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TransClient {

    /**
    * @param args
    * @throws IOException 
    * @throws UnknownHostException 
    */
    public static void main(String[] args) throws UnknownHostException, IOException {
        /*需求：客户端获取从键盘输入小写字母，然后发送到服务端，转换成大写字母后再返回给客户端并打印；
        *思路：1.创建客户端socket对象，并制定服务端地址；
        *    2.获取键盘敲入的小写字母;
        *    3.发送到服务端；
        *    4.服务端读取后变为大写后返回给客户端并打印；
        *    5.我的ip是192.168.1.101
        */
        Socket socket = new Socket(InetAddress.getByName("192.168.1.247"),10002);
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        //PrintWriter pw = new PrintWriter(socket.getOutputStream());

        BufferedReader bufIn = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = null;
        while((line=bufr.readLine())!=null){    
            if("over".equals(line))
                break;
            bufw.write(line);
            bufw.flush();
            String str1 = bufIn.readLine();
            System.out.println(str1);
        }
        socket.close();
    }

}
