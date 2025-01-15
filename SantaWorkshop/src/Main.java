import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //1)
        Elf elf1 = new Elf("Cam", "#1", 420, 10, "Wrapper");
        elf1.makeToy();
        elf1.wrapGifts();
        //2)
        Reindeer reindeer1 = new Reindeer("Comet", "ct", 12, 150, "Red");
        reindeer1.fly();
        System.out.println(reindeer1.checkFitnessLevel());
        //3)
        Child child1 = new Child("Bob", 7);
        child1.addWish("Toy Supercar");
        Child child2 = new Child("Marry", 10);
        child2.addWish("Doll");
        //4)
        Santa santa = new Santa("Santa", "Claus", 2070, Arrays.asList(child1, child2));
        System.out.println(santa.checkNaughtyOrNiceList());
        santa.deliverGifts();
        //5)
        Snowman snowman = new Snowman(6.7, "Black", true);
        snowman.decorate("Chain");
        snowman.melt();
    }
}