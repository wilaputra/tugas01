/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmatika;

/**
 *
 * @author PC-A-30
 */
public class Aritmatika {
    private double hasil;
    
    //method penambaham
    public void tambah(double bil1, double bil2){
        this.hasil = bil1 + bil2;
    }
    //method kurang
    public void kurang(double bil1, double bil2){
        this.hasil = bil1 - bil2;
    }
    //method perkalian
    public void kali(double bil1, double bil2){
        this.hasil = bil1 * bil2;
    }
    //method pembagian
    public void bagi(double bil1, double bil2){
        this.hasil = bil1/bil2;
    }
    //get hasil
    public double getHasil(){
        return this.hasil;
    }
}

