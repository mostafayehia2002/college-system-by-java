
package javaapplication;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplication.Login.aa;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class tablee {
    private String subject;

       public  tablee(String sub){
          subject=sub;
                    JFrame frame = new JFrame("JTable"); 
                   JTextField t1 = new JTextField("id");
                   JTextField t2 = new JTextField("quiz");
                    JTextField t3 = new JTextField("midterm");
                    JTextField t4 = new JTextField("attendance");
                    JTextField t5 = new JTextField("final");
                      JButton save=new JButton("save");
                     JButton exit=new JButton("exit");  
                        frame.setSize(1050, 600);                                  
                      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
                         frame.setLayout(null);
                       frame.setVisible(true);   
                   DefaultTableModel model = new DefaultTableModel();                      
                    JTable table = new JTable(model);                       
                   JScrollPane tableScroller= new JScrollPane(table);       
                       table.setRowHeight(50);    
                   tableScroller.setBounds(0, 0, 1000, 400);
                   
                   t1.setBounds(90, 400,150 , 50);
                   t2.setBounds(300, 400,150 , 50);
                   t3.setBounds(490, 400,150 , 50);
                   t4.setBounds(650, 400,150 , 50);
                   t5.setBounds(830, 400,150 , 50);
                     save.setBounds(350,500,100, 40);
                     exit.setBounds(500,500,100, 40);
                     
              
                       frame.add( tableScroller  );  
                         save.setBackground(Color.red);
                       save.setForeground(Color.white);
                    exit.setBackground(Color.red);
                   exit.setForeground(Color.white);
                 model.addColumn("id");
                model.addColumn("name");
                model.addColumn("subject");
                model.addColumn("quiz");
                model.addColumn("midterm");
                model.addColumn("attendance");
                model.addColumn("final");
                  Object []row=new Object[7];
            
                    switch(subject){
                    case "operating system":
                        try{
                    Connection c  = aa.conect();
                    PreparedStatement pre =c.prepareStatement("select*from operating_system");        
                   ResultSet res = pre.executeQuery();
                    while (res.next()){
                    row[0]=res.getInt("id");
                    row[1]=res.getString("name");
                    row[2]=res.getString("subject");
                    row[3]=res.getDouble("quiz");
                    row[4]=res.getDouble("midterm");
                    row[5]=res.getDouble("attendance");
                    row[6]=res.getDouble("final");
                      model.addRow(row);
                    }
                        }
                    catch(SQLException ex){
                            System.out.println(ex.getMessage());
                            }                      
                       break; 
                    case "computer organization":
                                                try{
                    Connection c  = aa.conect();
                    PreparedStatement pre =c.prepareStatement("select*from computer_organization");        
                   ResultSet res = pre.executeQuery();
                    while (res.next()){
                    row[0]=res.getInt("id");
                    row[1]=res.getString("name");
                    row[2]=res.getString("subject");
                    row[3]=res.getDouble("quiz");
                    row[4]=res.getDouble("midterm");
                    row[5]=res.getDouble("attendance");
                    row[6]=res.getDouble("final");
                       model.addRow(row);
                    }
                        }
                    catch(SQLException ex){
                         
                            System.out.println(ex.getMessage());
                            
                            } 
                        
                        
                        
                        
                        break;
                        
                       case "math3":
                      try{
                    Connection c  = aa.conect();
                    PreparedStatement pre =c.prepareStatement("select*from math3");        
                   ResultSet res = pre.executeQuery();
                    while (res.next()){
                    row[0]=res.getInt("id");
                    row[1]=res.getString("name");
                    row[2]=res.getString("subject");
                    row[3]=res.getDouble("quiz");
                    row[4]=res.getDouble("midterm");
                    row[5]=res.getDouble("attendance");
                    row[6]=res.getDouble("final");
                       model.addRow(row);
                    }
                        }
                    catch(SQLException ex){
                            System.out.println(ex.getMessage());
                            }   
                           
                           
                           
                           
                           
                        break;
                        
                         case "modelling":
                   try{
                    Connection c  = aa.conect();
                    PreparedStatement pre =c.prepareStatement("select*from modelling");        
                   ResultSet res = pre.executeQuery();
                    while (res.next()){
                    row[0]=res.getInt("id");
                    row[1]=res.getString("name");
                    row[2]=res.getString("subject");
                    row[3]=res.getDouble("quiz");
                    row[4]=res.getDouble("midterm");
                    row[5]=res.getDouble("attendance");
                    row[6]=res.getDouble("final");
                      model.addRow(row);
                    }
                        }
                    catch(SQLException ex){
                            System.out.println(ex.getMessage());
                            }    
                             
                             
                        break; 
                          case "network":
                               
                       try{
                    Connection c  = aa.conect();
                    PreparedStatement pre =c.prepareStatement("select*from network");        
                   ResultSet res = pre.executeQuery();
                    while (res.next()){
                    row[0]=res.getInt("id");
                    row[1]=res.getString("name");
                    row[2]=res.getString("subject");
                    row[3]=res.getDouble("quiz");
                    row[4]=res.getDouble("midterm");
                    row[5]=res.getDouble("attendance");
                    row[6]=res.getDouble("final");
                       model.addRow(row);
                    }
                        }
                    catch(SQLException ex){
                            System.out.println(ex.getMessage());
                            }    
                              
                              
                        break;
                          case "programming_2":
                                   
                      try{
                    Connection c  = aa.conect();
                    PreparedStatement pre =c.prepareStatement("select*from programming_2");        
                   ResultSet res = pre.executeQuery();
                    while (res.next()){
                    row[0]=res.getInt("id");
                    row[1]=res.getString("name");
                    row[2]=res.getString("subject");
                    row[3]=res.getDouble("quiz");
                    row[4]=res.getDouble("midterm");
                    row[5]=res.getDouble("attendance");
                    row[6]=res.getDouble("final");
                       model.addRow(row);
                    }
                        }
                    catch(SQLException ex){
                            System.out.println(ex.getMessage());
                            } 
                        break;
                        
                    } //end switch 
           
                                                 
                       frame.add(t1);
                        frame.add(t2);
                          frame.add(t3);
                             frame.add(t4);
                                frame.add(t5);
                        frame.add(save);  
                         frame.add(exit);
             
                         
          save.addActionListener(new ActionListener() {
              @Override
              
              public void actionPerformed(ActionEvent ae) {
               switch(subject){
                   case "operating system":
                     
                update_t1( Integer.parseInt(t1.getText()) ,Double.parseDouble(t2.getText())  ,Double.parseDouble(t3.getText()) , Double.parseDouble(t4.getText()),Double.parseDouble(t5.getText())     ) ;
                  frame.dispose();
                  tablee T1=new tablee(subject);
                  break;
                   case "computer organization":
                     update_t2( Integer.parseInt(t1.getText()) ,Double.parseDouble(t2.getText())  ,Double.parseDouble(t3.getText()) , Double.parseDouble(t4.getText()),Double.parseDouble(t5.getText())     ) ;
                  frame.dispose();
                  tablee T2=new tablee(subject);
                  break;
                  
                   case "math3":
                     update_t3( Integer.parseInt(t1.getText()) ,Double.parseDouble(t2.getText())  ,Double.parseDouble(t3.getText()) , Double.parseDouble(t4.getText()),Double.parseDouble(t5.getText())     ) ;
                  frame.dispose();
                  tablee T3=new tablee(subject);
                  break;  
                    case "modelling":
                     update_t4( Integer.parseInt(t1.getText()) ,Double.parseDouble(t2.getText())  ,Double.parseDouble(t3.getText()) , Double.parseDouble(t4.getText()),Double.parseDouble(t5.getText())     ) ;
                  frame.dispose();
                  tablee T4=new tablee(subject);
                  break;
                    case "network":
                     update_t5( Integer.parseInt(t1.getText()) ,Double.parseDouble(t2.getText())  ,Double.parseDouble(t3.getText()) , Double.parseDouble(t4.getText()),Double.parseDouble(t5.getText())     ) ;
                  frame.dispose();
                  tablee T5=new tablee(subject);
                  break; 
                  case "programming_2":
                     update_t6( Integer.parseInt(t1.getText()) ,Double.parseDouble(t2.getText())  ,Double.parseDouble(t3.getText()) , Double.parseDouble(t4.getText()),Double.parseDouble(t5.getText())     ) ;
                  frame.dispose();
                  tablee T6=new tablee(subject);
                  break;
                  
                  
                  
                  
               }
              }
          });
          
          exit.addActionListener( new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent ae) {
                 System.exit(0);
              }
          });
          
          
          
                   
                    }//endconstructor
       
       
       
       public void update_t1(int n,double q,double m,double a,double f){
                               try{
                          Connection c= aa.conect();
                          Statement s=c.createStatement();
                         s.execute( "update operating_system set quiz='"+q+"' ,   midterm='"+m+"'  ,   attendance='"+a+"' ,   final='"+f+"'    where id='"+n+"'  ");
                        }catch (SQLException ex) {
                       System.out.println(ex.getMessage());
                }       
       }
       public void update_t2(int n,double q,double m,double a,double f){
                               try{
                          Connection c= aa.conect();
                          Statement s=c.createStatement();
                         s.execute( "update computer_organization set quiz='"+q+"' ,   midterm='"+m+"'  ,   attendance='"+a+"' ,   final='"+f+"'    where id='"+n+"'  ");
                        }catch (SQLException ex) {
                       System.out.println(ex.getMessage());
                }  
       
       
       }
  
      public void update_t3(int n,double q,double m,double a,double f){
                               try{
                          Connection c= aa.conect();
                          Statement s=c.createStatement();
                         s.execute( "update math3 set quiz='"+q+"' ,   midterm='"+m+"'  ,   attendance='"+a+"' ,   final='"+f+"'    where id='"+n+"'  ");
                        }catch (SQLException ex) {
                       System.out.println(ex.getMessage());
                }  
       
       
       }
      
    public void update_t4(int n,double q,double m,double a,double f){
                               try{
                          Connection c= aa.conect();
                          Statement s=c.createStatement();
                        s.execute( "update modelling set quiz='"+q+"' ,   midterm='"+m+"'  ,   attendance='"+a+"' ,   final='"+f+"'    where id='"+n+"'  ");
                        }catch (SQLException ex) {
                       System.out.println(ex.getMessage());
                }    
                }
    
     public void update_t5(int n,double q,double m,double a,double f){
                               try{
                          Connection c= aa.conect();
                          Statement s=c.createStatement();
                        s.execute( "update network set quiz='"+q+"' ,   midterm='"+m+"'  ,   attendance='"+a+"' ,   final='"+f+"'    where id='"+n+"'  ");
                        }catch (SQLException ex) {
                       System.out.println(ex.getMessage());
                }    
                }  
        public void update_t6(int n,double q,double m,double a,double f){
                               try{
                          Connection c= aa.conect();
                          Statement s=c.createStatement();
                        s.execute( "update programming_2 set quiz='"+q+"' ,   midterm='"+m+"'  ,   attendance='"+a+"' ,   final='"+f+"'    where id='"+n+"'  ");
                        }catch (SQLException ex) {
                       System.out.println(ex.getMessage());
                }    
                }
    
    
}