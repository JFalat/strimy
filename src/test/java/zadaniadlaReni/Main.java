package zadaniadlaReni;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import static org.assertj.core.api.Assertions.assertThat;

public class Main {
    public static void main(String[] args) {
        // Tworzenie listy i obiektów Chlop
//        List<Chlop> chlopList = new ArrayList<>();
//        chlopList.add(new Chlop("blue", 111, 1000, "abc"));
//        chlopList.add(new Chlop("red", 222, 1000, "abc"));
//        chlopList.add(new Chlop("green", 333, 1000, "abc"));
//        chlopList.add(new Chlop("yellow", 444, 1000, "abc"));
//
//        // Sortowanie według readyToGoTime malejąco i pobieranie pierwszych 3 rekordów
//        List<Chlop> firstThree = chlopList.stream()
//                .sorted(Comparator.comparing(Chlop::getReadyToGoTime).reversed())
//                .limit(3)
//                .collect(Collectors.toList());
//
//        // Sortowanie według salary i wybieranie najlepiej opłacanego z pierwszej trójki
//        List<Chlop> bestPaidFromTopThree = firstThree.stream()
//                .sorted(Comparator.comparing(Chlop::getSalary).reversed())
//                .limit(1)
//                .collect(Collectors.toList());
//
//        // Tworzenie obiektu chlop i testowanie metod
//        Chlop chlop = new Chlop("blue", 30, 333, "abc");
        DzieciatyChlop dzieciatyChlop = new DzieciatyChlop();
        RobotnyChlop robotnyChlop = new RobotnyChlop();
//        chlop.sayHello();
//        assertThat(chlop).isNotNull();
//        assertThat(chlop.getEyecolour()).isEqualTo("blue");

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
