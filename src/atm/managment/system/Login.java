package atm.managment.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener   {
    
    
    JButton login, clear, signup;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Login() {
        
        setTitle("Automated Teller Machine");
        setLayout(null);
                
                ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/image 1.jpg"));
                Image i2 = i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);

                ImageIcon i3 = new ImageIcon(i2);
                
                JLabel lable = new JLabel(i3);
                lable.setBounds(70, 10, 100, 100);
                add(lable);
                
                JLabel text = new JLabel("welocme to ATM");
                text.setFont(new Font("Osward",Font.BOLD,38));
                text.setBounds(200, 40,400 ,40 );
                add(text);
                
                JLabel cardno = new JLabel("Card No:");
                cardno.setFont(new Font("Raleway",Font.BOLD,30));
                cardno.setBounds(120, 150,400 ,30 );
                add(cardno);
                
                cardTextField = new JTextField();
                cardTextField.setBounds(300, 150, 250, 30);
                add(cardTextField);
                
                
                JLabel pin = new JLabel("PIN:");
                pin.setFont(new Font("Raleway",Font.BOLD,30));
                pin.setBounds(120, 220,250 ,30 );
                add(pin);
                
                pinTextField = new JPasswordField();
                pinTextField.setBounds(300, 220, 250, 30);
                add(pinTextField);
                
                login = new JButton("Sign In");
                login.setBounds(300, 300, 100, 30);
                login.setBackground(Color.BLACK);
                login.setForeground(Color.WHITE);
                login.addActionListener(this);
                add(login);
                
                
                clear = new JButton("CLEAR");
                clear.setBounds(440, 300, 100, 30);
                clear.setBackground(Color.BLACK);
                clear.setForeground(Color.WHITE);
                clear.addActionListener(this);
                add(clear);
                
                
                signup = new JButton("SIGN UP");
                signup.setBounds(305, 350, 230, 30);
                signup.setBackground(Color.BLACK);
                signup.setForeground(Color.WHITE);
                signup.addActionListener(this);
                add(signup);
                
                
                
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if (ae.getSource() ==clear){ 
            cardTextField.setText("");
            pinTextField.setText("");
            
        }else if (ae.getSource()== login) {
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "Select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
            try{
                ResultSet rs = conn.s.executeQuery(query);
                if(rs.next()) {
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null,"incorrect Card Number or Pin");                }
                
                
            } catch(Exception e){
                System.out.println(e);
                
                
            }
        }else if (ae.getSource() == signup){
            
            setVisible(false);
            new SignupOne().setVisible(true);
        }
        
    
   
    }
    
    
    
    public static void main(String arg[]){
        new Login();
    
    }
}
