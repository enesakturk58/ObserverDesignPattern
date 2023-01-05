import java.util.ArrayList;
import java.util.List;

public abstract class Urun {

    private String urunAdi;
    private int urunFiyati;
    private List<IMusteri> musteriList = new ArrayList<IMusteri>();

    public Urun(String urunAdi,int urunFiyati){
        this.urunAdi=urunAdi;
        this.urunFiyati=urunFiyati;
    }

    public int getUrunFiyati() {
        return urunFiyati;
    }

    public void setUrunFiyati(int urunFiyati) {
        this.urunFiyati = urunFiyati;
        bilgilendir();
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void ekle(IMusteri musteri){
        musteriList.add(musteri);
    }
     public void bilgilendir(){
        for (IMusteri musteri:musteriList){
            musteri.bildirimAl(this);
        }
     }


}
