/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

import java.util.Scanner;

/**
 *
 * @author Geral
 */
public class soal2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Angka Pertama : ");
        int angka1 = scanner.nextInt();
        
        System.out.println("Masukkan Angka Kedua : ");
        int angka2 = scanner.nextInt();
        
        System.out.println("Masukkan Angka Ketiga : ");
        int angka3 = scanner.nextInt();
        
        if(angka1 > angka2 && angka1 > angka2 ){
            System.out.println("Angka Pertama Merupakan Paling Besar");
        }else if(angka2 > angka1 && angka2 > angka3){
            System.out.println("Angka Kedua Merupakan Paling Besar");
        }else if(angka3 > angka1 && angka3 > angka2){
            System.out.println("Angka Ketiga paling besar");
        }
     }
}
