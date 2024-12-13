package zadaniadlaReni;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import static org.assertj.core.api.Assertions.assertThat;

public class Main {
    public static void main(String[] args) {
        // Tworzenie listy i obiektów Dzietych Chlopow
        List<DzieciatyChlop> chlopList = new ArrayList<>();
        chlopList.add(new DzieciatyChlop("blue",20,20000));
        chlopList.add(new DzieciatyChlop("green",200,5000));
        chlopList.add(new DzieciatyChlop("grey", 150,5000));
        chlopList.add(new DzieciatyChlop("none", 300,6000));

        // Sortowanie według readyToGoTime malejąco i pobieranie pierwszych 3 rekordów
        List<DzieciatyChlop> firstThree = chlopList.stream()
                .sorted(Comparator.comparing(Chlop::getReadyToGoTime).reversed())
                .limit(3)
                .collect(Collectors.toList());

        // Sortowanie według salary i wybieranie najlepiej opłacanego z pierwszej trójki
        List<DzieciatyChlop> bestPaidFromTopThree = firstThree.stream()
                .sorted(Comparator.comparing(Chlop::getSalary).reversed())
                .limit(1)
                .collect(Collectors.toList());
//
//        // Tworzenie obiektu chlop i testowanie metod
//        Chlop chlop = new Chlop("blue", 30, 333, "abc");
        DzieciatyChlop dzieciatyChlop = new DzieciatyChlop("blue",100,50000);
        RobotnyChlop robotnyChlop = new RobotnyChlop();
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

//        chlop.jedzDoBiura("146");
//        chlop.klepNaKlawiaturze(20);
    }
}
