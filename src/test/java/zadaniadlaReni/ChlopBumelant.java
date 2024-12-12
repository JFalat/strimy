package zadaniadlaReni;

public class ChlopBumelant implements ZachowaniaChlopa{
    @Override
    public String ocenaWieczoru(int iloscDrinkow, boolean koniecznoscWstawaniaRano, int IloscDzieci,
                                boolean CzyWstajeszDoRoboty, boolean CzyBierzenaZeszyt){
        if(CzyBierzenaZeszyt){
            return "za co Ty pijesz";
        } else if (CzyWstajeszDoRoboty) {
            return "postaw jednak na herbate";
        } else { return  "baw sie jak czlowiek ale niech koledzy stawiaja";}

    }
}
