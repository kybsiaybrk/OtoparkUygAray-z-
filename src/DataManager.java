/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author apple
 */
public class DataManager extends javax.swing.JFrame{
    
     
    String kullaniciNo = "123";
    String kullaniciSifre = "1234";
    static int bakiye = 10; 
    static String yerSecim ; 
    static String aracSecim;
    static String saatSecim;
    static String otoparkSecim;
    
    
    public void rezervSayfa(){
    
    this.setVisible(false);
    new RezervasyonEkrani().setVisible(true);
     
    }
    
    
    
}
