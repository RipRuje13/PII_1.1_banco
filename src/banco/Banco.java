
package banco;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        Cuenta c1= new Cuenta(0003,"Rogelio",10500.50);
        Cuenta c2= new Cuenta(1200,"Evelin",9000);
        
        
        Cuenta cambios =c2.muestraDatos(c2);
        System.out.println(cambios);
        c2.setTitular("Lizbeth");
        c2.depositar(c2);
        Cuenta md = c2.muestraDatos(c2);
        System.out.println(md);
        c1.retirar(c1);
        Cuenta md2 = c1.muestraDatos(c1);
        System.out.println(md2);
        
    }
    
}
