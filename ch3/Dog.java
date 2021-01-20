public class Dog {
    String name;
    public static void main(String[] args) {
        
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";
        
        Dog[] mydDogs = new Dog[3];
        mydDogs[0] = new Dog();
        mydDogs[1] = new Dog();
        mydDogs[2] = dog1;

        mydDogs[0].name = "Fred";
        mydDogs[1].name = "Marge";

        System.out.print("last dog's name is ");
        System.out.println(mydDogs[2].name);

        int x = 0;
        while (x < mydDogs.length) {
            mydDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark() {
        System.out.println(name + " says Ruff!");
    }

    public void eat() {

    }

    public void chaseCat() {}
}
