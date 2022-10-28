/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet11;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class perulangan {
    public static void main (String[]args){
        Scanner scan = new Scanner (System.in);
        int z;
        System.out.println("Daftar Menu:");
        System.out.println("==================");
        System.out.println("1.perulangan");
        System.out.println("2.percabangan");
        System.out.println("3.array");
        System.out.println("Menu yang anda pilih");
        z=scan.nextInt();
        if(z==1){
            System.out.println("ini adalah perulangan");
            for(int a=0;a<=10;a++){
                System.out.println("tampilkan nilai 1-10 : "+a);
            }
        }else if(z==2){
            
        }else if(z==3){
            
        }else{
        
            
        }
      
    
    }
}
