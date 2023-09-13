import java.util.Scanner;

public class Person {
    String[] organs = {"Heart", "Brain", "Lungs", "Kidneys", "The rest"};
    int bones = 206;
    String name;
    int age;
    String hairColor;
    String eyeColor;
    Scanner hair = new Scanner(System.in);
    Scanner howOld = new Scanner(System.in);
    Scanner eyes = new Scanner(System.in);

    Arms arms = new Arms();
    Legs legs = new Legs();

    public  Person() {
        CreatePerson();
    }

public  void CreatePerson() {

System.out.println("How old are you? ");
age = howOld.nextInt();
System.out.println("What color is your hair");
hairColor = hair.nextLine();
System.out.println("Eye color?");
eyeColor = eyes.nextLine();

display();


}
public void display() {
    System.out.println("Age: " + age);
    System.out.println("Hair color: " + hairColor);
    System.out.println("Eyes: " + eyeColor);
}

public void activities() {
        Scanner choose = new Scanner(System.in);
        int choice = 0;
        System.out.println("Select an activity, (enter -1 to exit)");
        System.out.println("1: workout, 2: take a walk, 3: jog, 4: nap");
        choice = choose.nextInt();
        while(choice >= 0) {
            System.out.println("Select an activity, (enter -1 to exit)");
            System.out.println("1: workout, 2: take a walk, 3: jog, 4: nap");
            choice = choose.nextInt();
            switch(choice){
                case 1: arms.exercise();
                break;
                case 2: legs.walk();
                break;
                case 3:legs.jog();
                break;
                case 4: rest();
                break;
                default: break;

            }

        }

}

public void rest() {
    arms.isHurt = false;
    legs.isHurt = false;
}


}
