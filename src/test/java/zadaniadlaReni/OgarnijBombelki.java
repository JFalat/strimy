package zadaniadlaReni;

import java.util.function.IntPredicate;

public interface OgarnijBombelki {
    public default int PrzywiezBombelki(int iloscBombelkow) {
        System.out.println("mam przywiezc " + iloscBombelkow);
        return iloscBombelkow; // Zwracamy liczbę bombelków
    }
    public default int WywiezBombelki(int iloscBombelkow){
        System.out.println("mam wywiezc"+ iloscBombelkow);
        return iloscBombelkow;
    }
    public default int WybierzGowno(int WagaKupy, int iloscBombelkow){
        System.out.println("wybralem tyle "+ iloscBombelkow*WagaKupy);
        return iloscBombelkow*WagaKupy;
    }
}
