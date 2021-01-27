/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;


public class Cuenta {
    private int numero;
    private String titular;
    private double saldo;
    
    public Cuenta(){
        numero = 0000;
        titular = "Nombre";
        saldo = 0;
        
     }
    
    public Cuenta (int numero, String titular, double saldo ){
        this.numero=numero;
        this.titular=titular;
        this.saldo=saldo;
        
    }
    
    public int getNumero(){
        return numero;
        
    }
    
    public String getTitular(){
        return titular;
    }
    
    public double getSaldo(){
        return saldo;
        
    }
    
    public void setTitular( String titular ){
        this.titular=titular;
        
        }
    
     public void depositar(Cuenta c ){
     Scanner sc = new Scanner(System.in);
     double deposito;
     System.out.println("Dijite la cantidad que desea depositar");
     deposito = sc.nextDouble();
     saldo=getSaldo()+deposito;
        
     
    } 
     
     public void retirar(Cuenta c ){
     Scanner sc = new Scanner(System.in);
     double retiro;
     System.out.println("Dijite la cantidad que desea retirar");
     retiro = sc.nextDouble();
     if(saldo<= retiro){
         System.out.println("Saldo insuficiente");
     }else{
         System.out.println("Retire su efectivo");
         saldo=getSaldo()- retiro;
     }
        
     
    } 
     
     public Cuenta muestraDatos(Cuenta c){
         
         numero=getNumero();
         titular=getTitular();
         saldo=getSaldo();
         
         return new Cuenta(numero,titular,saldo);
     }
    
     public String toString(){
         return "numero:" + numero + "\n" + "titular:" + titular + "\n" + "saldo:" + saldo  ;
     }
    
}

