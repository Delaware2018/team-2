package team.two.goodwill;

import java.sql.*;
import java.net.*;
import java.io.*;
import java.net.*;
import java.sql.*;
import org.jsoup.Jsoup;



@org.springframework.stereotype.Service
public class Service {

    public static void main(String args[]) throws Exception {
        InetAddress addr;
        Socket sock = new Socket("localhost", 8080);
        addr = sock.getInetAddress();


    }


    public void setUser(User user){
        user.getName();
   }

    public void getZip(User user){
        user.getZipCode();
    }

    public void getNum(User user){
 user.getPhoneNumber();
    }


    public void setName(String name){
            //user.setName();

   }

}
