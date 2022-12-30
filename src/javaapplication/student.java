
package javaapplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplication.Login.aa;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class student extends Login{
    private String sub;
   public String name= student.username;
    student() {
        JFrame f = new JFrame();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JLabel l = new JLabel("student information");
        JLabel l1 = new JLabel("choose subject");
        String[] subject = {"operating system", "computer organization", "math3", "modelling", "network", "programming_2"};
        JLabel l2 = new JLabel("choose section");
        String[] sec = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        JComboBox c1 = new JComboBox(subject);
        JComboBox c2 = new JComboBox(sec);
        JButton B = new JButton("show marks");
        f.setTitle("student");
        f.setVisible(true);
        f.setSize(2000, 2000);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p1.setSize(2000, 2000);
        p1.setBackground(Color.white);
        c1.setBackground(Color.white);
        c2.setBackground(Color.white);
        p1.setLayout(null);
        l.setBounds(750, 100, 1000, 50);
        l1.setBounds(400, 300, 500, 50);
        c1.setBounds(750, 300, 500, 50);
        l2.setBounds(400, 500, 500, 50);
        c2.setBounds(750, 500, 500, 50);
        B.setBounds(900, 700, 150, 60);
        l.setFont(new Font(Font.MONOSPACED, Font.BOLD, 40));
        B.setBackground(Color.red);
        B.setForeground(Color.white);
        l.setForeground(Color.red);
        l1.setFont(new Font(Font.MONOSPACED, Font.ITALIC, 25));
        l2.setFont(new Font(Font.MONOSPACED, Font.ITALIC, 25));

        f.add(p1);
        p1.add(l);
        p1.add(l1);
        p1.add(c1);
        p1.add(l2);
        p1.add(c2);
        p1.add(B);

      
        B.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
          sub=c1.getSelectedItem().toString();
             switch (sub) {
                    case "operating system":
                                try{

                            Connection c  = aa.conect();
                     PreparedStatement pre =c.prepareStatement("select*from operating_system");                   
                    res = pre.executeQuery();
                     while (res.next()) {
                    if(name.equals( res.getString("name")) && c2.getSelectedItem().equals("1")       )  
                    {
                    
                       Degree_student d1;
                        d1 = new Degree_student(res.getString("name"),res.getString("subject") ,res.getDouble("quiz"),res.getDouble("midterm"),res.getDouble("attendance") ,res.getDouble("final"));
                   

                    }
                            

                        
                        }  //end while
                      
                          
                    } catch (SQLException ex) {
                 System.out.println(ex.getMessage());
                      }

                  
               
                     break;
                     case "computer organization":
                         
                                        try{

                            Connection c  = aa.conect();
                     PreparedStatement pre =c.prepareStatement("select*from computer_organization");                   
                    res = pre.executeQuery();
                    while (res.next()) {
                    if(name.equals( res.getString("name")))  
                    {
                    
                       Degree_student d1;
                        d1 = new Degree_student(res.getString("name"),res.getString("subject") ,res.getDouble("quiz"),res.getDouble("midterm"),res.getDouble("attendance") ,res.getDouble("final"));
                  

                    }
                              
                        }  //end while
                      
                          
                    } catch (SQLException ex) {
                 System.out.println(ex.getMessage());
                      }
                    
                                          
                       break;   
                case "math3":
                     try{

                     Connection c  = aa.conect();
                     PreparedStatement pre =c.prepareStatement("select*from math3");                   
                    res = pre.executeQuery();
                    while (res.next()) {
                    if(name.equals( res.getString("name")))  
                    {
                    
                       Degree_student d2;
                        d2 = new Degree_student(res.getString("name"),res.getString("subject") ,res.getDouble("quiz"),res.getDouble("midterm"),res.getDouble("attendance") ,res.getDouble("final"));
                     
                           
                    }
                            

                        
                        }  //end while
                      
                          
                    } catch (SQLException ex) {
                 System.out.println(ex.getMessage());
                      }
                        
                            
                            
                            
                    break;
                      case "modelling":
                                          try{

                            Connection c  = aa.conect();
                     PreparedStatement pre =c.prepareStatement("select*from modelling");                   
                    res = pre.executeQuery();
                    while (res.next()) {
                    if(name.equals( res.getString("name")))  
                    {
                    
                       Degree_student d1;
                        d1 = new Degree_student(res.getString("name"),res.getString("subject") ,res.getDouble("quiz"),res.getDouble("midterm"),res.getDouble("attendance") ,res.getDouble("final"));
                   

                    }
                            

                        
                        }  //end while
                      
                          
                    } catch (SQLException ex) {
                 System.out.println(ex.getMessage());
                      }
                

                     break;
                     case "network":
                       try{

                            Connection c  = aa.conect();
                     PreparedStatement pre =c.prepareStatement("select*from network");                   
                    res = pre.executeQuery();
                    while (res.next()) {
                    if(name.equals( res.getString("name")))  
                    {
                    
                       Degree_student d1;
                        d1 = new Degree_student(res.getString("name"),res.getString("subject") ,res.getDouble("quiz"),res.getDouble("midterm"),res.getDouble("attendance") ,res.getDouble("final"));
                     

                    }
                            

                        
                        }  //end while
                      
                          
                    } catch (SQLException ex) {
                 System.out.println(ex.getMessage());
                      }
                   
                      break;  
                    case "programming_2":
                                     try{

                            Connection c  = aa.conect();
                     PreparedStatement pre =c.prepareStatement("select*from programming_2");                   
                    res = pre.executeQuery();
                    while (res.next()) {
                    if(name.equals( res.getString("name")))  
                    {
                    
                       Degree_student d1;
                        d1 = new Degree_student(res.getString("name"),res.getString("subject") ,res.getDouble("quiz"),res.getDouble("midterm"),res.getDouble("attendance") ,res.getDouble("final"));
                   

                    }
                            

                        
                        }  //end while
                      
                          
                    } catch (SQLException ex) {
                 System.out.println(ex.getMessage());
                      }
                        
                        
                        
                              
                        
                        
                        
                        
                }//end switch
                
                
                
                
                
                
                
                

            }

          
        });


    }
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
