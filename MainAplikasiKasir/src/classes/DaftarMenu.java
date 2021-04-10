/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author zavia
 */
public class DaftarMenu {
    private ArrayList<Menu> daftarMenu;
    private String Ramen;
    private String Kuah;
    private String Topping;
    private String Minuman;
    
    public DaftarMenu() { 
        daftarMenu = new ArrayList<>();
    }
    public void tambahMenu (Menu menu) { 
        daftarMenu.add(menu);
    }
    public void getMenuByKategori (String kategori) { 
        System.out.println("======== " + kategori + " ========");
        
        for (int i = 0; i < daftarMenu.size(); i++) {
            Menu m = daftarMenu.get(i);
            if (m.getKategori().equals(kategori)) {
                System.out.println((i+1) + ". " + m.getNama_menu() + "\t" + m.getHarga());
            }
        }
    }
    public void tampilDaftarMenu() { 
        System.out.println("======== ALDEBARAMEN ========");
        getMenuByKategori(Ramen);
        getMenuByKategori(Kuah);
        getMenuByKategori(Topping);
        getMenuByKategori(Minuman);
    }
}
