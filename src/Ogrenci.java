public class Ogrenci {
    private String ad;
    private String bolum;
    private int girisYili;
    private String ogrNo;
    private double gano;
    private String bolumKodu;

    public Ogrenci(String ad, String bolum, int girisYili, String bolumKodu, double gano) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.bolumKodu = bolumKodu;

        if (gano < 0 || gano > 4) {
            throw new IllegalArgumentException("Gano değerinin 0 ile 4 aralığında olması gerekmektedir.");
        }
        this.gano = gano;

        this.ogrNo = ogrenciNoOlustur();
    }


    public Ogrenci() {
        this("", "", 0, "", 0);
    }

    public double harcHesapla(int dersSayisi, int okulUzunlugu) {
        return harcHesapla(dersSayisi, okulUzunlugu);
    }
    private String ogrenciNoOlustur() {
        String ogrNoFormati = String.valueOf(girisYili) + bolumKodu + String.valueOf(ogrenciNoSayisi());
        return ogrNoFormati;
    }


    private int ogrenciNoSayisi() {
        return 1;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    public String getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(String ogrNo) {
        this.ogrNo = ogrNo;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        if (gano < 0 || gano > 4) {
            throw new IllegalArgumentException("Gano değerinin 0 ile 4 aralığında olması gerekmektedir.");
        }
        this.gano = gano;
    }

    public String getBolumKodu() {
        return bolumKodu;
    }

    public void setBolumKodu(String bolumKodu) {
        this.bolumKodu = bolumKodu;
    }

    public double harcHesapla() {
        int dersSayisi = 5;
        int okulUzunlugu = 4;


        if (dersSayisi < 0 || okulUzunlugu < 0 ) {
            throw new IllegalArgumentException("Ders sayısı, okul uzunluğu ve uzantı yılı sıfırdan büyük olmalıdır.");
        }

        double harc = 0;
        harc = dersSayisi * 10 + okulUzunlugu * 20 ;
        return harc;
    }
}
