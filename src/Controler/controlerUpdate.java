/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Product_Model.Operation;
import Product_Model.Operation_Factory;
import User_Interface_View.Delete_Screen;
import User_Interface_View.Project_FinalMain;
import User_Interface_View.Update_Screen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mahran
 */
public class controlerUpdate {
    public controlerUpdate(){}
    
private Update_Screen UpdateV; 
   Operation_Factory s = new Operation_Factory();
   Operation UpdateM = s.get_Operation("Update");
   
   public  controlerUpdate(Operation UpdateM , Update_Screen UpdateV){
   this.UpdateM=UpdateM;
   this.UpdateV=UpdateV;
   
   this.UpdateV.AccSave(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         
        UpdateM.Operation(UpdateV.getjTextFieldID().getText());
        
         JFrame frame = new JFrame("JOptionPane showMessageDialog example");
         JOptionPane.showMessageDialog(frame,"DONE Update");
       }
   });
   this.UpdateV.AccCOMain(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         Project_FinalMain v= new Project_FinalMain();
         controlerMain s  = new controlerMain(v);
         v.setVisible(true);
         UpdateV.setVisible(false);
       }
   });
           
 
}       
}
