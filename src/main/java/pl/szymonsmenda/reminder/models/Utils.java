package pl.szymonsmenda.reminder.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utils {
    public static LocalDate stringToDate(String date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(ConfigModel.DATE_FORMAT);
        return LocalDate.parse(date, dateTimeFormatter);
    }


    public static String dateToString(LocalDate date) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(ConfigModel.DATE_FORMAT);
        return dateTimeFormatter.format(date);
    }

}
