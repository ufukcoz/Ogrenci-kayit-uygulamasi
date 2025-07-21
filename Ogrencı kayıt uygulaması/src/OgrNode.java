package ogrencı.kayıt.uygulaması;
public class OgrNode {
   
    String ad;
    int numara;
    double ortalama;
    String durum;
    int vize;
     int finall;
    OgrNode next;

    public OgrNode(String ad, int numara, int vize, int finall) {
        this.ad = ad;
        this.numara = numara;
        this.vize = vize;
        this.finall = finall;
    
    ortalama=(vize*40+finall*60)/100;
    if(ortalama>=50){
        durum="gecti";
    }
        else{
         durum="kaldi";       
                }
           next=null;
       next=null;
}

 
}
