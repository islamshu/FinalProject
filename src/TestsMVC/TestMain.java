/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestsMVC;

import Controler.controlerMain;
import User_Interface_View.Project_FinalMain;

/**
 *
 * @author Mahran
 */
public class TestMain {
    public static void main(String[] args) {
        Project_FinalMain v= new Project_FinalMain();
         controlerMain s  = new controlerMain(v);
         v.setVisible(true);
         
         
    }
 
}
