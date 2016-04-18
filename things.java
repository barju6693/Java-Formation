public class Calculadora{

    public Calculadora(){

    }

    public int mult(int x, int y){
        return x*y;
    }
    public int sum(int x, int y){
        return x+y;
    }
    public int rest(int x, int y){
        return x-y;
    }
    public float div(int x, int y){
        return (float)x/y;
    }

}

public static void main(String[] args) {
    Calculadora calc = new Calculadora();
    System.out.println("VALUES: 25 , 5");
    System.out.println("DIVISIO --> "+calc.div(25, 5));
    System.out.println("SUMA --> "+calc.sum(25, 5));
    System.out.println("MULTIPLICACIO --> "+calc.mult(25, 5));
    System.out.println("RESTA --> "+calc.rest(25, 5));

}
