package it.tss.Lez002;


import it.tss.Lez002.Cellphone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tss
 */
public class MainAppCellphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cellphone cell1 = new Cellphone("TIM", "123456789");
        Cellphone cell2 = new Cellphone("TRE", "987654321");
        Cellphone cell3 = new Cellphone("IlIAD", "555555555");

        Cellphone.setCost("TIM", "TRE", 0.25);

        System.out.println(cell1.getCost(cell2, 10));
        
        System.out.println(cell2.getCost(cell3, 10));
        
    }

}
