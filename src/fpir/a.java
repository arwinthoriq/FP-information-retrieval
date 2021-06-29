/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpir;

import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Vector;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class a extends javax.swing.JFrame {

    static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
    static DefaultTableModel model;
    /**
     * Creates new form a
     */
    public a() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidebar = new javax.swing.JPanel();
        kesimpulan = new javax.swing.JLabel();
        analisis1 = new javax.swing.JLabel();
        navbar = new javax.swing.JPanel();
        judul = new javax.swing.JLabel();
        form_input = new javax.swing.JTextField();
        tombol_simpan = new javax.swing.JButton();
        form_kesimpulan = new javax.swing.JTextField();
        akhir = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        goods = new javax.swing.JLabel();
        macan = new javax.swing.JLabel();
        singa = new javax.swing.JLabel();
        hates = new javax.swing.JLabel();
        goodhates = new javax.swing.JLabel();
        totalgood = new javax.swing.JLabel();
        totalhate = new javax.swing.JLabel();
        naive = new javax.swing.JLabel();
        hasil_ugood = new javax.swing.JLabel();
        hasil_uhate = new javax.swing.JLabel();
        svm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(875, 544));
        setResizable(false);

        sidebar.setBackground(new java.awt.Color(0, 102, 102));
        sidebar.setPreferredSize(new java.awt.Dimension(175, 166));

        kesimpulan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kesimpulan.setForeground(new java.awt.Color(255, 255, 255));
        kesimpulan.setText("Kesimpulan");
        kesimpulan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kesimpulan.setPreferredSize(new java.awt.Dimension(50, 17));
        kesimpulan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kesimpulanMouseClicked(evt);
            }
        });

        analisis1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        analisis1.setForeground(new java.awt.Color(255, 255, 255));
        analisis1.setText("Analisis");
        analisis1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        analisis1.setPreferredSize(new java.awt.Dimension(50, 17));
        analisis1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                analisis1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(analisis1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kesimpulan, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(analisis1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(kesimpulan, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(470, Short.MAX_VALUE))
        );

        navbar.setBackground(new java.awt.Color(0, 102, 102));
        navbar.setPreferredSize(new java.awt.Dimension(409, 44));

        judul.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        judul.setForeground(new java.awt.Color(255, 255, 255));
        judul.setText("ANALISIS SENTIMEN #HATESPEECH PADA TWITTER");

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navbarLayout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addComponent(judul)
                .addGap(272, 272, 272))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(judul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        tombol_simpan.setBackground(new java.awt.Color(255, 255, 255));
        tombol_simpan.setText("Simpan");
        tombol_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_simpanActionPerformed(evt);
            }
        });

        form_kesimpulan.setEditable(false);

        akhir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        goods.setText(" ");

        macan.setText("  ");

        singa.setText("  ");

        hates.setText(" ");
        hates.setPreferredSize(new java.awt.Dimension(49, 14));

        goodhates.setText(" ");
        goodhates.setPreferredSize(new java.awt.Dimension(49, 14));

        totalgood.setText(" ");

        totalhate.setText(" ");

        naive.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        naive.setText("Naive Bayes Classifier");

        hasil_ugood.setText("  ");

        hasil_uhate.setText(" ");

        svm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        svm.setText("Support Vector Machine");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(tombol_simpan)
                                    .addGap(128, 128, 128)
                                    .addComponent(akhir, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(form_input, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(form_kesimpulan, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(totalhate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(totalgood, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(singa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(goodhates, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                                    .addComponent(hates, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(goods, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(macan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(hasil_uhate, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hasil_ugood, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(naive)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(svm)
                        .addGap(72, 72, 72))))
            .addComponent(navbar, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(form_input, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tombol_simpan)
                            .addComponent(akhir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(naive, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(svm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(goods, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(goodhates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(macan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(singa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalgood)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hasil_ugood, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalhate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hasil_uhate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(form_kesimpulan, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kesimpulanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kesimpulanMouseClicked
        // TODO add your handling code here:
        form_kesimpulan.setVisible(true);
        form_input.setVisible(true);
        //form_input.setEditable(false);
        tombol_simpan.setVisible(false);

    }//GEN-LAST:event_kesimpulanMouseClicked

    private void tombol_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_simpanActionPerformed
        
        String good ="DATA/unigram_goodspeech.txt"; 
	String hate ="DATA/unigram_hatespeech.txt"; 
	String input ="DATA/input.txt"; 
	String cgood= null; 
	String chate= null; 
	String cinput= null; 
        
	String oj ="DATA/hasil_unigram_akhir.txt"; 
	String ok= null; 
        try {
            //  UNIGRAM - NAIVE BAYES
            File inputkosong = new File("DATA/input.txt"); 
            PrintWriter pkalnullkosong = new PrintWriter(new FileWriter(inputkosong, false));
            pkalnullkosong.println();
            
            File proseskosong = new File("DATA/proses_input_unigram.txt"); 
            PrintWriter prosesnullkosong = new PrintWriter(new FileWriter(proseskosong, false));
            prosesnullkosong.println();
            
            File unigram_awal = new File("DATA/hasil_unigram_awal.txt"); 
            PrintWriter prosesnullunigram_awal = new PrintWriter(new FileWriter(unigram_awal, false));
            prosesnullunigram_awal.println();
            
            File hasil_unigram_goodspeech = new File("DATA/hasil_unigram_goodspeech.txt"); 
            PrintWriter prhasil_unigram_goodspeech = new PrintWriter(new FileWriter(hasil_unigram_goodspeech, false));
            prhasil_unigram_goodspeech.println();
            
            File hasil_unigram_hatespeech = new File("DATA/hasil_unigram_hatespeech.txt"); 
            PrintWriter prhasil_unigram_hatespeech = new PrintWriter(new FileWriter(hasil_unigram_hatespeech, false));
            prhasil_unigram_hatespeech.println();
            
            String kalmat; 
            kalmat = form_input.getText(); 
            File datakal9 = new File("DATA/input.txt"); 
            PrintWriter pkal9 = new PrintWriter(new FileWriter(datakal9, true)); 
            pkal9.println(kalmat); 
            pkal9.close();
            
            cinput = new String(Files.readAllBytes(Paths.get(input)));
            String kecil9 = cinput.toLowerCase(); 
            String simbol9 = kecil9.replaceAll("[^\\p{L}\\s]", "");  //  \\p{M}\\p{N}\\p{P}\\p{Z}\\p{Cf}\\p{Cs}
            String[] fkal9 = simbol9.split("\\s+");
            
            cgood = new String(Files.readAllBytes(Paths.get(good)));
            chate = new String(Files.readAllBytes(Paths.get(hate)));
            for(String hukal9 : fkal9) { 
                boolean sapigood = cgood.contains(hukal9); 
                boolean sapihate = chate.contains(hukal9); 
                if (sapigood){ 
                    File datasapigood = new File("DATA/proses_input_unigram.txt"); 
                    PrintWriter prsapigood = new PrintWriter(new FileWriter(datasapigood, true)); 
                    prsapigood.println(hukal9); 
                    prsapigood.close(); 
                    // durung iso nge print
                    String textgood = "goodspeech"; 
                    File hasil_unigram_awal = new File("DATA/hasil_unigram_awal.txt"); 
                    PrintWriter prtextgood = new PrintWriter(new FileWriter(hasil_unigram_awal, true)); 
                    prtextgood.println(textgood);
                    prtextgood.close();
                    
                    File hasil_macan = new File("DATA/hasil_unigram_goodspeech.txt"); 
                    PrintWriter hasil_macangood = new PrintWriter(new FileWriter(hasil_macan, true)); 
                    hasil_macangood.println(textgood);
                    hasil_macangood.close();
                    
                    //BufferedReader listigood = new BufferedReader (new FileReader("DATA/hasil_unigram_awal.txt")); 
                    //boolean hasdigood = true;
                    //String lineigood; 
                    //Set<String> linesigood = new HashSet<String>(); 
                    //while ((lineigood = listigood.readLine()) != null) { 
                    //    if (linesigood.contains(lineigood)) { 
                    //        hasdigood = false; 
                    //    }
                    //    linesigood.add(lineigood);
                    //}
                    //if (hasdigood) { 
                    //    File dataindgood = new File("DATA/hasil_unigram_akhir.txt"); 
                    //    PrintWriter prinddataindgood = new PrintWriter(new FileWriter(dataindgood, false)); 
                    //    prinddataindgood.println(textgood);
                    //    prinddataindgood.close();  
                    //}
                    
                } else if (sapihate){ 
                    File datasapihate = new File("DATA/proses_input_unigram.txt"); 
                    PrintWriter prsapihate = new PrintWriter(new FileWriter(datasapihate, true)); 
                    prsapihate.println(hukal9); 
                    prsapihate.close(); 
                    // durung iso nge print
                    String texthate = "hatespeech"; 
                    File hasil_unigram_awal = new File("DATA/hasil_unigram_awal.txt"); 
                    PrintWriter prtexthate = new PrintWriter(new FileWriter(hasil_unigram_awal, true)); 
                    prtexthate.println(texthate); 
                    prtexthate.close();
                    
                    File hasil_singa = new File("DATA/hasil_unigram_hatespeech.txt"); 
                    PrintWriter hasil_singagood = new PrintWriter(new FileWriter(hasil_singa, true)); 
                    hasil_singagood.println(texthate);
                    hasil_singagood.close();
                    
                    //BufferedReader listihate = new BufferedReader (new FileReader("DATA/hasil_unigram_awal.txt")); 
                    //boolean hasdihate = true;
                    //String lineihate; 
                    //Set<String> linesihate = new HashSet<String>(); 
                    //while ((lineihate = listihate.readLine()) != null) { 
                    //    if (linesihate.contains(lineihate)) { 
                    //        hasdihate = false; 
                    //    }
                    //    linesihate.add(lineihate);
                    //}
                    //if (hasdihate) { 
                    //    File dataindhate = new File("DATA/hasil_unigram_akhir.txt"); 
                    //    PrintWriter prinddataindhate = new PrintWriter(new FileWriter(dataindhate, false)); 
                    //    prinddataindhate.println(texthate);
                    //    prinddataindhate.close();  
                    //}
                }
            } //for
            
            String olkjnj ="DATA/input.txt"; 
            String oijuiou = null; 
            oijuiou = new String(Files.readAllBytes(Paths.get(olkjnj)));
            String[] ukjmyhtrf = oijuiou.split("\\s+"); // bawah
            int esrfwe  = ukjmyhtrf.length; 
            int ewrwe = 0;
            if(esrfwe != ewrwe){
                naive.setVisible(true);
                svm.setVisible(true);
                String jgood ="DATA/unigram_goodspeech.txt"; 
                String pjgood= null; 
                pjgood = new String(Files.readAllBytes(Paths.get(jgood)));
                String[] opjgood = pjgood.split("\\s+"); // bawah
                int Barisjgood  = opjgood.length; 
                String jumlahBarisjgood  = Integer.toString(Barisjgood);
                goods.setText("Data Goodspeech = " + jumlahBarisjgood);

                String jhate ="DATA/unigram_hatespeech.txt"; 
                String pjhate= null; 
                pjhate = new String(Files.readAllBytes(Paths.get(jhate)));
                String[] opjhate = pjhate.split("\\s+"); // bawah
                int Barisjhate  = opjhate.length; 
                String jumlahBarisjhate  = Integer.toString(Barisjhate);
                hates.setText("Data Hatespeech = " + jumlahBarisjhate);

                int data_goodhate = Barisjgood + Barisjhate;
                String jumlahdata_goodhate  = Integer.toString(data_goodhate);
                goodhates.setText("Data Total = " + jumlahdata_goodhate);

               // HITUNG JUMLAH INPUT GOODSPEECH
                String macan1 ="DATA/hasil_unigram_goodspeech.txt"; 
                String macan2 = null; 
                macan2 = new String(Files.readAllBytes(Paths.get(macan1)));
                String[] macan3 = macan2.split("\\s+"); // bawah
                int macan4  = macan3.length; 
                String macan5  = Integer.toString(macan4);
                String kfmd ="goodspeech";
                boolean lkmkl = kfmd.contains(macan2); 
                if(!lkmkl){
                    macan.setText("Goodspeech Terdeteksi = " + macan5);
                }else {
                    macan.setText("Goodspeech Terdeteksi = 0");
                }
                 // HITUNG JUMLAH INPUT HATESPEECH
                String singa1 ="DATA/hasil_unigram_hatespeech.txt"; 
                String singa2 = null; 
                singa2 = new String(Files.readAllBytes(Paths.get(singa1)));
                String[] singa3 = singa2.split("\\s+"); // bawah
                int singa4  = singa3.length; 
                String singa5  = Integer.toString(singa4);
                String kfmdsinga ="hatespeech";
                boolean lkmklsinga = kfmdsinga.contains(singa2); // jika pake ini maka akibatnya kata hatespeech tidak akan terdeteksi
                if(!lkmklsinga){
                    singa.setText("Hatespeech Terdeteksi = " + singa5);
                }else {
                    singa.setText("Hatespeech Terdeteksi = 0");
                }
                double nbcgood1 = Barisjgood * macan4;
                double nbcgood2 = data_goodhate * Barisjgood;
                double nbcgood3 = nbcgood1 / nbcgood2;
                //String unigram_nbcgood  = Double.toString(nbcgood3);
                String u_nbcgood = String.format("%.10f",nbcgood3);
                if(!lkmkl){
                    totalgood.setText("Hasil Goodspeech = " + jumlahBarisjgood +" "+"/"+" "+ jumlahdata_goodhate +" "+"x"+" "+ macan5 +" "+"/"+" "+ jumlahBarisjgood );
                    hasil_ugood.setText("="+" "+ u_nbcgood);
                }else {
                    totalgood.setText("Hasil Goodspeech = ");
                    hasil_ugood.setText("="+" " );
                }
                double nbchate1 = Barisjhate * singa4;
                double nbchate2 = data_goodhate * Barisjhate;
                double nbchate3 = nbchate1 / nbchate2;
                //String unigram_nbchate  = Double.toString(nbchate3);
                String u_nbchate = String.format("%.10f",nbchate3);
                if(!lkmklsinga){
                    totalhate.setText("Hasil Hatespeech = " + jumlahBarisjhate +" "+"/"+" "+ jumlahdata_goodhate +" "+"x"+" "+ singa5 +" "+"/"+" "+ jumlahBarisjhate ); 
                    hasil_uhate.setText("="+" "+ u_nbchate);
                }else {
                    totalhate.setText("Hasil Hatespeech = ");
                    hasil_uhate.setText("="+" " );
                }

                    String cd ="DATA/hasil_unigram_awal.txt"; 
                    String cd2 = null; 
                    cd2 = new String(Files.readAllBytes(Paths.get(cd)));
                    String[] cd3 = cd2.split("\\s+"); // bawah
                    int cd4  = cd3.length; 
                    String cd5  = Integer.toString(cd4);
                    int cd1 = 1;

                 // HASIL PERBANINGAN
                 if(nbcgood3 > nbchate3) {
                    File dataindgood = new File("DATA/hasil_unigram_akhir.txt"); 
                    PrintWriter prinddataindgood = new PrintWriter(new FileWriter(dataindgood, false)); 
                    prinddataindgood.println("Goodspeech");
                    prinddataindgood.close();  
                 } else if(nbchate3 > nbcgood3) {
                    File dataindhate = new File("DATA/hasil_unigram_akhir.txt"); 
                    PrintWriter prinddataindhate = new PrintWriter(new FileWriter(dataindhate, false)); 
                    prinddataindhate.println("Hatespeech");
                    prinddataindhate.close();  
                 }else if(cd4 == cd1){ // jika hanya 1 kata yg di input
                    String cd6 ="DATA/hasil_unigram_awal.txt"; 
                    String cd7 = null; 
                    cd7 = new String(Files.readAllBytes(Paths.get(cd6)));
                    File cd8 = new File("DATA/hasil_unigram_akhir.txt"); 
                    PrintWriter cd9 = new PrintWriter(new FileWriter(cd8, false)); 
                    cd9.println(cd7);
                    cd9.close(); 
                 }else if(nbcgood3 == nbchate3) { // jika hasil nya imbang
                    File dataindno = new File("DATA/hasil_unigram_akhir.txt"); 
                    PrintWriter prinddataindno = new PrintWriter(new FileWriter(dataindno, false)); 
                    prinddataindno.println("Tidak ada hasil");
                    prinddataindno.close();  
                 }

                    ok = new String(Files.readAllBytes(Paths.get(oj)));
                    akhir.setText(ok);

                    //  BIGRAM - NAIVE BAYES
                    //String bigram ="DATA/unigram_hatespeech.txt"; 
                    //String pjhate= null; 
                    //pjhate = new String(Files.readAllBytes(Paths.get(jhate)));
            }//if
            
                  
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_tombol_simpanActionPerformed

    private void analisis1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_analisis1MouseClicked
        // TODO add your handling code here:
        form_input.setVisible(true);
        tombol_simpan.setVisible(true);
        form_kesimpulan.setVisible(false);
       // form_input.setEditable(true);
    }//GEN-LAST:event_analisis1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".contains(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold> 
        
        String data_mentah ="DATA/data_goodspeech.txt"; 
	String data_mentahhate ="DATA/data_hatespeech.txt"; 
	String stopword_list_tala ="DATA/stopwocrd_list_tala.txt"; 
	String cdata_mentah= null; 
	String cdata_mentahhate= null; 
	String cstopword_list_tala= null; 
	String nanas_mentah= null; 
        
	String tala ="DATA/stopword_list_tala.txt"; 
	String ctala= null; 
        try {
            
            File inputkosong = new File("DATA/input.txt"); 
            PrintWriter pkalnullkosong = new PrintWriter(new FileWriter(inputkosong, false));
            pkalnullkosong.println();
            
            //  UNIGRAM - PREPROCESSING - NAIVE BAYES
            File proseskosong = new File("DATA/proses_input_unigram.txt"); 
            PrintWriter prosesnullkosong = new PrintWriter(new FileWriter(proseskosong, false));
            prosesnullkosong.println();
            
            File unigram_awal = new File("DATA/hasil_unigram_awal.txt"); 
            PrintWriter prosesnullunigram_awal = new PrintWriter(new FileWriter(unigram_awal, false));
            prosesnullunigram_awal.println();
            
            // GOOD-SPEECH men set file input menjadi kosong
            File inputnull = new File("DATA/unigram_goodspeech_tanpa_contains.txt"); 
            PrintWriter pkalnull = new PrintWriter(new FileWriter(inputnull, false)); 
            pkalnull.println(); //print data
            cdata_mentah = new String(Files.readAllBytes(Paths.get(data_mentah))); 
            String kecili = cdata_mentah.toLowerCase(); 
            String simbol = kecili.replaceAll("[^\\p{L}\\s]", "");  //  \\p{M}\\p{N}\\p{P}\\p{Z}\\p{Cf}\\p{Cs}
            String[] fkal = simbol.split("\\s+"); 
            //cstopword_list_tala = new String(Files.readAllBytes(Paths.get(stopword_list_tala))); //yg eror pake stopword
            ctala = new String(Files.readAllBytes(Paths.get(tala)));
            for(String hukal : fkal) { 
             //  boolean ikan = hukal.contains(hukal); 
               boolean ikan = ctala.contains(hukal);  
               if (!ikan){ 
                File dataindonesia = new File("DATA/unigram_goodspeech_tanpa_contains.txt"); 
                PrintWriter prindonesia = new PrintWriter(new FileWriter(dataindonesia, true)); 
                prindonesia.println(hukal); 
                prindonesia.close();  
                }
            }
            
            // HATE-SPEECH men set file input menjadi kosong
            File inputnullhate = new File("DATA/unigram_hatespeech_tanpa_contains.txt"); 
            PrintWriter pkalnullhate = new PrintWriter(new FileWriter(inputnullhate, false)); 
            pkalnullhate.println(); //print data
            cdata_mentahhate = new String(Files.readAllBytes(Paths.get(data_mentahhate))); 
            String kecilihate = cdata_mentahhate.toLowerCase(); 
            String simbolhate = kecilihate.replaceAll("[^\\p{L}\\s]", "");  //  \\p{M}\\p{N}\\p{P}\\p{Z}\\p{Cf}\\p{Cs}
            String[] fkalhate = simbolhate.split("\\s+"); 
            //cstopword_list_tala = new String(Files.readAllBytes(Paths.get(stopword_list_tala)));
            ctala = new String(Files.readAllBytes(Paths.get(tala)));
            for(String hukalhate : fkalhate) { 
               boolean ikanhate = ctala.contains(hukalhate); 
               if (!ikanhate){ 
                File datahate = new File("DATA/unigram_hatespeech_tanpa_contains.txt"); 
                PrintWriter prhate = new PrintWriter(new FileWriter(datahate, true)); 
                prhate.println(hukalhate); 
                prhate.close(); 
                }
            }
            
            //  MENGHAPUS DATA YANG SAMA ANTARA unigram_goodspeech.txt DENGAN unigram_hatespeech.txt
            
            String z ="DATA/unigram_goodspeech_tanpa_contains.txt"; 
            String za= null; 
            za = new String(Files.readAllBytes(Paths.get(z)));
            String[] zaqbawah = za.split("\\s+"); // bawah
            String[] zaq = za.split("\\s+", 1); // datar
            
            
            String x ="DATA/unigram_hatespeech_tanpa_contains.txt"; 
            String xs= null; 
            xs = new String(Files.readAllBytes(Paths.get(x)));
            String[] xswbawah = xs.split("\\s+"); // bawah
            String[] xsw = xs.split("\\s+", 1);//datar
            
            //  goodspeech contains hatespeech = goospeech
            File bakarnul = new File("DATA/unigram_goodspeech.txt"); 
            PrintWriter pkabakarnul = new PrintWriter(new FileWriter(bakarnul, false)); 
            pkabakarnul.println(); 
            for(String siputgood : zaqbawah) {   // string : split
            boolean siputbakar = xs.contains(siputgood);   // bawah contains datar
                if(!siputbakar){
                    File zaq1 = new File("DATA/unigram_goodspeech.txt"); 
                    PrintWriter zaq10 = new PrintWriter(new FileWriter(zaq1, true)); 
                    zaq10.println(siputgood); 
                    zaq10.close();
                }
            }
            //  hatespeech contains goodspeech = hatespeech
            File gorengnul = new File("DATA/unigram_hatespeech.txt"); 
            PrintWriter pkagorengnul = new PrintWriter(new FileWriter(gorengnul, false)); 
            pkagorengnul.println(); 
            for(String siputhate : xswbawah) {   // string : split
            boolean siputgoreng = za.contains(siputhate);   // bawah contains datar
                if(!siputgoreng){
                    File xsw1 = new File("DATA/unigram_hatespeech.txt"); 
                    PrintWriter xsw10 = new PrintWriter(new FileWriter(xsw1, true)); 
                    xsw10.println(siputhate); 
                    xsw10.close();
                }
            }
            
            
            
            
            
            
             

        } catch (IOException ex) {
            Logger.getLogger(a.class.getName()).log(Level.SEVERE, null, ex);
        }
	
       
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new a().setVisible(true);
                form_kesimpulan.setVisible(false);
                naive.setVisible(false);
                svm.setVisible(false);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel akhir;
    private javax.swing.JLabel analisis1;
    private static javax.swing.JTextField form_input;
    private static javax.swing.JTextField form_kesimpulan;
    private javax.swing.JLabel goodhates;
    private javax.swing.JLabel goods;
    private javax.swing.JLabel hasil_ugood;
    private javax.swing.JLabel hasil_uhate;
    private javax.swing.JLabel hates;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel kesimpulan;
    private javax.swing.JLabel macan;
    private static javax.swing.JLabel naive;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel singa;
    private static javax.swing.JLabel svm;
    private static javax.swing.JButton tombol_simpan;
    private javax.swing.JLabel totalgood;
    private javax.swing.JLabel totalhate;
    // End of variables declaration//GEN-END:variables
}
