public class Musteri1 implements IMusteri{

    @Override
    public void bildirimAl(Urun urun) {
        System.out.println(urun.getUrunAdi() + " urunun fiyati degisti. ");
    }
}
