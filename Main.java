import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Crear una tabla con 5 socios
        List<Socio> socios = new ArrayList<>();
        socios.add(new Socio("11111111A", "Joanne Finger", LocalDate.of(1990, 5, 15), LocalDate.of(2020, 3, 1), 120.0, 8));
        socios.add(new Socio("22222222B", "Armando Bronca Segura", LocalDate.of(1985, 9, 3), LocalDate.of(2019, 7, 12), 90.0, 1));
        socios.add(new Socio("33333333C", "Dolores Delano", LocalDate.of(1978, 12, 20), LocalDate.of(2021, 1, 5), 150.0, 3));
        socios.add(new Socio("44444444D", "Lola Mento", LocalDate.of(1995, 2, 10), LocalDate.of(2022, 6, 30), 80.0, 0));
        socios.add(new Socio("55555555E", "Aitor Tilla", LocalDate.of(1982, 7, 8), LocalDate.of(2020, 8, 18), 110.0, 2));

        // Stream ordenados por DNI
        System.out.println("----- Socios ordenados por DNI -----");
        socios.stream()
                .sorted(Comparator.comparing(Socio::getDni))
                .forEach(System.out::println);
        System.out.println("------------------------------------");

        // Stream con cuota mayor a 100€
        System.out.println("----- Socios con cuota mayor a 100€ -----");
        socios.stream()
                .filter(socio -> socio.getCuota() > 100.0)
                .forEach(System.out::println);
        System.out.println("-----------------------------------------");

        // Stream cuyo nombre empieza por 'A'
        System.out.println("----- Socios cuyo nombre empieza por 'A' -----");
        socios.stream()
                .filter(socio -> socio.getNombre().startsWith("A"))
                .forEach(System.out::println);
        System.out.println("----------------------------------------------");
    }
}

