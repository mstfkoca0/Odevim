public class Main {

    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Mustafa Koca", "Bilgisayar Mühendisliği", 2018, "AB", 3.5);
        Ogrenci ogrenci2 = new Ogrenci("Paul Walker", "Elektrik Mühendisliği", 2019, "AA", 4);

        System.out.println("1. Öğrenci:");
        System.out.println("Ad: " + ogrenci1.getAd());
        System.out.println("Bölüm: " + ogrenci1.getBolum());
        System.out.println("Giriş Yılı: " + ogrenci1.getGirisYili());
        System.out.println("Bölüm Kodu: " + ogrenci1.getBolumKodu());
        System.out.println("GANO: " + ogrenci1.getGano());
        System.out.println("Öğrenci No: " + ogrenci1.getOgrNo());
        System.out.println("Harç: " + ogrenci1.harcHesapla());

        System.out.println("\n2. Öğrenci:");
        System.out.println("Ad: " + ogrenci2.getAd());
        System.out.println("Bölüm: " + ogrenci2.getBolum());
        System.out.println("Giriş Yılı: " + ogrenci2.getGirisYili());
        System.out.println("Bölüm Kodu: " + ogrenci2.getBolumKodu());
        System.out.println("GANO: " + ogrenci2.getGano());
        System.out.println("Öğrenci No: " + ogrenci2.getOgrNo());
        System.out.println("Harç: " + ogrenci2.harcHesapla());
    }
}
