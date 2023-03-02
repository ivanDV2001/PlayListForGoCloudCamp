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
public class APIClient { 
    private static Socket clientSocket;
    private static BufferedReader reader;
    public static BufferedReader in;
    public static BufferedWriter out; 
    public static String comand;
    public static String word = "go";
    
    public static void main(String[] args) {
        panelAPI panel = new panelAPI();
        panel.setVisible(true);
        try {
            try {
                clientSocket = new Socket("localhost", 8080);
                
                do {                
                    reader = new BufferedReader(new InputStreamReader(System.in));
                    in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));              
                    panel.setTextLabel("Press create for START");                
                    String serverWord = in.readLine(); 
                    panel.setTextLabel(serverWord);   
                } while (!word.equals("exit"));
                                              
            } finally {
                panel.setTextLabel("Client has been closed...");
                clientSocket.close();
                in.close();
                out.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }    
}     


