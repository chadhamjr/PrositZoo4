package tn.esprit.gestionzoo.entities;

public class Animal {

   private String family, name;
    private int age;
   private  boolean isMammal;

    public Animal() {

    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getFamily()
    {
        return family;
    }
    public void setFamily(String family)
    {
        this.family=family;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age>0)
            this.age=age;
        else
            System.out.println("age");
    }
    public boolean getIsMammal(){
        return isMammal;
    }
    public void setIsMammal(boolean isMammal){
        this.isMammal=isMammal;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

}
