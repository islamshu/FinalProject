/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Employees_Model.Emp_Facade;
import Employees_Model.Check;
import Product_Model.Search_pro;
import User_Interface_View.Login;
import User_Interface_View.Project_FinalMain;
import User_Interface_View.Search_Screen;
import User_Interface_View.Search_Screen_N;
import User_Interface_View.SingUp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mahran
 */
public class controlerlogin {
      Login loginV ;
    Check   loginM = new Check() ;
    
public controlerlogin(){}
  public  controlerlogin(Check loginM , Login loginV){
   this.loginV=loginV;
   this.loginM=loginM;
   
   this.loginV.AccLogin(new ActionListener() {
      
       @Override
       public void actionPerformed(ActionEvent e) {
           try {
             if(loginM.Check(loginV.getjTextFieldName().getText(),loginV.getjTextFieldName().getText())==true){
                
                JOptionPane.showMessageDialog(null,"Welcom");
                Project_FinalMain v= new Project_FinalMain();
                controlerMain s  = new controlerMain(v);
                loginV.setVisible(false);
                v.setVisible(true);
                
            }else{
                 
            JOptionPane.showMessageDialog(null,"Welcom");     
            Search_Screen_N v = new Search_Screen_N();
            Search_pro m =new Search_pro();
            Controler.controlerSearch_N c = new controlerSearch_N(m, v);
            loginV.setVisible(false);
            v.setVisible(true);
            
//            }
             
             }
//         JFrame frame = new JFrame("JOptionPane showMessageDialog example");
//         JOptionPane.showMessageDialog(frame,"DONE");
             
           
           } catch (SQLException ex) {
               Logger.getLogger(controlerlogin.class.getName()).log(Level.SEVERE, null, ex);
           }

       }
   });
   
   this.loginV.AccSingin(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
        Emp_Facade m = new Emp_Facade();
         SingUp v = new  SingUp();
        Controler.controlerSingUp c = new controlerSingUp(m, v);
        v.setVisible(true);
       }
   });
}
}
