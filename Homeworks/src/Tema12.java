// 3. Controlul fluxului, buclele și ramificarea - 2. Controlul fluxului - Switch

// Exerciţiul 1: Trebuie să verificăm restul împărţirii dintre x şi y. Dacă nu există rest,
// trebuie să se afişeze mesajul că restul nu există, în caz contrar, trebuie
//să se verifice dacă restul este mai mare sau mai mic decât o mie şi să
//se afişeze mesajul corespunzător.


public class Tema12 {

    public static void main(String[] args){

        int x  = 523134;
        int y = 325423;
        int restul = x%y;
        switch (restul){
            case 0:
                System.out.println("nu are rest");
                break;
            default:
                if(restul>1000)
                    System.out.println("restul este mai mare decat 1000");
                else
                    System.out.println("restul este mai mic decat 1000");
                break;
        }
    }
}