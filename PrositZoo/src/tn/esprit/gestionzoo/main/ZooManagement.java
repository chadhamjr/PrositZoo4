package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("simba") ;
        lion.setAge(8) ;
        lion.setFamily("cats");
        lion.setIsMammal(true) ;

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion,myZoo));
        System.out.println(notMyZoo.addAnimal(dog,myZoo));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

     //   System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        notMyZoo.addAnimal(lion,myZoo);

        System.out.println(Zoo.comparerZoo(myZoo, notMyZoo));
        System.out.println(Zoo.isZooFull(myZoo));

    }

}
