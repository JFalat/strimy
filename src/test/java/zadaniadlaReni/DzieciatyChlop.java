package zadaniadlaReni;

public class DzieciatyChlop implements OgarnijBombelki{
    @Override
    public int PrzywiezBombelki(int iloscBombelkow) {
        return OgarnijBombelki.super.PrzywiezBombelki(iloscBombelkow);
    }

    @Override
    public int WywiezBombelki(int iloscBombelkow) {
        return OgarnijBombelki.super.WywiezBombelki(iloscBombelkow);

    }

    @Override
    public int WybierzGowno(int WagaKupy, int iloscBombelkow) {
        return OgarnijBombelki.super.WybierzGowno(WagaKupy, iloscBombelkow);
    }
}
