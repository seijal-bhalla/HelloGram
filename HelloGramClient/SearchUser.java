
import java.io.File;
import javax.swing.JFileChooser;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import sun.util.locale.StringTokenIterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class SearchUser extends javax.swing.JFrame {

    /**
     * Creates new form SearchUser
     */
    public SearchUser() {
        initComponents();
        setSize(800,700);
    }
    
    String username;
    JFileChooser chooser;

    File f;

    SearchUser(String username) {
        initComponents();
        this.username = username;
        //System.out.println(username);
        setSize(800, 700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        chooser=new JFileChooser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf1 = new javax.swing.JTextField();
        jb2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mpanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(tf1);
        tf1.setBounds(210, 30, 132, 35);

        jb2.setText("Search");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });
        getContentPane().add(jb2);
        jb2.setBounds(380, 30, 122, 35);

        mpanel.setBackground(new java.awt.Color(255, 255, 255));
        mpanel.setLayout(null);
        jScrollPane1.setViewportView(mpanel);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 100, 730, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed

        String keyword = tf1.getText();
        if (keyword.equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter User Name");
        }

        try {
            HttpResponse<String> res;
            res = Unirest.get("http://localhost:8999/Search")
            .queryString("keyword", keyword)
            .queryString("user_name", username)
            .asString();

            if (res.getStatus() == 200) {
                String data = res.getBody();
                StringTokenizer st = new StringTokenizer(data, "&");
                int y = 10;

                int mainheight = 100;

                while (st.hasMoreTokens()) {

                    String userdata = st.nextToken();
                    //System.out.println(userdata);
                    StringTokenizer st1 = new StringTokenizer(userdata, ";#");
                    String user_n = st1.nextToken();
                    String photo = st1.nextToken();
                    String iffollow = st1.nextToken();
                    userpanel up = new userpanel();
                    up.setBounds(10, y, 500, 80);
                    if(iffollow.equals("yes"))

                    {
                        up.followbtn.setText("Following");
                    }

                    if (!user_n.equals(username)) {

                        mpanel.add(up);

                        URL url = new URL("http://localhost:8999/GetResource/" + photo);
                        BufferedImage bimg = ImageIO.read(url);
                        Image img = bimg.getScaledInstance(up.photolb.getWidth(), up.photolb.getHeight(), Image.SCALE_SMOOTH);
                        up.photolb.setIcon(new ImageIcon(img));

                        up.usernamelb.setText(user_n);

                        up.followbtn.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent ae) {

                                try {
                                    HttpResponse<String> res = Unirest.get("http://localhost:8999/followrequest")
                                    .queryString("followedto", user_n)
                                    .queryString("followedby", username)
                                    .asString();

                                    if (res.getStatus() == 200) {
                                        if (res.getBody().equals("success")) {
                                            up.followbtn.setText("Following");
                                        } else {
                                            up.followbtn.setText("Follow");
                                        }
                                    }
                                    //System.out.println(user_n);
                                } catch (UnirestException ex) {
                                    Logger.getLogger(Userhome.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        });

                        y += 90;
                        mainheight += 90;
                    }
                }

                mpanel.setPreferredSize(new Dimension(jScrollPane1.getWidth(), mainheight));

                mpanel.repaint();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jb2ActionPerformed

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
            java.util.logging.Logger.getLogger(SearchUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb2;
    private javax.swing.JPanel mpanel;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}
