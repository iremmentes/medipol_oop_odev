package nesneTabanliProgramlama;

public class serviseGetir extends musteriKayit {

    String servis;
    String servisTarih;
    String servisSaat;

    public String servisSec()
    {
        System.out.println("Aracinizi hangi servise getirmek istersiniz ? ");
        System.out.println("[ Atasehir, Kadikoy, Bayrampasa, Adapazari ] ");
        return girilenDeger();
    }

    public String tarihSec()
    {
        System.out.println("Aracınızı hafta ici hangi gun getirmek istersiniz ");
        System.out.println("[ Pazartesi, Sali, Carsamba, Persembe, Cuma ] ");
        return girilenDeger();
    }

    public String saatSec()
    {
        System.out.println("Gun ici saat 8:00 ~ 16:30 arası bir saat dilimi seciniz.. ");
        return girilenDeger();
    }


}

