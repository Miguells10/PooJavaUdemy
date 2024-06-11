package Seção11;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataHora {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2024-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2024-07-20T01:30:26");

        Instant d06 = Instant.parse("2024-07-20T01:30:26Z");

        LocalDate d08 = LocalDate.parse("20/07/2003", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2003 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2024, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2024, 7, 20, 1, 30, 26);


        System.out.println("d01: " + d01);
        System.out.println("d02: " + d02);
        System.out.println("d03: " + d03);
        System.out.println("d04: " + d04);
        System.out.println("d05: " + d05);
        System.out.println("d08: " + d08);
        System.out.println("d09: " + d09);
        System.out.println("d10: " + d10);
        System.out.println("d11: " + d11);

        System.out.println("-------------------------------------------------");

        //Imprimindo dadgawgafcasdcsa data formatada

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("d05 formatado: " + d05.format(fmt3));

        System.out.printf("d06 formatado: " + fmt4.format(d06) + "%n");

        //Convertendo data-hora global para local

        System.out.println("-----------------------------");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());

        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        System.out.println("r3: " + r3);
        System.out.println("r4: " + r4);

        System.out.printf("r1 formatado: " + r1.format(fmt1) + "%n");
        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mes = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());

        //Calculos com data hora

        System.out.println("-------------------------------------------------");

        LocalDate pastWeekLocalDate = d04.minusWeeks(1);
        LocalDate nextWeekLocalDate = d04.plusWeeks(1);

        System.out.println("d04: " + d04.format(fmt1));
        System.out.println("pastWeekLocalDate: " + pastWeekLocalDate.format(fmt1));
        System.out.println("nextWeekLocalDate: " + nextWeekLocalDate.format(fmt1));

        LocalDateTime pastWeekLocalDateTime = d05.minusWeeks(1);
        LocalDateTime nextWeekLocalDateTime = d05.plusWeeks(1);
        System.out.println("-----------------------------");

        System.out.println("d05: " + d05.format(fmt2));
        System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime.format(fmt2));
        System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime.format(fmt2));

        System.out.println("-------------------------------------------------");

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.printf("d06: " + d06 + "%n", fmt4);
        System.out.printf("pastWeekInstant: " + pastWeekInstant + "%n", fmt4);
        System.out.printf("nextWeekInstant: " + nextWeekInstant + "%n", fmt4);

        System.out.println("-------------------------------------------------");
        System.out.println("Duração entre datas");

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);


        System.out.println("t1 dias: " + t1.toDays());
        System.out.println("t2 dias: " + t2.toDays());
        System.out.println("t3 dias: " + t3.toDays());












    }
}
