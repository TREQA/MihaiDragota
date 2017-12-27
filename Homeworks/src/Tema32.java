// 5. Tipurile de date obiectuale - 1. Stringurile
//Exercițiul 4

/*
Datele intră în aplicație prin intermediul următoarelor două stringuri:
String[] forbidenChars = { "<",">","'" };
String input = "<div>my 'div' tag</div>";
Trebuie să curățați stringul astfel încât la ieșire să nu apară
caracterele: divmy div tag/div
*/

public class Tema32 {
    public static void main(String[] args) {
        String[] forbiddenChars = {"<", ">", "'"};
        String input = "<div>my'div'tag</div>";
        String output = input;
        for (int i = 0; i < forbiddenChars.length; i++)
        {
            output = output.replace(forbiddenChars[i],"");
        }
        System.out.println(output);
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
