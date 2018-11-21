package pack;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dell
 */
public class Afisare extends javax.swing.JFrame {

    DefaultListModel tabel = new DefaultListModel();
    DefaultListModel tabel2 = new DefaultListModel();
    public Persoana[] p = new Persoana[10];
    int x = 0;
    private int i = 0;
    private int numarMinori;
    private int numarMajori;

    public Initiere j;
    
    
    public void adaugaC(String s1, String s2, String s3, String s4, String s5) {
        p[x].comp[0] = s1;
        p[x].comp[1] = s2;
        p[x].comp[2] = s3;
        p[x].comp[3] = s4;
        p[x].comp[4] = s5;

    }

    
    public Afisare() {
        initComponents();
        tabelList.setModel(tabel);
        tabelList2.setModel(tabel2);
        insertLabel.setVisible(false);
    }

    @Override
    public String toString() {
        String result = "Competentele lui " + p[x].getPrenume() + ": " + p[x].comp[0] + "," + p[x].comp[1]
                + "," + p[x].comp[2] + "," + p[x].comp[3] + "," + p[x].comp[4];
        x++;
        return result;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butoaneSex = new javax.swing.ButtonGroup();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        prenumeLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        sexLabel = new javax.swing.JLabel();
        tNume = new javax.swing.JTextField();
        tPrenume = new javax.swing.JTextField();
        bAdd = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        bExit = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelList = new javax.swing.JList<>();
        cM = new javax.swing.JRadioButton();
        cF = new javax.swing.JRadioButton();
        varstaBox = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        robot = new javax.swing.JCheckBox();
        insertLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nrMinori = new javax.swing.JLabel();
        nrMajori = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jSeparator10 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelList2 = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        delete1 = new javax.swing.JButton();
        delete2 = new javax.swing.JButton();
        bacground = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First Name:");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        prenumeLabel.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        prenumeLabel.setForeground(new java.awt.Color(255, 255, 255));
        prenumeLabel.setText("Last Name:");
        prenumeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                prenumeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prenumeLabelMouseExited(evt);
            }
        });
        getContentPane().add(prenumeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 100, -1));

        ageLabel.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        ageLabel.setForeground(new java.awt.Color(255, 255, 255));
        ageLabel.setText("Age:");
        ageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ageLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ageLabelMouseExited(evt);
            }
        });
        getContentPane().add(ageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 40, -1));

        sexLabel.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        sexLabel.setForeground(new java.awt.Color(255, 255, 255));
        sexLabel.setText("Sex:");
        sexLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sexLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sexLabelMouseExited(evt);
            }
        });
        getContentPane().add(sexLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        tNume.setBackground(new java.awt.Color(204, 204, 204));
        tNume.setForeground(new java.awt.Color(255, 255, 255));
        tNume.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tNumeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tNumeMouseEntered(evt);
            }
        });
        tNume.setBackground(new Color(0,0,0,0));
        getContentPane().add(tNume, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 260, -1));

        tPrenume.setBackground(new java.awt.Color(204, 204, 204));
        tPrenume.setForeground(new java.awt.Color(255, 255, 255));
        tPrenume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPrenumeActionPerformed(evt);
            }
        });
        tPrenume.setBackground(new Color(0,0,0,0));
        getContentPane().add(tPrenume, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 260, -1));

        bAdd.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bAdd.setForeground(new java.awt.Color(255, 255, 255));
        bAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Add-01.png"))); // NOI18N
        bAdd.setText("Add");
        bAdd.setBorder(null);
        bAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bAddMouseExited(evt);
            }
        });
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });
        getContentPane().add(bAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 100, -1));
        bAdd.setBackground(new Color(0,0,0,0));

        bClear.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bClear.setForeground(new java.awt.Color(255, 255, 255));
        bClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/recycle_bin_empty.png"))); // NOI18N
        bClear.setText("Clear");
        bClear.setBorder(null);
        bClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bClearMouseExited(evt);
            }
        });
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });
        bClear.setBackground(new Color(0,0,0,0));
        getContentPane().add(bClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 120, -1));

        bExit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bExit.setForeground(new java.awt.Color(255, 255, 255));
        bExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/exit-48.png"))); // NOI18N
        bExit.setText("Exit");
        bExit.setBorder(null);
        bExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bExitMouseExited(evt);
            }
        });
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });
        bExit.setBackground(new Color(0,0,0,0));
        getContentPane().add(bExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 110, -1));

        tabelList.setBackground(new java.awt.Color(204, 204, 204));
        tabelList.setForeground(new java.awt.Color(255, 255, 255));
        tabelList.setBackground(new Color(0,0,0,200));
        jScrollPane1.setViewportView(tabelList);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 320, 146));

        butoaneSex.add(cM);
        cM.setForeground(new java.awt.Color(255, 255, 255));
        cM.setText("M");
        cM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cMActionPerformed(evt);
            }
        });
        getContentPane().add(cM, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 40, -1));

        butoaneSex.add(cF);
        cF.setForeground(new java.awt.Color(255, 255, 255));
        cF.setText("F");
        getContentPane().add(cF, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 270, 40, -1));

        varstaBox.setBackground(new java.awt.Color(255, 255, 255));
        varstaBox.setForeground(new java.awt.Color(255, 255, 255));
        varstaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50" }));
        varstaBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        varstaBox.setBackground(new Color(0,0,0,0));
        getContentPane().add(varstaBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 220, 140, -1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 200, 360, 10));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 360, 10));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 140, 360, 10));
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 80, 360, 10));

        jLabel9.setFont(new java.awt.Font("Edwardian Script ITC", 2, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("        Add new people");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 480, 50));

        robot.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        robot.setForeground(new java.awt.Color(255, 255, 255));
        robot.setText("I'm not a robot");
        robot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                robotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                robotMouseExited(evt);
            }
        });
        getContentPane().add(robot, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 130, -1));

        insertLabel.setBackground(new java.awt.Color(255, 255, 255));
        insertLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        insertLabel.setForeground(new java.awt.Color(255, 255, 255));
        insertLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/robot.png"))); // NOI18N
        getContentPane().add(insertLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 630, 40));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numar Minori:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 520, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Numar Majori:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 560, -1, -1));

        nrMinori.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nrMinori.setForeground(new java.awt.Color(255, 255, 255));
        nrMinori.setText("0");
        getContentPane().add(nrMinori, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 520, 50, -1));

        nrMajori.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nrMajori.setForeground(new java.awt.Color(255, 255, 255));
        nrMajori.setText("0");
        getContentPane().add(nrMajori, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, 50, -1));

        passwordLabel.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password:");
        passwordLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwordLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passwordLabelMouseExited(evt);
            }
        });
        getContentPane().add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 324, -1, 40));

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBackground(new Color(0,0,0,0));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 260, 30));
        getContentPane().add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 260, 360, 10));

        tabelList2.setBackground(new Color(15,0,0,0));
        jScrollPane2.setViewportView(tabelList2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 320, 140));

        jLabel8.setFont(new java.awt.Font("Edwardian Script ITC", 3, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Women");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 140, -1));

        jLabel11.setFont(new java.awt.Font("Edwardian Script ITC", 3, 48)); // NOI18N
        jLabel11.setText("Men");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 200, -1));

        delete1.setText("Delete");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        getContentPane().add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, -1, -1));

        delete2.setText("Delete");
        delete2.setActionCommand("Delete");
        delete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete2ActionPerformed(evt);
            }
        });
        getContentPane().add(delete2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, -1, -1));

        bacground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/U1wB.gif"))); // NOI18N
        getContentPane().add(bacground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 610));

        jMenu1.setText("File");

        jMenu3.setText("Actions");

        jMenuItem1.setText("Add");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Clear");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Change Password");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        System.exit(0);  // TODO add your handling code here:
    }//GEN-LAST:event_bExitActionPerformed

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        tNume.setText("");
        tPrenume.setText("");
        varstaBox.setSelectedIndex(0);
        butoaneSex.clearSelection();
        password.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_bClearActionPerformed
    public void setTabel(String s) {
        tabel.addElement(s);
    }
    
    public void setTabelF(String s) {
        tabel2.addElement(s);
    }

    private void action() {
        if (tNume.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter first name", "First name not found", JOptionPane.ERROR_MESSAGE);
        }
        if (tPrenume.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter last name", "Last name not found", JOptionPane.ERROR_MESSAGE);
        }

        if (!cM.isSelected() && !cF.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please select sex", "Sex not found", JOptionPane.ERROR_MESSAGE);
        }

        if (robot.isSelected() && password.getText().equals(Persoana.getParola())) {
            String nume = tNume.getText();
            String prenume = tPrenume.getText();
            char sex = 's';
            int age = Integer.parseInt(varstaBox.getSelectedItem().toString());
            if (cM.isSelected()) {
                sex = 'M';
            }
            if (cF.isSelected()) {
                sex = 'F';
            }

            p[i] = new Persoana(nume, prenume, age, sex);

           
            j.changeTitle("Lui "+p[x].getPrenume());/////////////////////////////////////////////////////////////
            j.setVisible(true);/////////////////////////////////////////////////////////////////////////////////////////////////////

            if (p[i].getSex() == 'M') {
                j.setPersonSex('M');
                tabel.addElement(p[i]);
                tabel.addElement(j.getText()); //////////////////////////////////////////////////////////////////////////////////////////////////////
                i++;
            } else {
                 j.setPersonSex('F');
                tabel2.addElement(p[i]);
                tabel2.addElement(j.getText());//////////////////////////////////////////////////////////////////////////////////////////////////////
                i++;

            }

            insertLabel.setText("");

            tNume.setText("");
            tPrenume.setText("");
            varstaBox.setSelectedIndex(0);
            butoaneSex.clearSelection();
            robot.setSelected(false);
            password.setText("");
            insertLabel.setVisible(false);

            if (age >= 18) {
                numarMajori++;
                nrMajori.setText(String.valueOf(numarMajori));
            } else {
                numarMinori++;
                nrMinori.setText(String.valueOf(numarMinori));
            }

        } else {
            if (!robot.isSelected()) {
                insertLabel.setVisible(true);
                insertLabel.setText("Sorry,robots can t perform any actions here.");
            } else if (!password.getText().equals(Persoana.getParola())) {
                JOptionPane.showMessageDialog(null, " ! WRONG PASSWORD !", "Password error", JOptionPane.PLAIN_MESSAGE);
                password.setText("");
            }
        }

    }


    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        action();
        

        // TODO add your handling code here:
    }//GEN-LAST:event_bAddActionPerformed

    private void tPrenumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPrenumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPrenumeActionPerformed

    private void cMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cMActionPerformed

    private void tNumeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tNumeMouseEntered
        // TODO add your handling code here:
        setBackground(Color.YELLOW);
    }//GEN-LAST:event_tNumeMouseEntered

    private void tNumeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tNumeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tNumeMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        action();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        tNume.setText("");
        tPrenume.setText("");
        varstaBox.setSelectedIndex(0);
        butoaneSex.clearSelection();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        String oldPassword = JOptionPane.showInputDialog("Please insert old password. Make sure no one is watching!",JOptionPane.PLAIN_MESSAGE);
        if (!Persoana.getParola().equals(oldPassword)) {
            JOptionPane.showMessageDialog(null, "You entered the wrong password!", "Wrong password", JOptionPane.ERROR_MESSAGE);

        } else {
            String newPassword = JOptionPane.showInputDialog("Enter the new password:");
            String confirmPassword = JOptionPane.showInputDialog("Confirm password:");
            if (newPassword.equals(confirmPassword)) {
                int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to change the password?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (x == JOptionPane.YES_OPTION) {
                    Persoana.setParola(newPassword);
                }
                Persoana.setParola(newPassword);
                JOptionPane.showMessageDialog(null, "! You changed the password !", "Password changed", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "! Invalid Password !", "Invalid password", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setForeground(new Color(169, 169, 169));           // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setForeground(Color.white);           // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseExited

    private void prenumeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prenumeLabelMouseEntered
        prenumeLabel.setForeground(new Color(169, 169, 169));           // TODO add your handling code here:
    }//GEN-LAST:event_prenumeLabelMouseEntered

    private void ageLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ageLabelMouseEntered
        ageLabel.setForeground(new Color(169, 169, 169));           // TODO add your handling code here:
    }//GEN-LAST:event_ageLabelMouseEntered

    private void sexLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sexLabelMouseEntered
        sexLabel.setForeground(new Color(169, 169, 169));           // TODO add your handling code here:
    }//GEN-LAST:event_sexLabelMouseEntered

    private void passwordLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordLabelMouseEntered
        passwordLabel.setForeground(new Color(169, 169, 169));           // TODO add your handling code here:
    }//GEN-LAST:event_passwordLabelMouseEntered

    private void robotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_robotMouseEntered
        robot.setForeground(new Color(169, 169, 169));           // TODO add your handling code here:
    }//GEN-LAST:event_robotMouseEntered

    private void prenumeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prenumeLabelMouseExited
        prenumeLabel.setForeground(Color.white);      // TODO add your handling code here:
    }//GEN-LAST:event_prenumeLabelMouseExited

    private void ageLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ageLabelMouseExited
        ageLabel.setForeground(Color.white);          // TODO add your handling code here:
    }//GEN-LAST:event_ageLabelMouseExited

    private void sexLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sexLabelMouseExited
        sexLabel.setForeground(Color.white);          // TODO add your handling code here:
    }//GEN-LAST:event_sexLabelMouseExited

    private void passwordLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordLabelMouseExited
        passwordLabel.setForeground(Color.white);          // TODO add your handling code here:
    }//GEN-LAST:event_passwordLabelMouseExited

    private void robotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_robotMouseExited
        robot.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_robotMouseExited

    private void bAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAddMouseEntered
        bAdd.setBackground(new Color(112, 128, 144));         // TODO add your handling code here:
    }//GEN-LAST:event_bAddMouseEntered

    private void bAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAddMouseExited
        bAdd.setBackground(new Color(0, 0, 0, 0));          // TODO add your handling code here:
    }//GEN-LAST:event_bAddMouseExited

    private void bClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bClearMouseEntered
        bClear.setBackground(new Color(112, 128, 144));           // TODO add your handling code here:
    }//GEN-LAST:event_bClearMouseEntered

    private void bExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExitMouseEntered
        bExit.setBackground(new Color(112, 128, 144));           // TODO add your handling code here:
    }//GEN-LAST:event_bExitMouseEntered

    private void bClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bClearMouseExited
        bClear.setBackground(new Color(0, 0, 0, 0));           // TODO add your handling code here:
    }//GEN-LAST:event_bClearMouseExited

    private void bExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bExitMouseExited
        bExit.setBackground(new Color(0, 0, 0, 0));         // TODO add your handling code here:
    }//GEN-LAST:event_bExitMouseExited

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
int index=tabelList.getSelectedIndex();
tabel.removeElementAt(index);

    }//GEN-LAST:event_delete1ActionPerformed

    private void delete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete2ActionPerformed
int index=tabelList2.getSelectedIndex();
tabel2.removeElementAt(index);// TODO add your handling code here:
    }//GEN-LAST:event_delete2ActionPerformed

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
            java.util.logging.Logger.getLogger(Afisare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Afisare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Afisare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Afisare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            Afisare afisare = new Afisare();
            Initiere initiere=new Initiere();
            initiere.afis=afisare;
            afisare.j=initiere;
            afisare.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bClear;
    private javax.swing.JToggleButton bExit;
    private javax.swing.JLabel bacground;
    private javax.swing.ButtonGroup butoaneSex;
    private javax.swing.JRadioButton cF;
    private javax.swing.JRadioButton cM;
    private javax.swing.JButton delete1;
    private javax.swing.JButton delete2;
    private javax.swing.JLabel insertLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel nrMajori;
    private javax.swing.JLabel nrMinori;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel prenumeLabel;
    private javax.swing.JCheckBox robot;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JTextField tNume;
    private javax.swing.JTextField tPrenume;
    private javax.swing.JList<String> tabelList;
    private javax.swing.JList<String> tabelList2;
    private javax.swing.JComboBox<String> varstaBox;
    // End of variables declaration//GEN-END:variables

}
