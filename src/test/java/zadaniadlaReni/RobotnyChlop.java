package zadaniadlaReni;

public class RobotnyChlop extends Chlop implements RobotaChlopa{
    int iloscDrinkow;
    boolean koniecznoscWstawaniaRano;
    int IloscDzieci;
    boolean CzyWstajeszDoRoboty;
    boolean CzyBierzenaZeszyt;

    public RobotnyChlop(String eyecolour, int readyToGoTime, int salary) {
        super(eyecolour, readyToGoTime, salary);
    }


    public String jedzDoBiura(String numerBusa) {
        return RobotaChlopa.super.jedzDoBiura(numerBusa);
    }


    public int klepNaKlawiaturze(int time) {
        return RobotaChlopa.super.klepNaKlawiaturze(time);
    }


    public int wracajDoDomu(int time) {
        return RobotaChlopa.super.wracajDoDomu(time);
    }
    @Override
    public String ocenaWieczoru(int iloscDrinkow, boolean koniecznoscWstawaniaRano, int IloscDzieci,
                                boolean CzyWstajeszDoRoboty, boolean CzyBierzenaZeszyt){
     if(koniecznoscWstawaniaRano){
         return "max 2 drineczki";
     } else if(CzyWstajeszDoRoboty){
         return "moga byc dwa ale bez wodeczki";
     } else {
         return "baw sie jak czlowiek";}
    }
}
