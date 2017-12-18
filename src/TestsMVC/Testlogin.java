/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestsMVC;

import Controler.controlerSingUp;
import Controler.controlerlogin;
import Employees_Model.Emp_Facade;
import Employees_Model.Check;
import User_Interface_View.Login;
import User_Interface_View.SingUp;

/**
 *
 * @author Mahran
 */
public class Testlogin {
     public static void main(String[] args) {
        Check m = new Check();
         Login v = new  Login();
        Controler.controlerlogin c = new controlerlogin(m, v);
        v.setVisible(true);
    }  
}
