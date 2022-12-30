package javaapplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {

    
    ResultSet res;
 static   database aa = new database();
  private String password;
  public static String username;

    Login() {

        /**
         * **************************************************
         */
        JFrame f = new JFrame();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JLabel backlabel = new JLabel();
        backlabel.setIcon(new ImageIcon("D:photo.jpg"));
        JLabel backlabe2 = new JLabel();
        JLabel l = new JLabel(" Welcome to marks monetor program");
        JLabel l1 = new JLabel("username");
        JTextField t1 = new JTextField();
        JLabel l2 = new JLabel("password");
        JPasswordField t2 = new JPasswordField();
        JButton b = new JButton("  login  ");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("frame");
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(2000, 2500);
        p1.setSize(2000, 2500);
        p1.setLayout(null);
        p1.setBackground(Color.white);
        backlabel.setSize(2000, 1000);
        backlabel.setBounds(0, 0, 2500, 1000);
        b.setBackground(Color.red);
        b.setForeground(Color.white);
        p2.setLocation(700, 250);
        p2.setBackground(Color.DARK_GRAY);
        p2.setSize(450, 450);
        p2.setVisible(true);
        p2.setLayout(null);
        l.setBounds(330, 90, 1200, 100);
        l1.setBounds(50, 50, 350, 60);
        t1.setBounds(50, 100, 350, 60);
        l2.setBounds(50, 180, 350, 60);
        t2.setBounds(50, 240, 350, 60);
        b.setBounds(180, 350, 100, 50);
        l.setFont(new Font(Font.MONOSPACED, Font.BOLD, 60));
        l.setForeground(Color.RED);
        l1.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        l1.setForeground(Color.white);
        l2.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        l2.setForeground(Color.white);
        f.add(p2);
        f.add(p1);
        p1.add(l);
        // p1.add( backlabe3);
        //p1.add( backlabe2);
        p1.add(backlabel);

        p2.add(l1);
        p2.add(t1);
        p2.add(l2);
        p2.add(t2);
        p2.add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try(

                    Connection c  = aa.conect();
                    PreparedStatement pre =c.prepareStatement("select*from Login");  
               
                        
                        ) 
                {
                   
                    username = t1.getText();
                    password = String.valueOf(t2.getPassword());
       
                    res = pre.executeQuery();
                    while (res.next()){
                        if (res.getString("password").equals(password) && res.getString("usernames").equals(username)) {
                            if (res.getString("statues").equals("student")){
                                student st = new student();
                                break;
                            } else if (res.getString("statues").equals("teacher")) {
                                teacher te = new teacher();
                                break;
                            }

                        
                        } 
                      
                          
                    } //end while

                    System.out.println("ok");
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }

            }

        });

    }

    
}
