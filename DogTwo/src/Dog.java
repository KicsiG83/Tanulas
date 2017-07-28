import java.lang.reflect.Array;

class Dog{

    String name;

    public static void main(String[] args){
        //Dog objektum létrehozása
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.eat();
        dog1.chaseCat();
        dog1.name = "Fido";

        //Most létrehozzuk a Dog tömböt
        Dog[] myDogs = new Dog[3];
        //A tömböt feltöltöm kutyákkal
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Bodri";
        myDogs[1].name = "Fifi";

        System.out.print("Last dog's name is ");
        System.out.println(myDogs[2].name);

        int x = 0;

        while (x < myDogs.length){
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark(){
        System.out.println(name + " says Ruff!");
    }
    public void eat(){

    }
    public void chaseCat(){

    }
}