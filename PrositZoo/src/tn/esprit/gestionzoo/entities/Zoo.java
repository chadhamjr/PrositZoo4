package tn.esprit.gestionzoo.entities;

public class Zoo {

    static final int NUMBER_OF_CAGES = 25;
   private Animal[] animals;
   private String name, city;
   private int nbrAnimals;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.name = name;
        this.city = city;
    }
public String getName()
{
    return name;
}
public void setName(String name)
{
    if(name.isEmpty()==false)
        this.name=name;
    else
        System.out.println("give me name");
}
public String getCity()
{
    return city;
}
public void setCity(String city)
{
    this.city=city;
}



    public void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    public boolean addAnimal(Animal animal, Zoo zoo) {
        if (isZooFull(zoo) || searchAnimal(animal)==-1)
            return false;
        if (!isZooFull(zoo) || searchAnimal(animal)!=-1)
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

   public  boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
            animals[nbrAnimals] = null;
            this.nbrAnimals--;
        }
        return true;
    }

   public  void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    public static boolean isZooFull(Zoo zoo){
        return zoo.nbrAnimals == NUMBER_OF_CAGES;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
    }
}
