
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.awt.event.*;
import filterclasses.*;
import java.io.IOException;
import filterclasses.*;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
public class AddPost extends javax.swing.JFrame {

    JFileChooser jfc;
    String title, photo;
    String username;
    int pid;
    File f;
    BufferedImage img, changedimg;
    File filterfile;

    JFileChooser chooser;

    /**
     * Creates new form AddPost
     */
    public AddPost() {
        initComponents();
        getContentPane().setBackground(new Color(204, 255, 255));
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) size.getWidth();
        int height = (int) size.getHeight();
        setSize(width, height);
    }

    String username1;

    AddPost(String username1) {
        initComponents();
        this.username1 = username1;
        //System.out.println(username);
        getContentPane().setBackground(new Color(255, 204, 204));
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) size.getWidth();
        int height = (int) size.getHeight();
        setSize(width, height);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        chooser = new JFileChooser();
        filterfile = new File("src/pic.jpg");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        captionlb = new javax.swing.JLabel();
        photolb = new javax.swing.JLabel();
        choosebtn = new javax.swing.JButton();
        postlb = new javax.swing.JLabel();
        addbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        captionta = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        captionlb.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        captionlb.setText("Caption");
        getContentPane().add(captionlb);
        captionlb.setBounds(430, 90, 120, 40);

        photolb.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        photolb.setText("Photo");
        getContentPane().add(photolb);
        photolb.setBounds(430, 170, 160, 50);

        choosebtn.setText("Choose");
        choosebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosebtnActionPerformed(evt);
            }
        });
        getContentPane().add(choosebtn);
        choosebtn.setBounds(690, 170, 170, 40);

        postlb.setBackground(new java.awt.Color(255, 255, 255));
        postlb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(postlb);
        postlb.setBounds(270, 230, 620, 400);

        addbtn.setText("Post");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        getContentPane().add(addbtn);
        addbtn.setBounds(600, 660, 130, 40);

        jLabel4.setBackground(new java.awt.Color(255, 153, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("ADD POST");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(660, 0, 190, 40);

        captionta.setColumns(20);
        captionta.setRows(5);
        jScrollPane1.setViewportView(captionta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(560, 80, 390, 50);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Walden");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(30, 320, 160, 30);

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Blur");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(30, 40, 160, 30);

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Brighter");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(30, 80, 160, 30);

        jButton5.setBackground(new java.awt.Color(153, 153, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("Darker");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(30, 120, 160, 30);

        jButton6.setBackground(new java.awt.Color(153, 153, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setText("Grayscale");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(30, 160, 160, 30);

        jButton7.setBackground(new java.awt.Color(153, 153, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setText("Hefe");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(30, 200, 160, 30);

        jButton8.setBackground(new java.awt.Color(153, 153, 255));
        jButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton8.setText("Lofi");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(30, 240, 160, 30);

        jButton9.setBackground(new java.awt.Color(153, 153, 255));
        jButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton9.setText("Nashville");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(30, 280, 160, 30);

        jButton10.setBackground(new java.awt.Color(153, 153, 255));
        jButton10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton10.setText("No Filter");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(30, 360, 160, 30);

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Apply Filters");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 14, 160, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(900, 230, 220, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void choosebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosebtnActionPerformed
        int ans = chooser.showOpenDialog(this);
        if (ans == JFileChooser.APPROVE_OPTION) {
            f = chooser.getSelectedFile();
            photo = f.getPath();
            setOriginal();
        }

    }//GEN-LAST:event_choosebtnActionPerformed

    public void setOriginal() {
        try {
            f = chooser.getSelectedFile();
            img = ImageIO.read(f);
            BufferedImage newimg = resize(img, postlb.getWidth(), postlb.getHeight());
            postlb.setIcon(new ImageIcon(newimg));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        try {
            String caption = captionta.getText();

            if (f == null) {
                JOptionPane.showMessageDialog(this, "Please choose file");
            } else {
                HttpResponse<String> res = Unirest.post("http://localhost:8999/addpost")
                        .queryString("caption", caption)
                        .queryString("username", username1)
                        .field("photo", f)
                        .asString();

                if (res.getStatus() == 200) {
                    String pid = res.getBody();
                    //System.out.println(pid);
                    JOptionPane.showMessageDialog(this, "Post Added");
                    new AddStory(pid, username1).setVisible(true);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Thread(new Runnable() {
            public void run() {
                try {

                    WaldenFilter obj = new WaldenFilter();
                    BufferedImage blurimg = obj.filter(img);
                    try {
                        // File outputfile = new File("image.jpg");
                        ImageIO.write(blurimg, "jpg", filterfile);
                        f = filterfile;
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    changedimg = resize(blurimg, postlb.getWidth(), postlb.getHeight());
                    postlb.setIcon(new ImageIcon(changedimg));

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }).start();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Thread(new Runnable() {
            public void run() {
                try {
                    
                    System.out.println("blur");

                    BlurFilter obj = new BlurFilter();
                    BufferedImage blurimg = obj.filter(img);

                    try {
                        // File outputfile = new File("image.jpg");
                        ImageIO.write(blurimg, "jpg", filterfile);
                        f = filterfile;
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

                    changedimg = resize(blurimg, postlb.getWidth(), postlb.getHeight());
                    postlb.setIcon(new ImageIcon(changedimg));
                    repaint();

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }).start();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Thread(new Runnable() {
            public void run() {
                try {
                    System.out.println("brighten");
                    BrighterFilter obj = new BrighterFilter();
                    BufferedImage blurimg = obj.filter(img);
                    try {
                        // File outputfile = new File("image.jpg");
                        ImageIO.write(blurimg, "jpg", filterfile);
                        
                        f = filterfile;
                        System.out.println("image written");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    changedimg = resize(blurimg, postlb.getWidth(), postlb.getHeight());
                    postlb.setIcon(new ImageIcon(changedimg));
                    System.out.println("image set on lb");

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

           
            
        }).start();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new Thread(new Runnable() {
            public void run() {
                try {

                    DarkerFilter obj = new DarkerFilter();
                    BufferedImage blurimg = obj.filter(img);
                    try {
                        // File outputfile = new File("image.jpg");
                        ImageIO.write(blurimg, "jpg", filterfile);
                        f = filterfile;
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    changedimg = resize(blurimg, postlb.getWidth(), postlb.getHeight());
                    postlb.setIcon(new ImageIcon(changedimg));

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            
        }).start();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new Thread(new Runnable() {
            public void run() {
                try {

                    GrayscaleFilter obj = new GrayscaleFilter();
                    BufferedImage blurimg = obj.filter(img);
                    try {
                        // File outputfile = new File("image.jpg");
                        ImageIO.write(blurimg, "jpg", filterfile);
                        f = filterfile;
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    changedimg = resize(blurimg, postlb.getWidth(), postlb.getHeight());
                    postlb.setIcon(new ImageIcon(changedimg));

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }).start();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new Thread(new Runnable() {
            public void run() {
                try {

                    HefeFilter obj = new HefeFilter();
                    BufferedImage blurimg = obj.filter(img);
                    try {
                        // File outputfile = new File("image.jpg");
                        ImageIO.write(blurimg, "jpg", filterfile);
                        f = filterfile;
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    changedimg = resize(blurimg, postlb.getWidth(), postlb.getHeight());
                    postlb.setIcon(new ImageIcon(changedimg));

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            
        }).start();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new Thread(new Runnable() {
            public void run() {
                try {

                    LoFiFilter obj = new LoFiFilter();
                    BufferedImage blurimg = obj.filter(img);
                    try {
                        // File outputfile = new File("image.jpg");
                        ImageIO.write(blurimg, "jpg", filterfile);
                        f = filterfile;
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    changedimg = resize(blurimg, postlb.getWidth(), postlb.getHeight());
                    postlb.setIcon(new ImageIcon(changedimg));

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            
        }).start();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        new Thread(new Runnable() {
            public void run() {
                try {

                    NashvilleFilter obj = new NashvilleFilter();
                    BufferedImage blurimg = obj.filter(img);
                    try {
                        // File outputfile = new File("image.jpg");
                        ImageIO.write(blurimg, "jpg", filterfile);
                        f = filterfile;
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    changedimg = resize(blurimg, postlb.getWidth(), postlb.getHeight());
                    postlb.setIcon(new ImageIcon(changedimg));

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            
        }).start();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        setOriginal();
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(AddPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JLabel captionlb;
    private javax.swing.JTextArea captionta;
    private javax.swing.JButton choosebtn;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel photolb;
    public javax.swing.JLabel postlb;
    // End of variables declaration//GEN-END:variables

    BufferedImage resize(BufferedImage image, int width, int height) {
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
        Graphics2D g2d = (Graphics2D) bi.createGraphics();
        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
        g2d.drawImage(image, 0, 0, width, height, null);
        g2d.dispose();
        return bi;
    }
}
