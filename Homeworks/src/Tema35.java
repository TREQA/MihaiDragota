// 5. Tipurile de date obiectuale - 4. Gestionarea datei și a timpului


/*
Creati un program care va afisa la iesire toate lunile anului curent si durata lor
 */

import java.time.LocalDate;
import java.time.Month;

public class Tema35 {
    public static void main(String[] args){
        LocalDate now = LocalDate.now();
        for(Month month : Month.values()){
            System.out.println(month+" "+month.length(now.isLeapYear()));
        }
    }
}

/*
Raspunsuri intrebari:
1.a
2.a
3.a
4.a
5.a
6.a
7.a
 */