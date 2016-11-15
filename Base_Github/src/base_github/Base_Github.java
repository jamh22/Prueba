/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base_github;

import java.util.Scanner;

/**
 *
 * @author munoz
 */
public class Base_Github {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);

        int numero, ud, dc, ce, um;
        String uni="", dec="", cen="", mil="";
        //int numero, ud, dc, ce, um;

        do {
            System.out.print("Ingrese un numero entre el 1 y el 3999: ");
            numero = teclado.nextInt();
        } while (numero < 0 || numero > 3999);
        {
            ud = numero % 10;
            dc = numero % 100 / 10;
            ce = numero % 1000 / 100;
            um = numero % 10000 / 1000;


            switch (ud) {
                case 1:
                    uni = "I";
                    break;
                case 2:
                    uni = "II";
                    break;
                case 3:
                    uni = "III";
                    break;
                case 4:
                    uni = "IV";
                    break;
                case 5:
                    uni = "V";
                    break;
                case 6:
                    uni = "VI";
                    break;
                case 7:
                    uni = "VII";
                    break;
                case 8:
                    uni = "VIII";
                    break;
                case 9:
                    uni = "IX";
                    break;

            }
            switch (dc) {
                case 1:
                    dec = "X";
                    break;
                case 2:
                    dec = "XX";
                    break;
                case 3:
                    dec = "XXX";
                    break;
                case 4:
                    dec = "XL";
                    break;
                case 5:
                    dec = "L";
                    break;
                case 6:
                    dec = "LX";
                    break;
                case 7:
                    dec = "LXX";
                    break;
                case 8:
                    dec = "LXXX";
                    break;
                case 9:
                    dec = "XC";
                    break;

            }
            switch (ce) {
                case 1:
                    cen = "C";
                    break;
                case 2:
                    cen = "CC";
                    break;
                case 3:
                    cen = "CCC";
                    break;
                case 4:
                    cen = "CD";
                    break;
                case 5:
                    cen = "D";
                    break;
                case 6:
                    cen = "DC";
                    break;
                case 7:
                    cen = "DCC";
                    break;
                case 8:
                    cen = "DCCC";
                    break;
                case 9:
                    cen = "CM";
                    break;

            }
            switch (um) {
                case 1:
                    mil = "M";
                    break;
                case 2:
                    mil = "MM";
                    break;
                case 3:
                    mil = "MMM";
            }

            System.out.println(mil + cen +  dec + uni);

        }
    }
}
