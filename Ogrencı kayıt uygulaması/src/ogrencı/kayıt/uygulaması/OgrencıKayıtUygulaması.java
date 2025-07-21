
package ogrencı.kayıt.uygulaması;

import java.util.Scanner;


public class OgrencıKayıtUygulaması {

    public static void main(String[] args) {
        int seçim=-1;
           Scanner scanner=new Scanner(System.in);

   OgrTekYonluDogrusalListe yazbölüm=new OgrTekYonluDogrusalListe();
   while(seçim!=0){
        System.out.println("");
        System.out.println("yazilim muhendisligi ogrenci kayit uygulamasi ");
        System.out.println("1- yeni kayit");
        System.out.println("2- kayit sil");
        System.out.println("3- kayitlari listele");
        System.out.println("4-  en basarili ogrenci bilgileri");
        System.out.println("0- cikis");
        System.out.println("seciminiz: ");
        seçim=scanner.nextInt();

      if(seçim==1)
          yazbölüm.add();
      else if(seçim==2)
          yazbölüm.delete();
      else if(seçim==3)
          yazbölüm.yazdir();
      else if(seçim==4)
          yazbölüm.printBestStudent();
      else if(seçim==0)
            System.out.println("cikis yapiliyor...");
      else
            System.out.println("hatalı seçim yaptınız");}
    
    }
    
}
