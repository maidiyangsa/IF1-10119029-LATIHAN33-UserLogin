/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.AdrianMaidiyangsa;
import java.util.*;
/**
 *
 * @author Beta Three
 * NAMA         : Adrian Maidiyangsa
 * KELAS        : IF-1
 * NIM          : 10119029
 * Deskripsi Program : Program ini berisi program user login, program ini dibuat sendiri
 * dan dibantu oleh sumber-sumber yang ada diinternet
 */
public class IF110119029Latihan33UserLogin {
    private static String usName,passWord;
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan Username = ");
        usName = input.next();

        System.out.print("Masukan Password = ");
        passWord = input.next();
        System.out.println();
        UserLogin login = new UserLogin();
        login.pengecekanLogin(usName, passWord);
    }
    
}
