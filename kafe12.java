import java.util.Scanner;
public class kafe12 {
    public static void main (String[] args){
    java.util.Scanner input = new Scanner(System.in);

boolean keanggotaan;
int jmlKopi, jmlTeh, jmlRoti;
Double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga, nomimalBayar;
float diskon = 10 / 100f;

System.out.println("Masukkan keanggotaan (true/false):");
keanggotaan = input.nextBoolean();
System.out.println("Masukkan jumlah pembelian kopi:");
jmlKopi = input.nextInt();
System.out.println("Masukkan jumlah pembelian Teh:");
jmlTeh = input.nextInt();
System.out.println("Masukkan jumlah pembelian roti:");
jmlRoti = input.nextInt();

totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
nomimalBayar = totalHarga - (diskon * totalHarga);

System.out.println("Keanggotaan pelanggan " + keanggotaan);
System.out.println("Item pembelian " + jmlKopi + " Kopi, " + jmlTeh + " Teh, " + jmlRoti + " Roti ");
System.out.println("Nominal bayar Rp " + nomimalBayar);

}
}


    
