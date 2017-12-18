/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestsMVC;

import Controler.controlerSingUp;
import Controler.controlerUpdate;
import Employees_Model.A_Employee;
import Employees_Model.Emp_Facade;
import Management_Model.Update_pro;
import User_Interface_View.SingUp;
import User_Interface_View.Update_Screen;

/**
 *
 * @author Mahran
 */
public class TestSingUp {
 public static void main(String[] args) {
        Emp_Facade m = new Emp_Facade();
         SingUp v = new  SingUp();
        Controler.controlerSingUp c = new controlerSingUp(m, v);
        v.setVisible(true);
    }    
}
