package zadaniadlaReni;

public interface RobotaChlopa {
    public default String jedzDoBiura(String numerBusa){
        System.out.println("jadac autobusem " + numerBusa);
        return numerBusa;
    }
    public default int klepNaKlawiaturze(int time){
        System.out.println("codziennie klepie na klawiaturze przez:  " + time);
        return time;
    }
    public default int wracajDoDomu (int time){
        System.out.println("wracam do domu przez " + time);
        return time;
    }
}
