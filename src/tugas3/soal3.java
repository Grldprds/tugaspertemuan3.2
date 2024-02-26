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
public class soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Jam Masuk : ");
        int jam1 = scanner.nextInt();
        
        System.out.println("Masukkan Jam Keluar : ");
        int jam2 = scanner.nextInt();
        
        int hasil = (jam2 + 12 - jam1) % 12;
        System.out.println("Lama Parkir : " +hasil);
        
        if(hasil <= 1){
        System.out.println("Biaya Parkir = 1500");
        }else if(hasil > 1){
        int jumlah = 1500 + (hasil-2)*1000;
        System.out.println("Biaya Parkir = " +jumlah);

        }

     }
}
