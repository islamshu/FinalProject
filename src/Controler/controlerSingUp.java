/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Employees_Model.Check;
import Employees_Model.Emp_Facade;
import Employees_Model.N_Employee;
import Management_Model.Operation;
import User_Interface_View.Add_Screen;
import User_Interface_View.Login;
import User_Interface_View.Project_FinalMain;
import User_Interface_View.SingUp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mahran
 */
public class controlerSingUp {
    public controlerSingUp(){}
    SingUp SnginV ;
    Emp_Facade s = new Emp_Facade();
    

  public  controlerSingUp(Emp_Facade s , SingUp SnginV){
   this.s=s;
   this.SnginV=SnginV;
   
   this.SnginV.AccSave(new ActionListener() {
      
       @Override
       public void actionPerformed(ActionEvent e) {
        s.setName(SnginV.getjTextFieldName().getText());
        s.setPrice(SnginV.getjTextFieldPrice().getText());
        s.get_n_Employee();
         JFrame frame = new JFrame("JOptionPane showMessageDialog example");
         JOptionPane.showMessageDialog(frame,"DONE SingUp");

       }
   });
   this.SnginV.AccLogout(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
          Check m = new Check();
          Login v = new  Login();
          Controler.controlerlogin c = new controlerlogin(m, v);
          v.setVisible(true);
          SnginV.setVisible(false);
       }
   });
}
}

