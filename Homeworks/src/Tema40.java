//7. Gestionarea sistemului de fisiere - 1. Fluxuri de date

//Exercițiul 2

/*
Creati o aplicatie care concateneaza fisierele (pune doua fisiere intr-unul singur). Denumirile acestor fisiere sunt:
firstFile.txt, secondFile.txt, thirdFile.txt. Uniti continuturile acestor doua fisiere si puneti-le in fisierul denumit thirdFile.txt
*/

import java.io.*;
public class Tema40 {

    public static void main(String[] args) throws IOException {
        String tmpLine;
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Javatest\\thirdFile.txt"));
        BufferedReader br = new BufferedReader(new FileReader("C:\\Javatest\\firstFile.txt"));
        while ((tmpLine = br.readLine()) != null)
            bw.write(tmpLine + "\n");
        br.close();
        br = new BufferedReader(new FileReader("C:\\Javatest\\secondFile.txt"));
        while ((tmpLine = br.readLine()) != null)
            bw.write(tmpLine);
        br.close();
        bw.close();
    }
}

/*
Raspunsuri exercitii:
1.a
2.a
3.a
4.c
5.a
6.a
7.a
 */