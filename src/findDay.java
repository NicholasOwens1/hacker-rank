import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.time.LocalDate;


public class findDay {
    public static String findDay(int month, int day, int year) {
        // create a date object using the parameters year month and day
        LocalDate date = LocalDate.of(year, month, day);
        // make a string variable. Use the date object to get the day of the week and turn it into a string. Return the string.
        String dayOfWeek = date.getDayOfWeek().toString();
        return dayOfWeek;
    }

}

