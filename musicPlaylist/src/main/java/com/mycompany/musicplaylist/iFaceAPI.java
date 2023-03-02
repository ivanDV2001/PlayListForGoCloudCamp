/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicplaylist;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.*;

/**
 *
 * @author IvanBanan
 */
public class iFaceAPI { 
    
    private static Socket clientSocket;
    private static ServerSocket server;
    private static BufferedReader in;
    private static BufferedWriter out;
    private static String word;
    private static iFace plaer = new iFace();
    
    public static void main(String[] args) throws InterruptedException {
        
        try {
            try  {
                server = new ServerSocket(8080);
                System.out.println("Server started!");
                clientSocket = server.accept();
                do {                        
                    in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                    word = in.readLine();
                    
                    if (word.equals("c")) {
                        plaer.setVisible(true);
                    }
                    if (word.equals("a")) {
                        plaer.addSong();
                    }
                    if (word.equals("s")) {
                        plaer.stopMusic();
                    }
                    if (word.equals("g")) {
                        plaer.playMusic();
                    }
                    if (word.equals("p")) {
                        plaer.prevMusic();
                    }
                    if (word.equals("n")) {
                        plaer.nextMusic();
                    }
                    
                } 
                while (!word.equals("exit"));
                plaer.stopMusic();
                plaer.setVisible(false);
                clientSocket.close();                
                in.close();
                out.close();
            } finally {
                System.out.println("Server closed!");
                    server.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }   
}
