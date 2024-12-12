package zadaniadlaReni;

public class DzieciatyChlop implements OgarnijBombelki, ZachowaniaChlopa{
    int IloscDzieci;
    boolean KoniecznoscWstawaniaRano;
    int IloscDrinkow;
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
    @Override
    public String ocenaWieczoru(int iloscDrinkow, boolean koniecznoscWstawaniaRano, int IloscDzieci,
                                boolean CzyWstajeszDoRoboty, boolean CzyBierzenaZeszyt){
        if(KoniecznoscWstawaniaRano){
            return "wypij max 2 drinki";
        } else if (IloscDzieci >1) {
            return "postaw jednak na herbate";
        } else { return  "baw sie jak czlowiek";}

    }
}
