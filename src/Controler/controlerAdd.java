/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Product_Model.Add_pro;
import Product_Model.Operation;
import Product_Model.Operation_Factory;
import User_Interface_View.Add_Screen;
import User_Interface_View.Project_FinalMain;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mahran
 */
public class controlerAdd {
    public static void main(String[] args) {
        new controlerAdd();
    }
    controlerAdd(){}
   private Add_Screen AddV; 
   Operation_Factory s = new Operation_Factory();
   Operation addM = s.get_Operation("Add");
   
   public  controlerAdd(Operation addM , Add_Screen AddV){
   this.AddV=AddV;
   this.addM=addM;
   this.AddV.AccSave(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         addM.Operation(AddV.getjTextFieldID().getText(),AddV.getjTextFieldName().getText(),AddV.getjTextFieldPrice().getText());
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");
         JOptionPane.showMessageDialog(frame,"DONE Add Product");  
       }
   });
  this.AddV.AccCOMain(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         Project_FinalMain v= new Project_FinalMain();
         controlerMain s  = new controlerMain(v);
         v.setVisible(true);
         AddV.setVisible(false);
       }
   });
        
 
}

   
   
   
}
