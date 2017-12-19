/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Employees_Model.Check;
import Product_Model.Search_pro;
import User_Interface_View.Login;
import User_Interface_View.Project_FinalMain;
import User_Interface_View.Search_Screen;
import User_Interface_View.Search_Screen_N;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mahran
 */
public class controlerSearch_N {
    controlerSearch_N(){}
  private Search_Screen_N SearchV; 
    Search_pro SearchM= new Search_pro();
   
   public  controlerSearch_N(Search_pro Searchm , Search_Screen_N Searchv){
  
   this.SearchV=Searchv;
   this.SearchM=Searchm;
   
   this.SearchV.AccSave(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
        try {
          
            SearchM.Search_proh(SearchV.getjTextFieldSearch().getText());
            SearchV.setjTextFieldID(SearchM.getId());
            SearchV.setjTextFieldPrice(SearchM.getPrice());
            SearchV.setjTextFieldname(SearchM.getName());

        } catch (SQLException ex) {
            Logger.getLogger(Search_Screen_N.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
   });
   this.SearchV.AccCOMain(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
            Check m = new Check();
         Login v = new  Login();
        Controler.controlerlogin c = new controlerlogin(m, v);
        v.setVisible(true);
            
       }
   });
           
}      
}
