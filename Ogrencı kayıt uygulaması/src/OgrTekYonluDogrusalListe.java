package ogrencı.kayıt.uygulaması;

import java.util.Scanner;

public class OgrTekYonluDogrusalListe {
    
    OgrNode head = null;
    OgrNode tail = null;
    OgrNode temp = null;
    OgrNode temp2 = null;
    
   Scanner scanner=new Scanner(System.in);
   
   String ad;
    int numara;
    float ortalama;
    String durum;
    int vize;
     int finall;
    OgrNode next;
    
    void add() {
                System.out.println("yazilim bolumune girecek olan ögrenci bilgilerini giriniz: ");
		System.out.println("No: "); numara = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Ad:"); ad = scanner.nextLine();
		System.out.println("Vize: "); vize = scanner.nextInt();
		System.out.println("Final: "); finall = scanner.nextInt();
		OgrNode ogr = new OgrNode(ad, numara, vize, finall);
    

       if(head==null){
     head=ogr;
           System.out.println("yazilim bolumune girecek olan ogrencilerin listesi olustu,ilk ogrenci eklendi.");
 }else{
           ogr.next=head;
           head=ogr;
           tail=ogr;
           System.out.println(numara +" nolu ogrenci eklendi. ");
       }
} 
      void delete() {
		if(head == null) {
			System.out.println("Liste bos");   
		}
          System.out.println("silmek istedıginiz ogrencinin nosunu girin: ");
          numara=scanner.nextInt();
          if(numara == head.numara && head.next == null) { // listenin tek elemanlı ve silinecek elemanın head olma durumu
	  head = null;
	  tail = null;
	   System.out.println("Head silindi. Liste bos");}
          else if (numara == head.numara && head.next != null){
              head=head.next;
              System.out.println(numara+" numarali ogrenci silindi");
          }
          else{
              temp=head;
              temp2=head;
              while(temp.next!=null){ //taile kadar listede gezınıyoruz
                if (numara==temp.numara ){
                    temp2.next=temp.next;
                    System.out.println(numara+ "numarali ogrenci silindi");
                    
                }  temp2=temp;
                   temp=temp.next;
                   
              }
              if(numara==tail.numara){ // taili siler
                  temp2.next=null;
                  tail=temp2;
                  System.out.println(numara+ " numaralı ogrenci silindi");
              }}}
              void yazdir() {
		if(head == null) {
			System.out.println("Liste bos");
		}
		else {
			temp = head;
			while(temp!=null) {
				System.out.println("-----------------------------------");
				System.out.println("No: " + temp.numara);
				System.out.println("Adi: " + temp.ad);
				System.out.println("Vize: " + temp.vize);
				System.out.println("Final: " + temp.finall);
				System.out.println("Ortalama: " + temp.ortalama);
				System.out.println("Durum: " + temp.durum); 
				System.out.println("-----------------------------------");
				temp = temp.next;
			}
                      
          }

}    
              void printBestStudent() {
		if(head == null) {
			System.out.println("Liste bos");
		}
		else {
			temp = head;
			double buyuk = temp.ortalama;
			while(temp!=null) {		
				if(buyuk<temp.ortalama) {	// en büyüğün head olma durumu olduğundan (<=) olacak
					buyuk = temp.ortalama;
					numara = temp.numara;
					ad = temp.ad;
					vize = temp.vize;
					finall = temp.finall;
                                        durum=temp.durum;
                                        ortalama =(float) temp.ortalama;
				}
				temp = temp.next;
			}
                        System.out.println("-----------------------------------");
				System.out.println("No: " + numara);
				System.out.println("Adi: " + ad);
				System.out.println("Vize: " + vize);
				System.out.println("Final: " + finall);
				System.out.println("Ortalama: " + ortalama);
				System.out.println("Durum: " + durum); 
				System.out.println("-----------------------------------");
		
		}
	}



}
