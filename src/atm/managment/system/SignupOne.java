package atm.managment.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupOne extends JFrame implements ActionListener {
    
    long random;
    JTextField nameTextField,fnameTextField,dobTextField,emailTextField,addressTextField,cityTextField,stateTextField,pinTextField;
    JButton next;
    JRadioButton male,female,married,unmarried;
    JDateChooser dateChooser;        
          
    
    SignupOne(){
        
        setLayout(null);
        Random ran = new Random();
        random = Math.abs((ran.nextLong() %9000L)+1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO." + random );
        formno.setFont(new Font("Raleway", Font.BOLD,38));
        formno.setBounds(140, 20, 600, 30);
        add(formno);
        
        
        //***LABLES AND TEXTFIELD
        
        JLabel personDetails = new JLabel("Page 1: Personal Details" );
        personDetails.setFont(new Font("Raleway", Font.BOLD,22));
        personDetails.setBounds(290, 80, 400, 30);
        add(personDetails);
        
        
         //***LABLES AND TEXTFIELD
        JLabel name = new JLabel("Name : " );
        name.setFont(new Font("Raleway", Font.BOLD,20));
        name.setBounds(100, 150, 100, 30);
        add(name);
        
       
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("raleway",Font.BOLD,14));
        nameTextField.setBounds(300, 150, 400, 30);
        add(nameTextField);
        
        
         //***LABLES AND TEXTFIELD
         
        JLabel fname = new JLabel("Father's Name :" );
        fname.setFont(new Font("Raleway", Font.BOLD,20));
        fname.setBounds(100, 200, 200, 30);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("raleway",Font.BOLD,14));
        fnameTextField.setBounds(300, 200, 400, 30);
        add(fnameTextField);
        
        
        
        //***LABLES AND TEXTFIELD
        
        JLabel dob = new JLabel("Date of Birth :" );
        dob.setFont(new Font("Raleway", Font.BOLD,20));
        dob.setBounds(100, 250, 200, 30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 250, 400, 30);
        dateChooser.setForeground(new Color(105,105 ,105));
        add(dateChooser);
        
        
        
         //***LABLES AND TEXTFIELD
         
        JLabel Gender = new JLabel("Gender :" );
        Gender.setFont(new Font("Raleway", Font.BOLD,20));
        Gender.setBounds(100, 300, 200, 30);
        add(Gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300, 300, 80, 30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450, 300, 80, 30);
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        
        
         //***LABLES AND TEXTFIELD
         
        JLabel email = new JLabel("Email :" );
        email.setFont(new Font("Raleway", Font.BOLD,20));
        email.setBounds(100, 350, 200, 30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("raleway",Font.BOLD,14));
        emailTextField.setBounds(300, 350, 400, 30);
        add(emailTextField);
        
        
        
         //***LABLES AND TEXTFIELD
         
        JLabel marital = new JLabel("Marital Status :" );
        marital.setFont(new Font("Raleway", Font.BOLD,20));
        marital.setBounds(100, 400, 200, 30);
        add(marital);
        
        married = new JRadioButton("married");
        married.setBounds(300, 400, 80, 30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried = new JRadioButton("unmarried");
        unmarried.setBounds(450, 400, 80, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        
        
        
         //***LABLES AND TEXTFIELD
         
        JLabel address = new JLabel("address :" );
        address.setFont(new Font("Raleway", Font.BOLD,20));
        address.setBounds(100, 450, 200, 30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("raleway",Font.BOLD,14));
        addressTextField.setBounds(300, 450, 400, 30);
        add(addressTextField);
        
        
        
         //***LABLES AND TEXTFIELD
         
        JLabel City = new JLabel("City :" );
        City.setFont(new Font("Raleway", Font.BOLD,20));
        City.setBounds(100, 500, 200, 30);
        add(City);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("raleway",Font.BOLD,14));
        cityTextField.setBounds(300, 500, 400, 30);
        add(cityTextField);
        
        
       
         //***LABLES AND TEXTFIELD
         
        JLabel state = new JLabel("state :" );
        state.setFont(new Font("Raleway", Font.BOLD,20));
        state.setBounds(100, 550, 200, 30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("raleway",Font.BOLD,14));
        stateTextField.setBounds(300, 550, 400, 30);
        add(stateTextField);
       
         //***LABLES AND TEXTFIELD
         
        JLabel Pincode = new JLabel("Pincode :" );
        Pincode.setFont(new Font("Raleway", Font.BOLD,20));
        Pincode.setBounds(100, 600, 200, 30);
        add(Pincode);
        
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("raleway",Font.BOLD,14));
        pinTextField.setBounds(300, 600, 400, 30);
        add(pinTextField);
        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Realeway",Font.BOLD,14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
    
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String formno=""+random;// long
        String name = nameTextField.getText(); // setText
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()) {
            gender ="Male";
        }else if (female.isSelected()){
            gender = "Female";
        }
        String email = emailTextField.getText();
        String marital = null;
        if (married.isSelected()){
            marital = "Married";
            
            
        }else if (unmarried.isSelected()){
            marital = "unmarried";
        }
        
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();
        
        
        
        try{
            if(name.equals("")) {
                JOptionPane.showMessageDialog(null,"Name is Required");
                
            }else{
                Conn c= new Conn();
                String query = "insert into signup  values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                c.s.executeUpdate(query);
            
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
            
            
            
        }catch (Exception e) {
            System.out.println(e);
        }
    
    }   
    
    
    
    public static void main(String args[]){
        new SignupOne();  
        
    }
}
