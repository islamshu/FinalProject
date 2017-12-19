/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Employees_Model.Check;
import Product_Model.Add_pro;
import Product_Model.Delete_pro;
import Product_Model.Operation;
import Product_Model.Operation_Factory;
import Product_Model.Search_pro;
import Product_Model.Update_pro;
import TestsMVC.TestADD;
import User_Interface_View.Add_Screen;
import User_Interface_View.Delete_Screen;
import User_Interface_View.Login;
import User_Interface_View.Project_FinalMain;
import User_Interface_View.Search_Screen;
import User_Interface_View.Update_Screen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Mahran
 */
public class controlerMain {

    
 Project_FinalMain vp= new Project_FinalMain();
  
 
 public controlerMain(Project_FinalMain v){
     vp.setVisible(true);
     
 v.AccUpdate(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent e) {
        Update_pro m = new Update_pro();
         Update_Screen v = new  Update_Screen();
        Controler.controlerUpdate c = new controlerUpdate(m, v);
        vp.setVisible(false);
        v.setVisible(true);
        
     }
 });
 
 
 
 v.Accadd(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent e) {
         Add_pro m = new Add_pro();
        Add_Screen v = new Add_Screen();
        Controler.controlerAdd c = new controlerAdd(m, v);
        vp.setVisible(false);
        v.setVisible(true);
}
 });
 
 
 
 
 v.Accdelete(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent e) {
        Delete_pro m = new Delete_pro();
        Delete_Screen v = new Delete_Screen();
        Controler.controlerDelete c = new controlerDelete(m, v);
         vp.setVisible(false);
        v.setVisible(true);
       
     }
 });
 
 
 
 v.Accsearch(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent e) {
        Search_Screen v = new Search_Screen();
        Search_pro m =new Search_pro();
        Controler.controlerSearch c = new controlerSearch(m, v);
        vp.setVisible(false);
        v.setVisible(true);
        
     }
 });
 
 
 
 v.AccLogout(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent e) {
         Check m = new Check();
         Login v = new  Login();
        Controler.controlerlogin c = new controlerlogin(m, v);
         vp.setVisible(false);
        v.setVisible(true);
       
     }
 });
 
 
 
 }
 
}
