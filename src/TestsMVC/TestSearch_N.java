/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestsMVC;

import Controler.controlerSearch;
import Management_Model.Search_pro;
import User_Interface_View.Search_Screen;
import java.sql.SQLException;

/**
 *
 * @author Mahran
 */
public class TestSearch_N {
     public static void main(String[] args) throws SQLException {
        
        Search_Screen v = new Search_Screen();
        Search_pro m =new Search_pro();
        Controler.controlerSearch c = new controlerSearch(m, v);
        v.setVisible(true);
    }
}