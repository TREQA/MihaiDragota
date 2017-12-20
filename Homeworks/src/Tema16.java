//3. Controlul fluxului, buclele și ramificarea. 4. Buclele while şi do while

//Exerciţiul 1
//Este dat următorul şir de numere: int[] arr = {1,2,3,4,5,6,7,8,9,10};
//Trebuie să listăm şirul dat folosind bucla while.

public class Tema16 {

    public static void main(String[]args){

     int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int x = 0;
        while(x<arr.length)
        {
            System.out.println(arr[x]);
            x++;
        }
    }
}
