public class Legs extends Limbs {

    public static void walk() {
        System.out.println("You took a walk");
    }


    public void jog() {
        if (isHurt) {
            System.out.println("You are in too much pain to do this.");
        }

        System.out.println("You went for a jog");
        getHurt();
    }

}
