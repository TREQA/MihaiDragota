// 5. Tipurile de date obiectuale - 1. Stringurile

/*Exercițiul 1
În aplicație intră o secvență de stringuri. Dimensiunea permisă a acestor stringuri la ieșire este de 25 de caractere, însă unele dintre ele
insa unele dintre ele sunt mai mai mari de atat la iesire.
Creati un program care, atunci cand un string depaseste dimensiunea de 25 de caractere, va intrerupe stringul si va
introduce trei puncte in locul ultimelor trei caractere. Stringurile astfel procesate trebuie afisate la iesire
Intrarea programului:
String [] texts =
{ "Optimum pH of your water is between 6.0 and 7.0. However Oscars are okay in a pH up to 8.0.",
"The Oscar fish is not a difficult fish to look after if you give it a suitable envinronment to live in. YOu may start
having problems such as health issues if you keep your Oscar in an unsuitably small tank or feed it on a poor diet",
The Oscar has the potential to reach 18 inches. Howvere in captivity Oscars normally grow between 8 and 12 inches
};
 */
public class Tema29 {
    public static void main(String[] args) {

        String[] texts = {
                "Optimum pH of your water is between 6.0 and 7.0. However Oscars are okay in a pH up t o 8.0.",
                "The Oscar fish is not a difficult fish to look after if you give it a suitable environment to live in." +
                        "You may start having problems such as health issues if you keep your Oscar in an unsuita bly small tank or feed it on a poor diet",
                "The Oscar has the potential to reach 18 inches. However in captivity Oscars normally grow to between 8 and 12 inches"
        };
        for (int i = 0; i < texts.length; i++) {
            {
                if (texts[i].length() > 25) {

                    String tmpTxt = texts[i].substring(0, 22);
                    tmpTxt = tmpTxt.concat("...");
                    System.out.println(tmpTxt);


                }

            }

        }
    }
}