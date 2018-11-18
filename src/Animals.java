import javax.print.DocFlavor;

public class Animals {

    public static void main(String[] args) {

        Animal[] animals = new Animal[6];
        animals[0] = new Dog("Burek");
        animals[1] = new Cat("Filemon");
        animals[2] = new Pig("Prosiaczke");
        animals[3] = new Horse("Bonufacy");
        animals[4] = new Fish("Dory");
        animals[5] = new Animal();



        for (Animal a: animals){
            a.introduece();
        }


    }

}
morfeusz.wszib.edu.pl

class Animal {
    String name;

    public Animal() {
        this.name = "bezimienny";
    }

    String showName (){
        return "zwierzę" + name;

    }

    String makeSound (){
        return "????" ;
    }

    void introduece (){
        System.out.println("Jestem: " + showName() + "  " + makeSound());
    }

}

class Dog extends Animal {

    public Dog(String name){
        this.name = name;

    }

    @Override
    String showName() {
        return "pies " + name;
    }

    @Override
    String makeSound() {
        return "hau hau";
    }
}


class Cat extends Animal {

    public Cat(String name){
        this.name = name;

    }

    @Override
    String showName() {
        return "kot " + name;
    }

    @Override
    String makeSound() {
        return "miau miau";
    }
}


class Pig extends Animal {

    public Pig(String name){
        this.name = name;

    }

    @Override
    String showName() {
        return "świnia " + name;
    }

    @Override
    String makeSound() {
        return "chrumk chrumk";
    }
}


class Fish extends Animal {

    public Fish(String name){
        this.name = name;

    }

    @Override
    String showName() {
        return "ryba " + name;
    }

    @Override
    String makeSound() {
        return " no sound";
    }
}


class Horse extends Animal {

    public Horse(String name){
        this.name = name;

    }

    @Override
    String showName() {
        return "koń " + name;
    }

    @Override
    String makeSound() {
        return "iiihhahahaa";
    }
}