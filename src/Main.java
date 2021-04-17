/**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.List;

/**
 * IKIN HASANOV's response to Homework [x], Module [x].
 *
 *   Task:
 *
 *
 * @version 1.10
 * @Since [DD] [MMM] [YYYY]
 * @class
 * @author Ilkin Hasanov
 */
public class Main {

    public static void main(String[] args) throws IOException {
    /*    LocalDateTime start = LocalDateTime.now();
        String logs = new String(Files.readAllBytes(Paths.get("/home/george/Desktop/logs.txt")));
        final String[] lines = logs.split("\n");
        System.out.println(lines.length);
        int counter = 0;
        for (int i = 0; i < lines.length ; i++) {
            if (lines[i].contains("ERROR")) counter++;
        }
        System.out.println("ERRORS  - " + counter);
        LocalDateTime finish = LocalDateTime.now();
        System.out.println(ChronoUnit.MILLIS.between( start, finish));
        System.out.println("----------------------------------------------");
        start = LocalDateTime.now();
        System.out.println(Files.readAllLines(Paths.get("/home/george/Desktop/logs.txt"))
                .stream().filter(line -> line.contains("ERROR")).count());
        System.out.println(Files.lines(Paths.get("/home/george/Desktop/logs.txt"))
                .filter(line -> line.contains("ERROR")).count());

        finish = LocalDateTime.now();
        System.out.println(ChronoUnit.MILLIS.between( start, finish));
*/
        System.out.println("--------------------- Threads -----------------");


        LocalDateTime start = LocalDateTime.now();


        LocalDate date = LocalDate.of(2019, 10, 13);

        for (int i = 0; i < 5 ; i++) {
            LogsService.logsByDateToFile("src\\logs.txt", date.plusDays(i));
        }



        LocalDateTime finish = LocalDateTime.now();

        System.out.println("Operation completed!!!\nFiles were created " +
                "       inside the given folder.\nIt took " +
                ChronoUnit.MILLIS.between(start, finish) +
                " milliseconds to finish whole process.");
    }
}
