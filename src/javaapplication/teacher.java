
package javaapplication;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class teacher extends Login{
    public String name=teacher.username;

  
    public String sub;
   teacher()  {
        JFrame f = new JFrame();
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JLabel l = new JLabel("teacher information");
        JLabel l1 = new JLabel("choose subject");
        String[] subject = {"operating system", "computer organization","math3", "modelling","network","programming_2"};
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
        l.setForeground(Color.red);
        l1.setFont(new Font(Font.MONOSPACED, Font.ITALIC, 25));
        l2.setFont(new Font(Font.MONOSPACED, Font.ITALIC, 25));
           B.setBackground(Color.red);
           B.setForeground(Color.white);
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
             switch (sub){
                    case "operating system":
                        if(name.equals("dr_ashrf")){
                    Teacher_marks te=new Teacher_marks(sub);
                 
                        }

                  
                     break;
                     case "computer organization":
                  if(name.equals("dr_anas")){
                    Teacher_marks te=new Teacher_marks(sub);
                 
                        }
                    
                                          
                       break;   
                case"math3":
                  if(name.equals("dr_osama")){
                   Teacher_marks te=new Teacher_marks(sub);
                 
                        }
                    
                    
                    
                    
                      break;  
                      
                            case "modelling":
                           if(name.equals("dr_gamal")){
                    Teacher_marks te=new Teacher_marks(sub);
                 
                        }
                        
                        
                       break;
                             case "network":
                           if(name.equals("dr_hatem")){
                    Teacher_marks te=new Teacher_marks(sub);
                 
                        }
                        
                        
                       break;
                     case "programming_2":
                         if(name.equals("dr_eman")){
                     Teacher_marks te=new Teacher_marks(sub);
                 
                        }  
                        
                        
                       break;
                          
                
                        
                        
                        
                              
                        
                        
                        
                        
                }//end switch
                
                
                
            }
        });
       
       
        
        
        
        
        
        
        
        
   }//end constructor

}//end class
                
