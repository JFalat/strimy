package zadaniadlaReni;

public interface ZachowaniaChlopa {
    default String ocenaWieczoru(int iloscDrinkow, boolean koniecznoscWstawaniaRano, int IloscDzieci,
                                 boolean CzyWstajeszDoRoboty, boolean CzyBierzenaZeszyt) {
        if (koniecznoscWstawaniaRano) {
            return "Nie pij za dużo, bo trzeba rano wstać!";
        } else if (iloscDrinkow > 5) {
            return "Trochę przesadzasz z ilością drinków.";
        } else {
            return "Baw się dobrze!";
        }
    }
}