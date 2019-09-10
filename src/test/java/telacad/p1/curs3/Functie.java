package telacad.p1.curs3;

import java.time.ZoneId;
import java.util.Set;

public class Functie {
    public static void main(String[] args) {

        Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        zoneIds.stream()
                .filter(z -> z.toLowerCase().contains("europe"))
                .forEach(System.out::println);
    }
}
