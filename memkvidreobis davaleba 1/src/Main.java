public class Main {
    public static void main(String[] args)
    {
        Shop s = new Shop();
        s.arr = new Product[5];
        s.arr[0] = new Milk(6.50,"04/01/25",1.0);
        s.arr[1] = new Sandwitch(12.50,"13/01/25",15.0);
        s.arr[2] = new Coockie(2.39,"01/01/26",0.223);
        s.arr[3] = new Coockie(3.59,"01/06/25",0.477);
        s.arr[4] = new Milk(4.55,"02/01/25",0.5);
    }
}