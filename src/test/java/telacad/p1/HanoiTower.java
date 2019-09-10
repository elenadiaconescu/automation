package telacad.p1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HanoiTower {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("HELLO", "MY", "NAME", "IS");
        String result = list.stream()
                .filter(e->e.length() % 2 == 0)
                .collect(Collectors.joining());
        System.out.println(result);
    }
}
