//6. Gestionarea și generarea excepțiilor - 1. Gestionarea și generarea excepțiilor în Java

/*Exercitiul 2 continuare

 */

public class Tema38 {

    public static void main(String[]args){
        try{
            Tema37 u = new Tema37(101, "Petar", "Petrovic", "petrov@mail.mm");

        }catch (InvalidIdException ex){
            System.out.println("Id incorect");
        }catch(InvalidFirstNameException ex){
            System.out.println("Nume incorect");
        }catch (InvalidLastNameException ex){
            System.out.println("prenume incorect");
        }catch (InvalidEmailException ex){
            System.out.println("Email incorect");
        }
    }
}





/*
Rezultate exercitii:
1.a
2.b
3.a
4.a
5.a
6.a
7.a
 */