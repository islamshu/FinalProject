/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestsMVC;

import Controler.controlerAdd;
import Controler.controlerDelete;
import Management_Model.Add_pro;
import Management_Model.Delete_pro;
import User_Interface_View.Add_Screen;
import User_Interface_View.Delete_Screen;

/**
 *
 * @author Mahran
 */
public class TestDelete {
    public static void main(String[] args) {
        Delete_pro m = new Delete_pro();
        Delete_Screen v = new Delete_Screen();
        Controler.controlerDelete c = new controlerDelete(m, v);
        v.setVisible(true);
    }
     
}
