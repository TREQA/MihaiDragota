//4. Programarea orientată pe obiecte în Java - 4. Clase abstracte şi interfeţe

//Exerciţiul nr. 1

public class Tema22 {
    public static void main(String[] args){
        Pizza p = new Pizza("Cappriciosa", 25);
        Sandvis s = new Sandvis("Sendvis cu sunca",35);
        s.addition("castravete");
        s.addition("ceapa");
        s.addition("rosii");
        System.out.println(p);
        System.out.println(s);

    }
}