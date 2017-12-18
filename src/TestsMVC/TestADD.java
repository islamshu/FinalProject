/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestsMVC;

import Controler.controlerAdd;
import Management_Model.Add_pro;
import User_Interface_View.Add_Screen;

/**
 *
 * @author Mahran
 */
public class TestADD {
    public static void main(String[] args) {
        Add_pro m = new Add_pro();
        Add_Screen v = new Add_Screen();
        Controler.controlerAdd c = new controlerAdd(m, v);
        v.setVisible(true);
    }
     
        
}
