package zadaniadlaReni;

public class DzieciatyChlop extends Chlop implements OgarnijBombelki{
    int IloscDzieci;
    boolean KoniecznoscWstawaniaRano;
    int IloscDrinkow;

    public DzieciatyChlop(String eyecolour, int readyToGoTime, int salary) {
        super(eyecolour, readyToGoTime, salary);
    }

    public int PrzywiezBombelki(int iloscBombelkow) {
        return OgarnijBombelki.super.PrzywiezBombelki(iloscBombelkow);
    }


    public int WywiezBombelki(int iloscBombelkow) {
        return OgarnijBombelki.super.WywiezBombelki(iloscBombelkow);

    }


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
        } else {
            return  "baw sie jak czlowiek";}

    }
}
