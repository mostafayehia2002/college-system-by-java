
package javaapplication;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Degree_student {
   
    Degree_student(  String name ,String subject ,double quiz,double midterm,double attendance,double fin){
       
   
            JFrame f1 = new JFrame();
            JPanel p1 = new JPanel();
            JLabel l = new JLabel( );
            JLabel l1 = new JLabel("name :");
            JLabel l2 = new JLabel("quiz : ");
            JLabel l3 = new JLabel("midterm :");
            JLabel l4 = new JLabel("attendance :");
            JLabel l5 = new JLabel("final :");
            JLabel s1 = new JLabel("show");
            JLabel s2 = new JLabel("show");
            JLabel s3 = new JLabel("show");
            JLabel s4 = new JLabel("show");
            JLabel s5 = new JLabel("show");
            JButton b1 = new JButton("ok");
            JButton b2 = new JButton("exist");

            f1.setLocation(500, 200);
            f1.setTitle("student");
            f1.setSize(700, 700);
            f1.setResizable(false);
            f1.setVisible(true);
            f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            p1.setSize(300, 500);
            p1.setLayout(null);
            l.setBounds(220, 25, 300, 50);
            l1.setBounds(20, 100, 100, 50);
            l2.setBounds(20, 150, 100, 50);
            l3.setBounds(20, 200, 100, 50);
            l4.setBounds(20, 250, 100, 50);
            l5.setBounds(20,300, 100, 50);
            s1.setBounds(400, 100, 100, 50);
            s2.setBounds(400, 150, 100, 50);
            s3.setBounds(400, 200, 100, 50);
            s4.setBounds(400, 250, 100, 50);
            s5.setBounds(400, 300, 100, 50);
            b1.setBounds(400, 500, 100, 50);
            b2.setBounds(550, 500, 100, 50);
            p1.setBackground(Color.white);
            l.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
            b1.setBackground(Color.red);
            b1.setForeground(Color.white);
            b2.setBackground(Color.red);
            b2.setForeground(Color.white);
            f1.add(p1);
            p1.add(l1);
            p1.add(l2);
            p1.add(l3);
            p1.add(l4);
            p1.add(l5);
            p1.add(b1);
            p1.add(b2);
            p1.add(s1);
            p1.add(s2);
            p1.add(s3);
            p1.add(s4);
            p1.add(s5);
            p1.add(l);
           l.setText(subject);
           s1.setText(name); 
           s2.setText(subject);
           s2.setText(  String.valueOf(quiz));
            s3.setText(  String.valueOf(midterm));
            s4.setText(  String.valueOf(attendance));
            s5.setText(  String.valueOf(fin));
         b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                   
                  JOptionPane.showMessageDialog(null, "thank you for using system and we wish you to be successful in life ");
              
                }
            });

            b2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {

              
                     f1.dispose();
                }
            });
          

        }

    }

