package hesapmakinesi;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        // Switch case kullanarak 4 işlem yapan hesap makinesi 
        Scanner scanner = new Scanner (System.in);
        String islemler = "1. Toplama \n"
                         +"2. Çıkarma \n"
                         +"3. Çarpma \n"
                         +"4. Bölme";
        System.out.println(islemler);
        System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
        String islem = scanner.nextLine();
        
        int a;
        int b;
        
        switch (islem)
        { 
            case "1":
                System.out.print("Birinci sayıyı giriniz: ");
                a = scanner.nextInt();
                System.out.print("İkinci sayıyı giriniz: ");
                b = scanner.nextInt();
                System.out.println("Toplam: " + (a+b));
                break;
            case "2":
                System.out.print("Birinci sayıyı giriniz: ");
                a = scanner.nextInt();
                System.out.print("İkinci sayıyı giriniz: ");
                b = scanner.nextInt();
                System.out.println("Fark: " + (a-b));
                break;
            case "3":
                System.out.print("Birinci sayıyı giriniz: ");
                a = scanner.nextInt();
                System.out.print("İkinci sayıyı giriniz: ");
                b = scanner.nextInt();
                System.out.println("Çarpım: " + (a*b));
                break;
            case "4":
                System.out.print("Birinci sayıyı giriniz: ");
                a = scanner.nextInt();
                System.out.print("İkinci sayıyı giriniz: ");
                b = scanner.nextInt();
                System.out.println("Bölüm: " + ((double)a/b));
                break;
            default:
                System.out.println("Geçersiz işlem.");
        }
        
    }
    
}
