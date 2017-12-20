// Java Controlul fluxului, buclele si ramificare > SWITCH

// avem urmatoarele date de intrare pentru un automobil: String carMake = "Ford"; int doors = 4;
// Trebuie sa se faca o structura conditionala care va verifica daca producatorul automobilului este Ford si, daca este
// in functie de numarul de usi, sa se afiseze mesajul adecvat.=

public class Tema13 {
    public static void main(String[]args){
        String carMake = "Ford";
        int doors = 4;

        switch (carMake){
            case "Ford":
                switch(doors){
                    case 2
                        System.out.println("Ford with 2 doors");
                        break;
                    case 4:
                        System.out.println("Ford with 4 doors");
                        break;
                    default:
                        System.out.println("The car is not a ford");break;
                }
        }
    }
}

/*
Raspunsuri intrebari:
1.a
2.a
3.a
4.c
5.a
6.c
7.a
 */

