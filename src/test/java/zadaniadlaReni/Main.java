package zadaniadlaReni;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import static org.assertj.core.api.Assertions.assertThat;

public class Main {
    public static void main(String[] args) {
        // Tworzenie listy i obiektów Dzietych Chlopow
        List<Chlop> chlopList = new ArrayList<>();
        chlopList.add(new DzieciatyChlop("blue",20,10000));
        chlopList.add(new RobotnyChlop("blue",20,20000));
        chlopList.add(new ChlopBumelant("red",20,30000));
        chlopList.add(new RobotnyChlop("blue",20,40000));


        List<Chlop> tylkoRobotni = chlopList.stream()
                .filter(chlop -> chlop instanceof RobotnyChlop )
                .collect(Collectors.toList());


//        // Tworzenie obiektu chlop i testowanie metod
//        Chlop chlop = new Chlop("blue", 30, 333, "abc");
        DzieciatyChlop dzieciatyChlop = new DzieciatyChlop("blue",100,50000);
        RobotnyChlop robotnyChlop = new RobotnyChlop("yellow",200,5000);
        ChlopBumelant chlopBumelant = new ChlopBumelant("green",200,50000);
        dzieciatyChlop.ocenaWieczoru(1,true,2,
                true,false);
        robotnyChlop.ocenaWieczoru(3,true,3,
                true,false);
        chlopBumelant.ocenaWieczoru(1,false,
                3,false,true);
        // Testowanie metod
        assertThat(dzieciatyChlop.PrzywiezBombelki(5)).isEqualTo(5);
        assertThat(dzieciatyChlop.WywiezBombelki(5)).isEqualTo(5);
        assertThat(dzieciatyChlop.WybierzGowno(5,6)).isEqualTo(30);
        assertThat(robotnyChlop.jedzDoBiura("146")).contains("146");
        assertThat(robotnyChlop.klepNaKlawiaturze(100)).isEqualTo(100);
//        assertThat(chlop.jedzDoBiura("146")).contains("146");


    }
}
