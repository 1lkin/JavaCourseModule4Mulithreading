/**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
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
public class LogsService {
    private String file;

    public LogsService() {
    }

    public LogsService(String file) {
        this.file = file;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
    // 2021-03-11
    public static List<String> logsByDate(String file, LocalDate date) throws IOException {
        String dateAsString = date.toString();
        List<String> list = Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString))
                .collect(Collectors.toList());

        return list;
    }

    public static void logsByDateToFile(String file, LocalDate date) throws IOException {

        String dateAsString = date.toString();
        String str = "";
        StringBuilder sb = new StringBuilder(str);
        Files.lines(Paths.get(file))
                .filter(log -> log.contains(dateAsString))
                .filter(log -> log.contains("ERROR"))
                .forEach(log -> sb.append(log + '\n'));


        String fileOutput =
                "C:\\Users\\Nanobyte385\\Desktop\\TempFolderForJavaTask\\" +
                        "ERROR" + dateAsString + ".log";
        Files.write(Paths.get(fileOutput), sb.toString().getBytes());

    }


}
