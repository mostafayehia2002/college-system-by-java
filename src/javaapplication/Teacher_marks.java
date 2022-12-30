
package javaapplication;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static javaapplication.Login.aa;
import javax.swing.*;

public class Teacher_marks {
  public String subject;
  private String search;
  Teacher_marks(String sub) {
       subject=sub;
        JPanel p = new JPanel();   //p The object of Panel 
        JFrame frame = new JFrame("Teacher_marks");
        JButton btnall = new JButton("  All Student  ");
        JButton btnshow = new JButton("  Show Degree  ");
        JLabel lsearch = new JLabel("  Search For Student:  ");
        JTextField tField = new JTextField();
        frame.setSize(2000, 2000);
        p.setSize(2000, 2000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setBackground(Color.white);
        frame.setVisible(true);
        p.setLayout(null);
         btnall.setBackground(Color.red);
         btnall.setForeground(Color.white);
          btnshow.setBackground(Color.red);
         btnshow.setForeground(Color.white);
        frame.add(p);
        btnall.setBounds(650, 250, 500, 80);

        lsearch.setBounds(650, 370, 500, 80);
        tField.setBounds(650, 450, 500, 60);
        btnshow.setBounds(650, 600, 500, 50);
        p.add(lsearch);
        p.add(btnall);
        p.add(tField);
        p.add(btnshow);

    btnall.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent ae) {
          
              
                   tablee ta=new tablee(subject);
            

           }
       }) ;   
        
     
        
        
   btnshow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                      search= tField.getText();
                           switch (sub) {
                    case "operating system":                       
                try {       
                
                   
                            Connection c  = aa.conect();
                    PreparedStatement pre =c.prepareStatement("select*from operating_system");  
       
                   ResultSet res = pre.executeQuery();
                      while (res.next()) {
                        if (search.equals( res.getString("name") ) ) {
                           Degree_student d1;
                        d1 = new Degree_student(res.getString("name"),res.getString("subject") ,res.getDouble("quiz"),res.getDouble("midterm"),res.getDouble("attendance") ,res.getDouble("final"));
                            
                            
                            
                             
                            
                            }

                        
                        } //end while
                
                    System.out.println("ok");
                           } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
                                         
                     break;
                     case "computer organization":
                try {       
                
                   
                            Connection c  = aa.conect();
                    PreparedStatement pre =c.prepareStatement("select*from computer_organization");  
       
                   ResultSet res = pre.executeQuery();
                    while (res.next()) {
                            if (search.equals( res.getString("name") ) ) {
                           Degree_student d1;
                        d1 = new Degree_student(res.getString("name"),res.getString("subject") ,res.getDouble("quiz"),res.getDouble("midterm"),res.getDouble("attendance") ,res.getDouble("final"));
                            
                            
                            
                             
                            
                            }

                        
                        } //end while
                
                    System.out.println("ok");
                           } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
                    
                                          
                       break;   
                case "math3":

                                    try {       
                
                   
                            Connection c  = aa.conect();
                    PreparedStatement pre =c.prepareStatement("select*from math3");  
       
                   ResultSet res = pre.executeQuery();
                    while (res.next()) {
              if (search.equals( res.getString("name") ) ) {
                           Degree_student d1;
                        d1 = new Degree_student(res.getString("name"),res.getString("subject") ,res.getDouble("quiz"),res.getDouble("midterm"),res.getDouble("attendance") ,res.getDouble("final"));
                            
                            
                            
                             
                            
                            }

                        
                        } //end while
                
                    System.out.println("ok");
                           } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
                    
                               
                      break;  
                      
                            case "modelling":
                try {       
                
                   
                            Connection c  = aa.conect();
                    PreparedStatement pre =c.prepareStatement("select*from modelling");  
       
                   ResultSet res = pre.executeQuery();
                    while (res.next()) {
                        if (search.equals( res.getString("name") ) ) {
                           Degree_student d1;
                        d1 = new Degree_student(res.getString("name"),res.getString("subject") ,res.getDouble("quiz"),res.getDouble("midterm"),res.getDouble("attendance") ,res.getDouble("final"));
                            
                            
                            
                             
                            
                            }

                        
                        } //end while
                
                    System.out.println("ok");
                           } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
                        
                        
                       break;
                             case "network":
                try {       
                
                   
                            Connection c  = aa.conect();
                    PreparedStatement pre =c.prepareStatement("select*from network");  
       
                   ResultSet res = pre.executeQuery();
                    while (res.next()) {
                if (search.equals( res.getString("name") ) ) {
                           Degree_student d1;
                        d1 = new Degree_student(res.getString("name"),res.getString("subject") ,res.getDouble("quiz"),res.getDouble("midterm"),res.getDouble("attendance") ,res.getDouble("final"));
                            
                            
                            
                             
                            
                            }

                        
                        } //end while
                
                    System.out.println("ok");
                           } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
                        
                        
                       break;
                    case "programming_2":
                try {       
                
                   
                            Connection c  = aa.conect();
                    PreparedStatement pre =c.prepareStatement("select*from programming_2");  
       
                   ResultSet res = pre.executeQuery();
                    while (res.next()) {
              if (search.equals( res.getString("name") ) ) {
                           Degree_student d1;
                        d1 = new Degree_student(res.getString("name"),res.getString("subject") ,res.getDouble("quiz"),res.getDouble("midterm"),res.getDouble("attendance") ,res.getDouble("final"));
                            
                            
                            
                             
                            
                            }

                        
                        } //end while
                
                    System.out.println("ok");
                           } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
                        
                        
                       break;
                          
                
                        
                        
                        
                              
                        
                        
                        
                        
                }//switch
                
                
                
                
                
                
                
                
            }
        });
   
   
   
   

 
     
    }
  
  
  
  


                    
  
}
