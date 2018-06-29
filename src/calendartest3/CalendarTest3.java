/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendartest3;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
/**
 *
 * @author J.S
 */
public class CalendarTest3 extends JFrame {
    
    DefaultTableModel table1;
    Calendar cal = new GregorianCalendar();
    JLabel label = new JLabel(); 
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    JLabel label4 = new JLabel();
    JLabel label5 = new JLabel();
    JPanel panelSeas = new JPanel();
    
    ImageIcon icon1 = new ImageIcon("src/CalendarTest3/Spring.jpg");
    ImageIcon icon2 = new ImageIcon("src/CalendarTest3/Summer.jpg");
    ImageIcon icon3 = new ImageIcon("src/CalendarTest3/Fall.jpg");
    ImageIcon icon4 = new ImageIcon("src/CalendarTest3/Winter.jpg");
    
    
    
    
    public CalendarTest3(){
        
        this.setTitle("Calendar");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setVisible(true);
        
        
        
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Courier", Font.BOLD, 14));
        
        
        JButton b1 = new JButton("<-");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            cal.add(Calendar.MONTH, -1);
            panelSeas.remove(label2);
            updateMonth();
            }
        });
 
        JButton b2 = new JButton("->");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            cal.add(Calendar.MONTH, +1);
            panelSeas.remove(label2);
            updateMonth();
            }
        });
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(b1, BorderLayout.WEST);
        panel.add(label, BorderLayout.CENTER);
        panel.add(b2, BorderLayout.EAST);
        
        
        
        String [] columns = {"Sun", "Mon", "Tues", "Wed",
            "Thurs", "Fri", "Sat"};
        table1 = new DefaultTableModel(null,columns);  
        JTable table2 = new JTable(table1);
        table2.setRowHeight(65);
        table2.setEnabled(false);
        JScrollPane pane = new JScrollPane(table2);
        
        

        this.add(panel, BorderLayout.NORTH);
        this.add(pane, BorderLayout.SOUTH);
        
        this.updateMonth();
    }
  
        void updateMonth() {
            cal.set(Calendar.DAY_OF_MONTH, 1);
 
            String month = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);
            
            int year = cal.get(Calendar.YEAR);
            label.setText(month + " " + year);
            
            int startDay = cal.get(Calendar.DAY_OF_WEEK);
            int numberOfDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
            //int weeks = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);
 
            table1.setRowCount(0);
            table1.setRowCount(6);
            
            
            if (month == "January")
            {                
                icon1 = new ImageIcon("src/CalendarTest3/Winter.jpg"); 
                label2 = new JLabel(icon1);
                panelSeas.add(label2, BorderLayout.CENTER);
                this.add(panelSeas, BorderLayout.CENTER);  
            };
            if (month == "February")
            {                
                icon1 = new ImageIcon("src/CalendarTest3/Winter.jpg"); 
                label2 = new JLabel(icon1);
                panelSeas.add(label2, BorderLayout.CENTER);
                this.add(panelSeas, BorderLayout.CENTER);  
            };
            if (month == "March")
            {                
                icon1 = new ImageIcon("src/CalendarTest3/Spring.jpg"); 
                label2 = new JLabel(icon1);
                panelSeas.add(label2, BorderLayout.CENTER);
                this.add(panelSeas, BorderLayout.CENTER);  
            };
            if (month == "April")
            {
                icon1 = new ImageIcon("src/CalendarTest3/Spring.jpg");
                label2 = new JLabel(icon1);
                panelSeas.add(label2, BorderLayout.CENTER);
                this.add(panelSeas, BorderLayout.CENTER);
                
                
            };
            if (month == "May")
            {
                icon1 = new ImageIcon("src/CalendarTest3/Spring.jpg"); 
                label2 = new JLabel(icon1);
                panelSeas.add(label2, BorderLayout.CENTER);
                this.add(panelSeas, BorderLayout.CENTER);  
            };
            if (month == "June")
            {
                icon1 = new ImageIcon("src/CalendarTest3/Summer.jpg"); 
                label2 = new JLabel(icon1);
                panelSeas.add(label2, BorderLayout.CENTER);
                this.add(panelSeas, BorderLayout.CENTER);   
            };
            if (month == "July")
            {
                icon1 = new ImageIcon("src/CalendarTest3/Summer.jpg"); 
                label2 = new JLabel(icon1);
                panelSeas.add(label2, BorderLayout.CENTER);
                this.add(panelSeas, BorderLayout.CENTER); 
            };
            if (month == "August")
            {
                icon1 = new ImageIcon("src/CalendarTest3/Summer.jpg"); 
                label2 = new JLabel(icon1);
                panelSeas.add(label2, BorderLayout.CENTER);
                this.add(panelSeas, BorderLayout.CENTER); 
            };
            if (month == "September")
            {                
                icon1 = new ImageIcon("src/CalendarTest3/Fall.jpg"); 
                label2 = new JLabel(icon1);
                panelSeas.add(label2, BorderLayout.CENTER);
                this.add(panelSeas, BorderLayout.CENTER);  
            };
            if (month == "October")
            {                
                icon1 = new ImageIcon("src/CalendarTest3/Fall.jpg"); 
                label2 = new JLabel(icon1);
                panelSeas.add(label2, BorderLayout.CENTER);
                this.add(panelSeas, BorderLayout.CENTER);  
            };
            if (month == "November")
            {                
                icon1 = new ImageIcon("src/CalendarTest3/Fall.jpg"); 
                label2 = new JLabel(icon1);
                panelSeas.add(label2, BorderLayout.CENTER);
                this.add(panelSeas, BorderLayout.CENTER);  
            };
            if (month == "December")
            {                
                icon1 = new ImageIcon("src/CalendarTest3/Winter.jpg"); 
                label2 = new JLabel(icon1);
                panelSeas.add(label2, BorderLayout.CENTER);
                this.add(panelSeas, BorderLayout.CENTER);  
            };
            
            
            
            
            
            int i = startDay-1;
            for(int day=1;day<=numberOfDays;day++){
                table1.setValueAt(day, i/7 , i%7 );    
                i = i + 1;
            }
            
           
        }; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        CalendarTest3 frame = new CalendarTest3();
            
    }
    
}
