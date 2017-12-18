/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Management_Model.Operation;
import Management_Model.Operation_Factory;
import User_Interface_View.Add_Screen;
import User_Interface_View.Delete_Screen;
import User_Interface_View.Project_FinalMain;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mahran
 */
public class controlerDelete {
    
    controlerDelete(){}
  private Delete_Screen DeleteV; 
   Operation_Factory s = new Operation_Factory();
   Operation DeleteM = s.get_Operation("Delete");
   
   public  controlerDelete(Operation deleteM , Delete_Screen deleteV){
   this.DeleteM=deleteM;
   this.DeleteV=deleteV;
   
   this.DeleteV.AccSave(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         Operation_Factory s = new Operation_Factory();
        Operation op2 = s.get_Operation("Delete");
        op2.Operation(DeleteV.getjTextFieldID().getText());
        
         JFrame frame = new JFrame("JOptionPane showMessageDialog example");
         JOptionPane.showMessageDialog(frame,"DONE Delete Product");
       }
   });
   this.DeleteV.AccCOMain(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         Project_FinalMain v= new Project_FinalMain();
         controlerMain s  = new controlerMain(v);
         v.setVisible(true);
         DeleteV.setVisible(false);
       }
   });
           
 
}   
    
}
