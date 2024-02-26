/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3;

/**
 *
 * @author Geral
 */
import java.util.Scanner;

public class soal1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Angka : ");
        int angka = scanner.nextInt();
        
        if (angka >= 1000) {
            System.out.println("Angka yang anda input adalah ribuan");
        } else {
            System.out.println("Angka yang anda input bukan ribuan");
        }
        // TODO code application logic here
    }
    
}
