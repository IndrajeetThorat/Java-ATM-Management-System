
package atm.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;


public class FastCash extends JFrame implements ActionListener {
    
    JButton deposit ,withdrawl, ministatment , pinchange,fastcash , balanceenquiry,back;
    String pinnumber;
    FastCash (String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/machine.jpg.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("Select Withdrawl Amount" );
        text.setBounds(210, 300, 700, 35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System ",Font.BOLD,16));
        add(text);
        
        deposit = new JButton("Rs 100");
        deposit.setBounds(160,450,120,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl = new JButton("Rs 500");
        withdrawl.setBounds(390,450,120,30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash = new JButton("Rs 1000");
        fastcash.setBounds(160,488,120,30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatment = new JButton("Rs 2000");
        ministatment.setBounds(390,485,120,30);
        ministatment.addActionListener(this);
        image.add(ministatment);
        
        
        pinchange = new JButton("Rs 5000");
        pinchange.setBounds(160,525,120,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceenquiry = new JButton("Rs 10000");
        balanceenquiry.setBounds(390,525,120,30);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
        back = new JButton("BACK");
        back.setBounds(390,565,120,30);
        back.addActionListener(this);
        image.add(back);
        
        
        
        setSize(900,900);
        setLocation(300,0);
        //setUndecorated(true);
        setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back) {
            setVisible(true);
            new Transaction(pinnumber).setVisible(true);
        
    
        } else {
            
                
            
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            Conn c =new Conn();
            try{
            
               ResultSet rs = c.s.executeQuery("select *from bank where pin = "+pinnumber+"'");
               int balance =0;
               
               while (rs.next()) {
                   if (rs.getString("type").equals("Deposit")) {
                       balance +=Integer.parseInt(rs.getString("amount"));
                       
                   }else {
                       balance -= Integer.parseInt(rs.getString("amount"));
                       
                   }
               }
               
               if(ae.getSource () != back && balance < Integer.parseInt(amount)){
                   JOptionPane.showMessageDialog(null, "Insufficient Balance");
                   return;
               }
               
               Date date = new Date();
               String query = "insert into bank values ('"+pinnumber+"','"+date+"','withdrawl','"+amount+"')";
               c.s.executeUpdate(query);
               JOptionPane.showMessageDialog(null,"Rs " + amount +"Debited sucessfully");  
               
               setVisible(false);
               new Transaction(pinnumber).setVisible(true);
               
               
            }catch (Exception e) {
               System.out.println(e);
               
               
            }
                
            }
           
        
        
      }
    
    
    public static void main(String args[]) {
        
        new FastCash("");
    }
}











    

