package zadaniadlaReni;


public class Chlop extends Czlowiek implements LudzieZachowania{
    private String eyecolour;
    private int readyToGoTime;
    private int salary;

    // Konstruktor
    public Chlop(String eyecolour, int readyToGoTime, int salary, String address) {
        super(address);
        this.eyecolour = eyecolour;
        this.readyToGoTime = readyToGoTime;
        this.salary = salary;
    }
    public void sayHello() {
        LudzieZachowania.PowiedzDziendory();
    }


    // Gettery
    public String getEyecolour() {
        return eyecolour;
    }

    public int getReadyToGoTime() {
        return readyToGoTime;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Chlop{" +
                "eyecolour='" + eyecolour + '\'' +
                ",  readyToGoTime=" + readyToGoTime +
                ", salary=" + salary +
                '}';
    }
}

