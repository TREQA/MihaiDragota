//3. Controlul fluxului, buclele și ramificarea. 3. Bucla For

//Exerciţiul 1
//Avem şirul următor:
//int[] arr = {1,2,-1,4,5,-1};
//Cu ajutorul buclei for, trebuie să copiem acest şir în şirul arr1, unde
//toţi membrii cu valoarea -1 trebuie înlocuiţi de membrii cu valoarea zero.
// Arr1 trebuie afişat apoi la ieşire.


public class Tema14 {
    public static void main(String[] args) {

        int[] arr = {1, 2, -1, 4, 5, -1};
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1)
                arr1[i] = 0;
            else
                arr1[i] = arr[i];
        }
        System.out.println(java.util.Arrays.toString(arr1));
    }
}






