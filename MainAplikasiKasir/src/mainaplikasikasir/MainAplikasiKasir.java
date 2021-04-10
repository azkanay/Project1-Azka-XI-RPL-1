/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainaplikasikasir;
import java.util.Scanner;

/**
 *
 * @author zavia
 */
public class MainAplikasiKasir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nama anda:");
        String namaUser = scan.nextLine();
        
        System.out.println("Nama anda adalah: " + namaUser);
    }
    
public void generateDaftarMenu() { }
}
