//7. Gestionarea sistemului de fisiere - 2. Serializare

//Continuare Tema41

import java.io.FileNotFoundException;

public class Tema42 {
    public Tema42() throws FileNotFoundException {
    }

    public static void main(String[] args) throws FileNotFoundException {

        Tema41 t = new Tema41();
        t.setId(3);
        t.setEmail("email@test.ro");
        t.setPassword("password");
        t.serializeXml("myproject.xml");
    }

    public void deserializare() throws FileNotFoundException {
        Tema41 t = Tema41.deserializeXml("myproject.xml");
        System.out.print(t);
    }
}