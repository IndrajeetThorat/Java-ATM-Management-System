package atm.managment.system;

import javax.swing.*;
import java.awt.*;

import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener {
    
   
    JTextField pan , aadhar;
    JTextField nameTextField,fnameTextField,dobTextField,emailTextField,addressTextField,cityTextField,stateTextField,pinTextField;
    JButton next;
    JRadioButton syes ,sno , eyes ,eno;
    String formno;
    JComboBox  religion ,category ,education,income, occupation ;
          
    
    SignupTwo(String formno){
        
        this.formno =formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        
        
        
        //***LABLES AND TEXTFIELD
        
        JLabel additonalDetails = new JLabel("Page 2: Additonal Details" );
        additonalDetails.setFont(new Font("Raleway", Font.BOLD,22));
        additonalDetails.setBounds(290, 80, 400, 30);
        add(additonalDetails);
        
        
         //***LABLES AND TEXTFIELD
        JLabel name = new JLabel("Religon : " );
        name.setFont(new Font("Raleway", Font.BOLD,20));
        name.setBounds(100, 150, 100, 30);
        add(name);
        
       String valReligion[] = {"Hindu","Muslim","Sikh","Christan","Other"};
       religion = new JComboBox(valReligion);
       religion.setBounds(300, 150, 400, 30);
       religion.setBackground(Color.WHITE);
       add(religion);
        
        
       
        
         //***LABLES AND TEXTFIELD
        
    
        JLabel fname = new JLabel("Category :" );
        fname.setFont(new Font("Raleway", Font.BOLD,20));
        fname.setBounds(100, 200, 200, 30);
        add(fname);
        
        
        String valcategory[] = {"General","OBC","SC","NT","OTHER"};
        category = new JComboBox(valcategory);
        category.setBounds(300, 200, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
        
        
        
        //***LABLES AND TEXTFIELD
        
        JLabel dob = new JLabel("Income :" );
        dob.setFont(new Font("Raleway", Font.BOLD,20));
        dob.setBounds(100, 250, 200, 30);
        add(dob);
        
        
        String incomecategory[] = {"Null","< 1,50,000","< 2,50,000","<5,00,000","10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
        
        
         //***LABLES AND TEXTFIELD
         
        JLabel Gender = new JLabel("Educational :" );
        Gender.setFont(new Font("Raleway", Font.BOLD,20));
        Gender.setBounds(100, 300, 200, 30);
        add(Gender);
        

         
        JLabel email = new JLabel("Qualification " );
        email.setFont(new Font("Raleway", Font.BOLD,20));
        email.setBounds(100, 320, 200, 30);
        add(email);
        
        String educationValues[] = {"Non-Graduation","Graduate","Doctrate","Other",};
        education = new JComboBox(educationValues);
        education.setBounds(300, 310, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
        
     
         //***LABLES AND TEXTFIELD
         
        JLabel marital = new JLabel("Occupation :" );
        marital.setFont(new Font("Raleway", Font.BOLD,20));
        marital.setBounds(100, 400, 200, 30);
        add(marital);
        
        String occupationValues[] = {"Salaried","Self-Employed","Bussiness","Student","Retired","Other",};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 400, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        
         //***LABLES AND TEXTFIELD
         
        JLabel address = new JLabel("Pan No :" );
        address.setFont(new Font("Raleway", Font.BOLD,20));
        address.setBounds(100, 450, 200, 30);
        add(address);
        
        pan = new JTextField();
        pan.setFont(new Font("raleway",Font.BOLD,14));
        pan.setBounds(300, 450, 400, 30);
        add(pan);
        
        
        
         //***LABLES AND TEXTFIELD
         
        JLabel City = new JLabel("Addhar No :" );
        City.setFont(new Font("Raleway", Font.BOLD,20));
        City.setBounds(100, 500, 200, 30);
        add(City);
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("raleway",Font.BOLD,14));
        aadhar.setBounds(300, 500, 400, 30);
        add(aadhar);
        
        
       
         //***LABLES AND TEXTFIELD
         
        JLabel state = new JLabel("Senior Citizen :" );
        state.setFont(new Font("Raleway", Font.BOLD,20));
        state.setBounds(100, 550, 200, 30);
        add(state);
        
        
        syes = new JRadioButton("yes");
        syes.setBounds(300, 550, 80, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("no");
        sno.setBounds(450, 550, 80, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
      
        
        
        
        
         //***LABLES AND TEXTFIELD
         
        JLabel Pincode = new JLabel("Existing Account :" );
        Pincode.setFont(new Font("Raleway", Font.BOLD,20));
        Pincode.setBounds(100, 590, 200, 30);
        add(Pincode);
        
        
        
        
        eyes = new JRadioButton("yes");
        eyes.setBounds(300, 590, 80, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("no");
        eno.setBounds(450, 590, 80, 30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eyes);
        
        
        
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
        
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        
        
        String seniorcitizen = null;
        if(syes.isSelected()) {
            seniorcitizen ="yes";
        }else if (sno.isSelected()){
            seniorcitizen = "no";
        }
        
        
      
        String existingaccount = null;
        if (eyes.isSelected()){
            existingaccount = "yes";
            
            
        }else if (eno.isSelected()){
            existingaccount = "no";
        }
        
        
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        
        
        try{
            
                Conn c = new Conn();
                String query = "insert into signuptwo  values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                c.s.executeUpdate(query);
          
            
            //signup three object
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        }catch (Exception e) {
            System.out.println(e);
        }
    
    }   
    
    
    
    public static void main(String args[]){
        new SignupTwo("");  
        
    }
}
