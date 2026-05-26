package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args){
        Optional<Integer> op = Optional.ofNullable(null);
        System.out.println(op.isPresent());

        String s = Optional.ofNullable(null).orElse("Default").toString();
        System.out.println(s);

//        Local Date And Time
        LocalDate D = LocalDate.now();
        System.out.println("Local Date : "+D);
        System.out.println("Local Date + 5 day : "+D.plusDays(5));

        LocalTime T = LocalTime.now();
        System.out.println("Local Time : "+T);

        LocalDateTime DT = LocalDateTime.now();
        System.out.println("Local Date & Time :"+DT);

//        custom date
        LocalDate l = LocalDate.of(2022,5,26);
        System.out.println("Custom Date : "+l);
    }
}
