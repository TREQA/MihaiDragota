//4. Programarea orientată pe obiecte în Java - 4. Clase abstracte şi interfeţe

// continuare Product

public class Pizza extends Product{
    public Pizza(String name, double price){
        this.additions=new String[10];
        this.name = name;
        this.price=price;
    }
    public double countPrice(){
        return this.price+this.price*0.1;
    }
}


