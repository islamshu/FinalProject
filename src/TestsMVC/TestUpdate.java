/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestsMVC;

import Controler.controlerDelete;
import Controler.controlerUpdate;
import Product_Model.Add_pro;
import Product_Model.Update_pro;
import User_Interface_View.Delete_Screen;
import User_Interface_View.Update_Screen;

/**
 *
 * @author Mahran
 */
public class TestUpdate {
     public static void main(String[] args) {
        Update_pro m = new Update_pro();
         Update_Screen v = new  Update_Screen();
        Controler.controlerUpdate c = new controlerUpdate(m, v);
        v.setVisible(true);
    }
}
