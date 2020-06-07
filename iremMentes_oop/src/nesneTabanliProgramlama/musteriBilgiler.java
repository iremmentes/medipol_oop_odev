package nesneTabanliProgramlama;

public interface musteriBilgiler {

    void musteriBilgileriGir(String kurumsalMusteriNo);
    void musteriBilgileriGir(String bireyselMusteriAdSoyad, String telefon);
    void musteriBilgileriGir(String sigortaSirketiKodu,  int oncelikSeviyesi, String ilgiliKisi);

    void sikayetGir(String sikayet);                                    //Sikayetler isimsiz olarak girilecektir
    void sikayetGir(String isim, String iletisimNo, String sikayet);    //Sikayetler müşteri bilgileri acik olarak girilecektir
}
