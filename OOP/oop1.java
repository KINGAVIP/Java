
// Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
class Dog{
        private String name;
        private String breed;

        Dog()
        {
            name="Shero";
            breed="Puppy";
        }

        void setName(String name)
        {
            this.name=name;
        }
        void setBreed(String breed)
        {
            this.breed=breed;
        }
        String getName()
        {
            return name;
        }
        String getBreed()
        {
            return breed;
        }
    }
    public class oop1{
    public static void main(String[] args) {
        Dog d1=new Dog();
        Dog d2=new Dog();

        d1.setName("Romeo");
        d2.setName("shishimanu");
        d1.setBreed("Pilla");
        d2.setBreed("Dragron");
        System.out.println(d1.getName());
        System.out.println(d2.getName());
        System.out.println(d1.getBreed());
        System.out.println(d2.getBreed());
    }       
}
