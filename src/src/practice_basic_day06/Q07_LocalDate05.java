package src.practice_basic_day06;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Q07_LocalDate05 {
    public static void main(String[] args) {

       /*
         What is the output of the following code?
        Asagidaki code'un  ciktisi  nedir?
        */

        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);

        Period p = Period.ofDays(1).ofYears(2);// PERIOD CLASS TAN P OBJESI VAR,EN SON HANGISI EKLENDIYSE O GECERLIDIR
                                                // SADECE YIL -2 YIL OLARAK ALIRIIZ


        d = d.minus(p); // MINUS YILI  GERIYE GOTURUR.2015-2 = 2013

        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

        System.out.println(d.format(f));

 /*
            A. 5/9/13 11:22
            B. 5/10/13 11:22 //CEVAP
            C. 5/9/14
            D. 5/10/14
            E. The code does not compile.
            F. A runtime exception is thrown.
*/

    }
}
