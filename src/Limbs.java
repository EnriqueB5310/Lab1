import java.util.Random;

public class Limbs {
   public  boolean isHurt;
Random hurtChance = new Random();

//1 in 20 chance of injury on any limb related activity, no idea if 1/20 is too rare im bad at probability
    public void getHurt() {
        int n = hurtChance.nextInt(21);

        if (n == 20) {
            isHurt = true;
        }

    }


}
