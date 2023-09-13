public class Arms extends Limbs {


    public void exercise() {
        if (isHurt) {
            System.out.println("You are in too much pain to do this.");
        }
        System.out.println("You lifted weights");
        getHurt();


    }
}



