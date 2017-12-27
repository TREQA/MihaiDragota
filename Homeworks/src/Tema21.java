//4. Programarea orientată pe obiecte în Java - 3. Moştenirea şi polimorfismul
/*Exerciţiul 1
        Trebuie creată o clasă Shape care va conţine unele date referitoare la
                forma geometrică, precum: poziţia (x,y), culoarea şi denumirea.
                Trebuie create trei clase care vor moşteni clasa Shape. O clasă trebuie
                creată pentru cerc, una pentru pătrat şi una pentru dreptunghi. Fiecare
                trebuie să conţină o metodă pentru calcularea ariei, precum şi propriile
                atribute necesare pentru această calculare (laturile pentru dreptunghi
                şi pătrat şi raza pentru cerc). De asemenea, cercul trebuie să posede şi
                constanta PI.
                Toate valorile pot fi întregi (dar nu şi PI).*/

public class Tema21 {
    public static void main(String[]args){
        Circle c = new Circle();
        c.r = 12;
        c.color = "crvena";
        c.x=100;
        c.y=200;
        System.out.println(c.area());
    }

    public String color;
    public int x;
    public int y;

    public static class Rectangle extends Tema21{
        public double a;
        public double b;
        public double area(){
            return a*b;
        }
    }
    public static class Square extends Tema21{
        public double a;
        public double area() {
            return a*a;
        }
    }
    public static class Circle extends Tema21{
        public final double PI = 3.14;
        public double r;
        public double area(){
            return r*r*PI;
        }
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
