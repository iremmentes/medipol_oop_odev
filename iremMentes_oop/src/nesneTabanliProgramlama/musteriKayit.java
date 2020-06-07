package nesneTabanliProgramlama;

import java.util.Scanner;

public class musteriKayit implements musteriBilgiler {

    int secim;
    String kurumsalNo;
    String adSoyad;
    String telefon;
    String sigorta;
    String ilgiliKisi;
    int oncelik;
    
    String aracPlaka;
    String aracMarka;
    String aracKM;
    String aracSorun;

    public String girilenDeger()
    {
        Scanner girilen=new Scanner(System.in);
        String deger=girilen.next();
        return deger;
    }

    public int secilen()
    {
        Scanner girilen=new Scanner(System.in);
        int deger=girilen.nextInt();
        return deger;
    }

    public void musteriBilgileriGir(String kurumsalMusteriNo) 
    {
        System.out.println("Sayin " + kurumsalMusteriNo + " kodlu kurumsal musterimiz olarak isleminiz baslatiliyor..");
    }

    public void musteriBilgileriGir(String bireyselMusteriAdSoyad, String telefon) 
    {
        System.out.println("Sayin " + bireyselMusteriAdSoyad + " bireysel musterimiz olarak isleminiz baslatiliyor...");
    }

    public void musteriBilgileriGir(String sigortaSirketiKodu,  int oncelikSeviyesi, String ilgiliKisi) {
        System.out.println(sigortaSirketiKodu+" kodlu sigorta sirketi, "+ilgiliKisi+" personeline, "+oncelikSeviyesi+" seviyesine gore isleminiz baslatiliyor...");

    }

    public void sikayetGir(String sikayet) {
        //Bu method polymorphism'e ornek olması amacıyla olusturulmus olup programda kullanılmamaktadır
        System.out.println("Sikayet Kaydiniz isimsiz olarak olusturulmustur");
    }

    public void sikayetGir(String isim, String iletisimNo, String sikayet) {
        //Bu method polymorphism'e ornek olması amacıyla olusturulmus olup programda kullanılmamaktadır
        System.out.println("Sayin "+ isim+" Sikayet Kaydiniz Olusturulmus olup tarafiniza donus saglanacaktir.");
    }

    public String plakaGir()
    {
        System.out.println("Arac plakasini giriniz # ");
        return girilenDeger();
    }

    public String markaGir()
    {
        System.out.println("Arac markasını giriniz # ");
        return girilenDeger();
    }

    public String kilometreGir()
    {
        System.out.println("Arac kilometresini giriniz # ");
        return girilenDeger();
    }

    public String arızaGir()
    {
        System.out.println("Arac arızasini kisaca ifade ediniz # ");
        return girilenDeger();
    }



}
