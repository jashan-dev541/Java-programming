class Animal{
    String name;
    void eat(){
        System.out.println("Animal is eating food");
    }
}

class Dog extends Animal{
    void voice(){
        System.out.println("Dog is barking");
    }
}

public class inheritance {
    public static void main(String args[]){
        Dog d = new Dog();
        d.name = "Dog";
        d.eat();
        d.voice();
        System.out.println("Animal is:" + d.name);
    }
}
