/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;


import Product_Model.Operation;
import Product_Model.Operation_Factory;
import Product_Model.Search_pro;

import User_Interface_View.Delete_Screen;
import User_Interface_View.Project_FinalMain;
import User_Interface_View.Search_Screen;
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
public class controlerSearch {
    controlerSearch(){}
    private Search_Screen SearchV; 
    Search_pro SearchM= new Search_pro();
   
   public  controlerSearch(Search_pro Searchm , Search_Screen Searchv){
  
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
            Logger.getLogger(controlerSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
   });
   this.SearchV.AccCOMain(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
            Project_FinalMain v= new Project_FinalMain();
         controlerMain s  = new controlerMain(v);
         v.setVisible(true);
         SearchV.setVisible(false);
       }
   });
           
}   
              
             
}
   
 

