package gaji;
import java.util.Scanner;
public class Gaji {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int pelanggan, gaji, bonus;
        int asas = 1100;
        
        System.out.print("Masukkan bilangan pelanggan : ");
        pelanggan = input.nextInt();
        
        if (pelanggan < 1){
            bonus = 0;
        } else if (pelanggan < 10) {
            bonus = 2000;
        }else if (pelanggan < 20){
            bonus = 4000;
        } else if (pelanggan < 30){
            bonus = 6000;
        } else if (pelanggan < 40){
            bonus = 8000;
        } else {
            bonus = 10000;
        }
        
        gaji = asas + bonus;
        
        System.out.println("Bilangan pelanggan = "+pelanggan);
        System.out.println("Jumlah gaji = RM"+gaji);
    }
    
}
