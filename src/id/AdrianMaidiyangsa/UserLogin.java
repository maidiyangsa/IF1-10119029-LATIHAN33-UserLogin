/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.AdrianMaidiyangsa;
/**
 *
 * @author Beta Three
 * NAMA         : Adrian Maidiyangsa
 * KELAS        : IF-1
 * NIM          : 10119029
 * Deskripsi Program : Program ini berisi program user login, program ini dibuat sendiri
 * dan dibantu oleh sumber-sumber yang ada diinternet
 */
public class UserLogin {
   private final String USERNAME = "AdrianMaidiyangsa";
   private final String PASSWORD = "gantengdantampan";
   private boolean statusAkun;
   
   private boolean cekAkun(String parUserName, String parPassword) {
       if(USERNAME.equals(parUserName) && PASSWORD.equals(parPassword)) {
           statusAkun = true;
       } else {
           statusAkun = false;
       }
       return statusAkun;
   }
   
   private void hasilLogin(boolean status, String parUserName) {
       if (status){
           System.out.println("******HALLO ".concat(parUserName.toUpperCase()).concat("******"));
           System.out.println("Selamat Datang di Aplikasi ini.");
       } else {
           System.out.println("Ooops, Username atau Password anda salah.");
       }
   }
   
   public void pengecekanLogin(String parUserName, String parPassword) {
       cekAkun(parUserName, parPassword);
       hasilLogin(statusAkun, parUserName);
   }
    
}
