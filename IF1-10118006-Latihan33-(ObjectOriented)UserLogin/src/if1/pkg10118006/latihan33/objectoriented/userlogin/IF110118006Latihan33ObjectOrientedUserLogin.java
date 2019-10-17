package if1.pkg10118006.latihan33.objectoriented.userlogin;

import java.util.Scanner;

/*
 * NAMA              : Alfarizi Rizki Pane
 * KELAS             : IF-01
 * NIM               : 10118006
 */
public class IF110118006Latihan33ObjectOrientedUserLogin {

        
        private static String usName;
        private static String passWord;
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Masukkan Username = ");
        usName = scn.next();

        System.out.print("Masukkan Password = ");
        passWord = scn.next();

        User cek = new User();
        cek.pengecekkanLogin(usName,passWord);

    }
    
}
