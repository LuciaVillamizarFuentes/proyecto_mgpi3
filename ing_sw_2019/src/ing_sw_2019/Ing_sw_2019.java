/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Ing_sw_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int numero){
          if ( numero <= 1 ) {
              return 1;
          } else {
              return numero*factorial(numero-1);
          }
     }
}
