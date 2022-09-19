package W1_obobsheniya;

public class Main {

    public static void main(String[] args) {
    TwoGen<Integer,String> twoGen = new TwoGen<>(5,"Hello");
    twoGen.showTypes();
        System.out.println("Int " + twoGen.getObj1()+" Str "+twoGen.getObj2());

    }
}
