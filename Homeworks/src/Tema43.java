// Java > Gestionarea sistemului de fisiere > Serializare

//Continuare Tema41

import java.io.FileNotFoundException;

public class Tema43 {
    public Tema43() throws FileNotFoundException {
    }

    public static void main(String[] args) throws FileNotFoundException {
        Tema41 t = Tema41.deserializeXml("myproject.xml");
        System.out.print(t);
    }

}

/*
Raspunsuri exercitii:
1.a
2.a
3.a
4.a
5.a
6.b
7.a
 */
