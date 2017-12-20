//3. Controlul fluxului, buclele și ramificarea. 3. Bucla For

//Exerciţiul 2

//În aplicaţie intră şirul următor:
//String[][] users = { { "petar" , "petrovic" , "1111" },{"jovan","jovanovic","2222"}, {"zoran","ivanovic","3333"}
//Trebuie să separăm numele utilizatorilor şi să le stocăm într-un şir separat. Acest şir trebuie emis la ieşire.



public class Tema15 {

    public static void main(String[]args){
        String [][] users = {{"petar", "petrovic","1111"},
                {"jovan","jovanovic","2222"},
                {"zoran","ivanovic","3333"}
        };

        String [] name = new String[users.length];
        for (int x = 0; x<users.length;x++)
            name[x] = users[x][0];
        System.out.println(java.util.Arrays.toString(name));

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