abstract class Animal { //Abstract hide the unnecessary things 
   void walk(){}//or " abstract void walk(); " coz all child class has its own walk function
   void breathe() {//we can't write abstract void breathe
                   //coz this fn is using by child class
       System.out.println("This animal breathes air");
   }
   Animal() {
       System.out.println("You are about to create an Animal.");
   }
}


class Horse extends Animal {
   Horse() {
       System.out.println("Wow, you have created a Horse!");
   }
   void walk() {
       System.out.println("Horse walks on 4 legs");
   }
}


class Chicken extends Animal {
   Chicken() {
       System.out.println("Wow, you have created a Chicken!");
   }
   void walk() {
       System.out.println("Chicken walks on 2 legs");
   }
}


public class Abstract {
   public static void main(String args[]) {
      Horse horse = new Horse();
      horse.walk();
      horse.breathe();
      /*Animal animal = new Animal(); This will not work coz Animal is
       animal.walk();                 abstract or blueprint only
       */
   }
}
