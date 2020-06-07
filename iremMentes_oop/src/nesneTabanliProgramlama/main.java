package nesneTabanliProgramlama;
import java.util.Scanner;


public class main {

    public static void main(String[] args){

        musteriKayit musteri= new musteriKayit();
        System.out.println("Arac Kiralama Sistemine Hosgeldiniz ! \n");
        System.out.print("Kurumsal musteri iseniz 1, Bireysel Islemler icin 2, Sigorta Sirketi iseniz 3 giriniz? [1 / 2 / 3] : ");
        musteri.secim=musteri.secilen();

        if (musteri.secim==1)  //Sonra Degisecek
            {
                System.out.print("\nKurumsal Numaranizi Giriniz : ");
                musteri.kurumsalNo=musteri.girilenDeger();
                musteri.musteriBilgileriGir(musteri.kurumsalNo);
            }
        else if (musteri.secim==2)
            {
            System.out.print("\nAd Soyad giriniz : ");
            musteri.adSoyad=musteri.girilenDeger();
            System.out.print("\nTelefon Numaranizi giriniz : ");
            musteri.telefon=musteri.girilenDeger();
            musteri.musteriBilgileriGir(musteri.adSoyad,musteri.telefon);
            }
        else
            {
                System.out.print("\nSigorta Sirketi No : ");
                musteri.sigorta=musteri.girilenDeger();
                System.out.print("\nOncelik Seviyesi [1~5] : ");
                musteri.oncelik=musteri.secilen();
                System.out.print("\nSigorta Personeli Ismi : ");
                musteri.ilgiliKisi=musteri.girilenDeger();
                musteri.musteriBilgileriGir(musteri.sigorta, musteri.oncelik, musteri.ilgiliKisi);
            }

        musteri.aracPlaka=musteri.plakaGir();
        musteri.aracMarka=musteri.markaGir();
        musteri.aracKM=musteri.kilometreGir();
        musteri.aracSorun=musteri.aracSorun;

        System.out.println("Aracinizi adresinizden teslim almamizi ister misiniz ? [Evet 1 : Hayır 2]  ");
           int cevap = musteri.secilen();
           if (cevap==1)
           {
               kapidanTeslimAl arac = new kapidanTeslimAl();
               arac.aracAdres=arac.aracAdres();
               arac.kapidanTeslimTarih=arac.tarihSec();
               arac.aracYurur=arac.aracYururDurumdamı();
           }
           else
           {
               serviseGetir arac = new serviseGetir();
               arac.servis=arac.servisSec();
               arac.servisTarih=arac.tarihSec();
               arac.servisSaat=arac.saatSec();
           }

           System.out.println("# # # # # # # # #");
           System.out.println("Kayit Tamamlandi");
           System.out.println("# # # # # # # # #");

    }



}