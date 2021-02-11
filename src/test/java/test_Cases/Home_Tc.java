package test_Cases;

import commons.Base_Class;
import page_Objects.Home_Po;

import java.io.IOException;

public class Home_Tc extends Base_Class {
    public static void main(String[] args) throws InterruptedException, IOException {
        pretest();
        Home_Po homePo=new Home_Po(driver);
        homePo.Home_Task();
        protest();

    }
}
