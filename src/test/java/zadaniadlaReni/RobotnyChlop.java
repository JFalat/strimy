package zadaniadlaReni;

public class RobotnyChlop implements RobotaChlopa{
    @Override
    public String jedzDoBiura(String numerBusa) {
        return RobotaChlopa.super.jedzDoBiura(numerBusa);
    }

    @Override
    public int klepNaKlawiaturze(int time) {
        return RobotaChlopa.super.klepNaKlawiaturze(time);
    }

    @Override
    public int wracajDoDomu(int time) {
        return RobotaChlopa.super.wracajDoDomu(time);
    }
}
