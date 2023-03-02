/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.musicplaylist;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.*;
import javax.swing.JFileChooser;


/**
 *
 * @author IvanBanan
 */
public class iFace extends javax.swing.JFrame {
    
    public iFace() {
        initComponents();
        addSongBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\imag\\190250.png"));
        pauseBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\imag\\262598.png"));
        prevBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\imag\\892666 1.png"));
        nextBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\imag\\892666.png"));
        playBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\imag\\png-transparent-youtube-play-button-play-button-symbol-icon-angle-triangle-teal.png"));
        muteTBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\imag\\2090371-200 1.png"));
        resetBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\imag\\image 3.png"));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addSongBtn = new javax.swing.JButton();
        pauseBtn = new javax.swing.JButton();
        prevBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        playBtn = new javax.swing.JButton();
        volumeSlider = new javax.swing.JSlider();
        jProgressBar1 = new javax.swing.JProgressBar();
        nameofsong = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        muteTBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        duration = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        musicListF = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addSongBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSongBtnActionPerformed(evt);
            }
        });

        pauseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseBtnActionPerformed(evt);
            }
        });

        prevBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevBtnActionPerformed(evt);
            }
        });

        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        playBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBtnActionPerformed(evt);
            }
        });

        nameofsong.setText("Name Song");

        statusLabel.setText("Status:");

        status.setText("status");

        muteTBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                muteTBtnMouseReleased(evt);
            }
        });

        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        duration.setText("00:00");

        musicListF.setColumns(20);
        musicListF.setRows(5);
        jScrollPane1.setViewportView(musicListF);

        jLabel1.setText("Duration:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameofsong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(statusLabel)
                                .addGap(18, 18, 18)
                                .addComponent(status)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(duration)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(prevBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(muteTBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(pauseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(playBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(addSongBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(volumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusLabel)
                    .addComponent(status)
                    .addComponent(duration)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameofsong)
                .addGap(26, 26, 26)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(prevBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(pauseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addSongBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nextBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(volumeSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(muteTBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addSongBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSongBtnActionPerformed
        addSong();
    }//GEN-LAST:event_addSongBtnActionPerformed

    private void playBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBtnActionPerformed
        playMusic();              
    }//GEN-LAST:event_playBtnActionPerformed

    private void pauseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseBtnActionPerformed
        stopMusic();
    }//GEN-LAST:event_pauseBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        reset();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void prevBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevBtnActionPerformed
        prevMusic();
    }//GEN-LAST:event_prevBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        nextMusic();
    }//GEN-LAST:event_nextBtnActionPerformed

    private void muteTBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_muteTBtnMouseReleased
        mute();
    }//GEN-LAST:event_muteTBtnMouseReleased

    public static void main(String args[]) { 
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(iFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
                new iFace().setVisible(true);
            }            
        });          
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSongBtn;
    private javax.swing.JLabel duration;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea musicListF;
    private javax.swing.JButton muteTBtn;
    private javax.swing.JLabel nameofsong;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton pauseBtn;
    private javax.swing.JButton playBtn;
    private javax.swing.JButton prevBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JLabel status;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JSlider volumeSlider;
    // End of variables declaration//GEN-END:variables
    
    private static Clip clip;
    private static File file;
    private static FloatControl vc;
    private static boolean isPlay;
    private static ArrayList<File> musicList = new ArrayList<>();
    private static int i = 0;
    private static int j = -1;
    private static AudioInputStream audioStream;
    
    private void createMusic() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException  {                
        audioStream = AudioSystem.getAudioInputStream(file);
        clip = AudioSystem.getClip();
        clip.open(audioStream);                
        
        durationSet(musicList.get(i), duration);
        
        jProgressBar1.setMaximum((int) clip.getMicrosecondLength()); 
        vc = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        vc.setValue(1);                 
        
        clip.addLineListener(NEXT  -> {
            if ( clip.getMicrosecondLength() == clip.getMicrosecondPosition() ) {
                nextMusic();    
            }
        });      
    }
    
    public void playMusic() { 
        if (!musicList.isEmpty()) {
            isPlay = true;
            nameofsong.setText(removeLastChar(file.getName()));
            status.setText("Play");
            clip.start();            
        } else { 
            nameofsong.setText("Playlist is Empty");            
        }
    }
    
    public void stopMusic() {
        if (isPlay) {
            isPlay = false;
            status.setText("Stop");
            clip.stop();
        } else {
            status.setText("Already stopped");
        }       
    }
    
    public void reset() {
        clip.setMicrosecondPosition(0);
    }
         
    private String removeLastChar(String str) { // Remove the file type for the beauty of the interface
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.substring(0, str.length() - 4);
    }
    
    public void nextMusic() {
        if (!musicList.isEmpty() && i < musicList.size()-1) {
            i++;
            file = musicList.get(i);
            clip.stop();
            
            try {
                createMusic();
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException ex) {
                Logger.getLogger(iFace.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            playMusic();
        } else {
            status.setText("Already the last track");
        }
    }
    
    public void prevMusic() {
        if (i == 0) {
            reset();
        }
        
        if (!musicList.isEmpty() && i != 0 && i <= musicList.size()) {
            i--;
            file = musicList.get(i);
            clip.stop();
            
            try {
                createMusic();
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException ex) {
                Logger.getLogger(iFace.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            playMusic();
        } 
    }
    
    private void durationSet(File file1,javax.swing.JLabel duration) throws LineUnavailableException, UnsupportedAudioFileException, IOException { // Setting the song duration        
        AudioInputStream audioStream1 = AudioSystem.getAudioInputStream(file1);
        Clip clip1 = AudioSystem.getClip();
        clip1.open(audioStream1);
        
        long timeM = clip1.getMicrosecondLength()/60000000;
        long timeS = clip1.getMicrosecondLength()/1000000-timeM*60;
                        
        duration.setText("" + timeM + ":" + timeS);
    }
    
    private String durationSet(File file1) throws UnsupportedAudioFileException, IOException, LineUnavailableException { // Setting the song duration (overload)
        AudioInputStream audioStream1 = AudioSystem.getAudioInputStream(file1);
        Clip clip1 = AudioSystem.getClip();
        clip1.open(audioStream1);
        
        long timeM = clip1.getMicrosecondLength()/60000000;
        long timeS = clip1.getMicrosecondLength()/1000000-timeM*60;
                        
        String s = ("" + timeM + ":" + timeS);
        return s;
    }
    
    public void addSong() {
        if (isPlay) {
            stopMusic();
        }
        
        j++;
        JFileChooser jfc = new JFileChooser("src\\main\\java\\musiclist");
        int UserChoice = jfc.showOpenDialog(iFace.this);
        
        if (UserChoice == JFileChooser.APPROVE_OPTION) {
            musicList.add(jfc.getSelectedFile());
            file = musicList.get(i);
        }
        if (UserChoice == JFileChooser.CANCEL_OPTION) {
            nameofsong.setText("No File Selected");
        }
        
        try { 
            createMusic(); 
            musicListF.setText( removeLastChar(musicListF.getText() + "\n" + musicList.get(j).getName()) + "        Duration: " + durationSet(musicList.get(j)));
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException ex) {
            Logger.getLogger(iFace.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void mute() { 
        if (vc.getValue() == 1) {
            muteTBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\imag\\Mute-Sound-PNG-Free-Download 1.png"));
            vc.setValue(-80);            
        } else {
            muteTBtn.setIcon(new javax.swing.ImageIcon("src\\main\\java\\imag\\2090371-200 1.png"));
            vc.setValue(1);                        
        }
    }        
}

