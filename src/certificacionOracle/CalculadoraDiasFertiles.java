package certificacionOracle;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculadoraDiasFertiles {

    public static void main(String[] args) {
    
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Ingrese la fecha de su último periodo menstrual (YYYY-MM-DD):");
            String fechaUltimoPeriodoStr = scanner.nextLine();
            
            LocalDate fechaUltimoPeriodo = LocalDate.parse(fechaUltimoPeriodoStr);
            
            LocalDate fechaOvulacion = fechaUltimoPeriodo.plusDays(14);
            
            LocalDate inicioRangoFertil = fechaOvulacion.minusDays(5);
            LocalDate finRangoFertil = fechaOvulacion.plusDays(4);

            System.out.println("Fecha estimada de ovulación: " + fechaOvulacion.format(DateTimeFormatter.ofPattern("dd-MM-YYYY")));
            System.out.println("Rango de días fértiles: desde " + inicioRangoFertil.format(DateTimeFormatter.ofPattern("dd-MM-YYYY")) + " hasta " + finRangoFertil.format(DateTimeFormatter.ofPattern("dd-MM-YYYY")));
        }
    }
}
