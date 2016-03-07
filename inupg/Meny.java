/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inupg;
import java.util.*;
import static javax.swing.JOptionPane.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author Jonas Lennesten
 * @author Christian Hansson
 */
public class Meny extends javax.swing.JFrame {
    Connection c;

    /** Creates new form Meny */
    public Meny(Connection c) {
        this.c = c;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addFrame = new javax.swing.JFrame();
        fornamnText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        efternamnText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        birthText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        medlemText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lagText = new javax.swing.JTextField();
        laggTillKnapp = new javax.swing.JButton();
        avbrytAddframe = new javax.swing.JButton();
        playerBox = new javax.swing.JCheckBox();
        coachBox = new javax.swing.JCheckBox();
        parentBox = new javax.swing.JCheckBox();
        manRadioButton = new javax.swing.JRadioButton();
        kvinnaRadioButton = new javax.swing.JRadioButton();
        idText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        roleFrame = new javax.swing.JFrame();
        rolePlayer = new javax.swing.JCheckBox();
        roleCoach = new javax.swing.JCheckBox();
        roleParent = new javax.swing.JCheckBox();
        jButton11 = new javax.swing.JButton();
        roleId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textrutan = new javax.swing.JTextArea();
        jButton10 = new javax.swing.JButton();

        addFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addFrame.setMinimumSize(new java.awt.Dimension(480, 480));
        addFrame.setResizable(false);

        jLabel1.setText("Fornamn");

        jLabel2.setText("Efternamn");

        jLabel3.setText("Gender");

        jLabel4.setText("Date of Birth (YYYY-MM-DD)");

        jLabel5.setText("Date of membership (YYYY-MM-DD)");

        jLabel6.setText("Roll");

        jLabel7.setText("Lag");

        laggTillKnapp.setText("Lägg till");
        laggTillKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laggTillKnappActionPerformed(evt);
            }
        });

        avbrytAddframe.setText("Avbryt");
        avbrytAddframe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avbrytAddframeActionPerformed(evt);
            }
        });

        playerBox.setText("Player");

        coachBox.setText("Coach");

        parentBox.setText("Parent");

        buttonGroup1.add(manRadioButton);
        manRadioButton.setText("Man");

        buttonGroup1.add(kvinnaRadioButton);
        kvinnaRadioButton.setText("Woman");

        jLabel8.setText("ID");

        javax.swing.GroupLayout addFrameLayout = new javax.swing.GroupLayout(addFrame.getContentPane());
        addFrame.getContentPane().setLayout(addFrameLayout);
        addFrameLayout.setHorizontalGroup(
            addFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addFrameLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(addFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(addFrameLayout.createSequentialGroup()
                        .addComponent(playerBox)
                        .addGap(101, 101, 101)
                        .addComponent(coachBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(parentBox))
                    .addGroup(addFrameLayout.createSequentialGroup()
                        .addComponent(laggTillKnapp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                        .addComponent(avbrytAddframe))
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(fornamnText)
                    .addComponent(efternamnText)
                    .addComponent(birthText)
                    .addComponent(medlemText)
                    .addComponent(lagText)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addFrameLayout.createSequentialGroup()
                        .addGroup(addFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addFrameLayout.createSequentialGroup()
                                .addComponent(manRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(kvinnaRadioButton))
                            .addComponent(jLabel3))
                        .addGap(92, 92, 92)
                        .addGroup(addFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(idText))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        addFrameLayout.setVerticalGroup(
            addFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fornamnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(efternamnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manRadioButton)
                    .addComponent(kvinnaRadioButton)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(birthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medlemText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerBox)
                    .addComponent(coachBox)
                    .addComponent(parentBox))
                .addGap(7, 7, 7)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lagText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(addFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laggTillKnapp)
                    .addComponent(avbrytAddframe))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        roleFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        roleFrame.setMinimumSize(new java.awt.Dimension(339, 180));
        roleFrame.setResizable(false);

        rolePlayer.setText("Player");

        roleCoach.setText("Coach");

        roleParent.setText("Parent");
        roleParent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleParentActionPerformed(evt);
            }
        });

        jButton11.setText("Ändra");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        roleId.setText("jTextField1");

        jLabel9.setText("Ange ID:et du vill ändra");

        javax.swing.GroupLayout roleFrameLayout = new javax.swing.GroupLayout(roleFrame.getContentPane());
        roleFrame.getContentPane().setLayout(roleFrameLayout);
        roleFrameLayout.setHorizontalGroup(
            roleFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roleFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roleFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roleFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(roleFrameLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(roleFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(roleId))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(roleFrameLayout.createSequentialGroup()
                            .addGap(235, 235, 235)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(roleFrameLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(rolePlayer)
                        .addGap(60, 60, 60)
                        .addComponent(roleCoach)
                        .addGap(65, 65, 65)
                        .addComponent(roleParent)
                        .addGap(37, 37, 37))))
        );
        roleFrameLayout.setVerticalGroup(
            roleFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roleFrameLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roleId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(roleFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rolePlayer)
                    .addComponent(roleCoach)
                    .addComponent(roleParent))
                .addGap(38, 38, 38)
                .addComponent(jButton11)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(620, 400));
        setMinimumSize(new java.awt.Dimension(620, 400));
        setResizable(false);

        jButton2.setText("Sök ledare");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Sortera: Namn");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Sortera: Id");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Lista efter lag");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Avaktivera medlem");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Ändra roll");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Ta bort medlem");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Lägg till medlem");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton1.setText("Sök medlem");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        textrutan.setColumns(20);
        textrutan.setRows(5);
        jScrollPane1.setViewportView(textrutan);

        jButton10.setText("Aktivera medlem");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton7)
                            .addComponent(jButton8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        textrutan.setText(null);         
        try {
            boolean tomtSvar = false;
            String anrop = showInputDialog("Skriv efternamn på medlemmen du vill hitta:");
            ResultSet rs = Metoder.sokMedlem(anrop, c);

            ResultSetMetaData rsmd = rs.getMetaData();

            int numberOfColumns = rsmd.getColumnCount();

 /*           for (int i = 1; i <= numberOfColumns; i++) {
                if (i > 1) textrutan.append(",  ");
                String columnName = rsmd.getColumnName(i);
                textrutan.append(columnName);
            }*/
            textrutan.append("");
            
            while (rs.next()) {
                tomtSvar=true;
                for (int i = 1; i <= numberOfColumns; i++) {
                    if (i > 1) textrutan.append(",  ");
                    String columnValue = rs.getString(i);
                    textrutan.append(columnValue);
                }
                textrutan.append("\n");
            }
            if(!tomtSvar){
                textrutan.append("Vi hittade inget i databasen \n");
                textrutan.append("Testa igen, glöm ej versaler\n");
            }

            

        }
        catch (SQLException a){
           
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        textrutan.setText(null);         
        try {
            boolean tomtSvar = false;
            String anrop = showInputDialog("Skriv lagnamnet för de ledarna du vill hitta:");
            ResultSet rs = Metoder.sokLedare(anrop, c);

            ResultSetMetaData rsmd = rs.getMetaData();

            int numberOfColumns = rsmd.getColumnCount();


            textrutan.append("");
            
            while (rs.next()) {
                tomtSvar=true;
                for (int i = 1; i <= numberOfColumns; i++) {
                    if (i > 1) textrutan.append(",  ");
                    String columnValue = rs.getString(i);
                    textrutan.append(columnValue);
                }
                textrutan.append("\n");
            }
            if(!tomtSvar){
                textrutan.append("Vi hittade inget i databasen \n");
                textrutan.append("Testa igen, glöm ej versaler\n");
            }

            

        }
        catch (SQLException a){
           
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        textrutan.setText(null);                 
        try {
            boolean tomtSvar = false;

            ResultSet rs = Metoder.sortMedlem(c);

            ResultSetMetaData rsmd = rs.getMetaData();

            int numberOfColumns = rsmd.getColumnCount();
            textrutan.append("");
           
            while (rs.next()) {
                tomtSvar=true;
                for (int i = 1; i <= numberOfColumns; i++) {
                    if (i > 1) textrutan.append(",  ");
                    String columnValue = rs.getString(i);
                    textrutan.append(columnValue);
                }
                textrutan.append("\n");
            }
            if(!tomtSvar){
                textrutan.append("Vi hittade inget i databasen \n");
                textrutan.append("Testa igen, glöm ej versaler\n");
            }

            

        }
        catch (SQLException a){
           
        }  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        textrutan.setText(null);         
        try {
            boolean tomtSvar = false;

            ResultSet rs = Metoder.sortId(c);

            ResultSetMetaData rsmd = rs.getMetaData();

            int numberOfColumns = rsmd.getColumnCount();
            textrutan.append("");
           
            while (rs.next()) {
                tomtSvar=true;
                for (int i = 1; i <= numberOfColumns; i++) {
                    if (i > 1) textrutan.append(",  ");
                    String columnValue = rs.getString(i);
                    textrutan.append(columnValue);
                }
                textrutan.append("\n");
            }
            if(!tomtSvar){
                textrutan.append("Vi hittade inget i databasen \n");
                textrutan.append("Testa igen, glöm ej versaler\n");
            }

            

        }
        catch (SQLException a){
           
        }  
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        textrutan.setText(null); 
        try {
            boolean tomtSvar = false;

            ResultSet rs = Metoder.lagSpelare(c);
            ResultSet rs2 = Metoder.lagUtanSpelare(c);
            
            ResultSetMetaData rsmd = rs.getMetaData();
            ResultSetMetaData rsmd2 = rs2.getMetaData();

            int numberOfColumns = rsmd.getColumnCount();
            int numberOfColumns2 =rsmd2.getColumnCount();
            textrutan.append("");
           
            while (rs.next()) {
                tomtSvar=true;
                for (int i = 1; i <= numberOfColumns; i++) {
                    if (i > 1) textrutan.append(",  ");
                    String columnValue = rs.getString(i);
                    textrutan.append(columnValue);
                }
                textrutan.append("\n");
            }
                textrutan.append("Lag utan spelare: \n");
            while (rs2.next()) {
                tomtSvar=true;
                for (int i = 1; i <= numberOfColumns2; i++) {
                    if (i > 1) textrutan.append(",  ");
                    String columnValue = rs2.getString(i);
                    textrutan.append(columnValue);
                }
                textrutan.append("\n");
            }
            if(!tomtSvar){
                textrutan.append("Vi hittade inget i databasen \n");
                textrutan.append("Testa igen, glöm ej versaler\n");
            }

            

        }
        catch (SQLException a){
           
        }
        
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         textrutan.setText(null);         
        try {
            
            String anrop = showInputDialog("Skriv ID:et på den medlem du vill ta bort:");
            Metoder.deleteMedlem(anrop, c);
            textrutan.append("Om du skrev rätt, så är medlemmen borttagen.");
         
        }
        catch (Exception a){
           textrutan.append("Du skrev antingen inte in något");
        
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        textrutan.setText(null);         
        try {
            boolean tomtSvar = false;
            String anrop = showInputDialog("Skriv in Id:et på den person du vill avaktivera:");
            Metoder.avaktiveraMedlem(anrop, c);
            textrutan.append("Om du skrev rätt, så är medlemmen avaktiverad.");
         
        }
        catch (Exception a){
           textrutan.append("Du skrev antagligen inte in något");
        
        }      
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
                textrutan.setText(null);         
        try {
            boolean tomtSvar = false;
            String anrop = showInputDialog("Skriv in Id:et på den person du vill avaktivera:");
            Metoder.aktiveraMedlem(anrop, c);
            textrutan.append("Om du skrev rätt, så är medlemmen avaktiverad.");
         
        }
        catch (Exception a){
           textrutan.append("Du skrev antagligen inte in något");
        
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        addFrame.setVisible(true);
        fornamnText.setText("");
        efternamnText.setText("");
        idText.setText("");
        medlemText.setText("");
        birthText.setText("");
        lagText.setText("");
        buttonGroup1.clearSelection();
        playerBox.setSelected(false);
        coachBox.setSelected(false);
        parentBox.setSelected(false);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void avbrytAddframeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avbrytAddframeActionPerformed
        addFrame.dispose();
        //Något kommando för att ta bort redan inskriven text
// TODO add your handling code here:
    }//GEN-LAST:event_avbrytAddframeActionPerformed

    private void laggTillKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laggTillKnappActionPerformed
    textrutan.setText(null);
    String gen;
    String role;
    String kollaId = idText.getText();
    boolean b = Metoder.checkId(kollaId, c);

        if(b==true || lagText.getText().equals("") || medlemText.getText().equals("") || idText.getText().equals("") || fornamnText.getText().equals("") || efternamnText.getText().equals("") || birthText.getText().equals("") || (manRadioButton.isSelected()==false && kvinnaRadioButton.isSelected()==false) || (playerBox.isSelected()==false && coachBox.isSelected()==false && parentBox.isSelected()==false)){
            if(b==true){
                showMessageDialog(null, "Det finns redan ett sådant ID, var god försök igen.", "Varning!",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
            showMessageDialog(null, "Det finns tomma fält, försök igen.", "Varning!",JOptionPane.INFORMATION_MESSAGE);    
            }       
        }   
        
        else{
        
        if(manRadioButton.isSelected()){
            gen ="man";
        }   else{
            gen ="kvinna";
            }
        ArrayList<Integer> roller = new ArrayList<Integer>();
        if(playerBox.isSelected()){
            roller.add(0);
        }   
        if(coachBox.isSelected()){
            roller.add(1);
            }
        if(parentBox.isSelected()){
            roller.add(2);
        }
        Metoder.laggTillMedlem(idText.getText(),fornamnText.getText(),efternamnText.getText(),gen,birthText.getText(),medlemText.getText(),lagText.getText(),roller,c);
        
        
        textrutan.append("Medlemmen \n" +idText.getText()+" "+fornamnText.getText()+" "+efternamnText.getText()+" "+gen+" "+birthText.getText()+" "+medlemText.getText()+" "+lagText.getText()+"\n har lagts till i databasen.");
        addFrame.dispose();
        
        }                   //(String id, String givenName,String familyName, String gender, String birth, String memSince ArrayList<listan>, Connection c
          
    }//GEN-LAST:event_laggTillKnappActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        roleId.setText("");
        roleParent.setSelected(false);
        rolePlayer.setSelected(false);
        roleCoach.setSelected(false);      
        roleFrame.setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
            textrutan.setText(null);
            String kollaId = roleId.getText();
            boolean b = Metoder.checkId(kollaId, c);
            
            if(b==false){
                showMessageDialog(null, "Det finns inget sådant ID, försök igen.", "Varning!",JOptionPane.INFORMATION_MESSAGE);
            }       
            else{
                ArrayList<Integer> roll = new ArrayList<Integer>();
                if(rolePlayer.isSelected()){
                    roll.add(0);
                }   
                if(roleCoach.isSelected()){
                    roll.add(1);
                    }
                if(roleParent.isSelected()){
                    roll.add(2);
                }
                    Metoder.andraMedlem(kollaId,roll,c);
                    roleFrame.dispose();
                    textrutan.append("Nu är medlemmen ändrad");
            }
            
         
        //Metoder.andraMedlem(anrop,roll, c);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void roleParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleParentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleParentActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Meny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Meny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Meny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Meny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               //new Meny().setVisible(true); //ger felmeddelande att den saknar connection
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame addFrame;
    private javax.swing.JButton avbrytAddframe;
    private javax.swing.JTextField birthText;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox coachBox;
    private javax.swing.JTextField efternamnText;
    private javax.swing.JTextField fornamnText;
    private javax.swing.JTextField idText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton kvinnaRadioButton;
    private javax.swing.JTextField lagText;
    private javax.swing.JButton laggTillKnapp;
    private javax.swing.JRadioButton manRadioButton;
    private javax.swing.JTextField medlemText;
    private javax.swing.JCheckBox parentBox;
    private javax.swing.JCheckBox playerBox;
    private javax.swing.JCheckBox roleCoach;
    private javax.swing.JFrame roleFrame;
    private javax.swing.JTextField roleId;
    private javax.swing.JCheckBox roleParent;
    private javax.swing.JCheckBox rolePlayer;
    private javax.swing.JTextArea textrutan;
    // End of variables declaration//GEN-END:variables

}
