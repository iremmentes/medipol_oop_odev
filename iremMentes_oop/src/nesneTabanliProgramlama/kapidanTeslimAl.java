package nesneTabanliProgramlama;

public class kapidanTeslimAl extends musteriKayit {

    String aracAdres;
    String kapidanTeslimTarih;
    String aracYurur;

    public String aracAdres()
    {
        System.out.println("Aracın teslim alınacaği adres ? ");
        return girilenDeger();
    }

    public String tarihSec()
    {
        System.out.println("Aracınızı hafta sonu hangi gun teslim almamizi istersiniz ?");
        System.out.println("[ Cumartesi, Pazar] ");
        return girilenDeger();
    }

    public String aracYururDurumdamı()
    {
        System.out.println("Aracınız cekici yardımı olmadan sorunsuz bir sekilde trafige cıkabilir mi ? ");
        System.out.println("[ Evet, Hayır ] ");
        return girilenDeger();
    }

}
