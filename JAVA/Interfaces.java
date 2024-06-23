interface Animalss {

}

class Horsee implements Animalss {
   public void walk() {
       System.out.println("Horse walks on 4 legs");
   }
}


class Chickens implements Animalss {
   public void walk() {
       System.out.println("Chicken walks on 2 legs");
   }
}


public class Interfaces {
   public static void main(String args[]) {
      Horsee horse = new Horsee();
      horse.walk();
      //output is somewheree linked with abstract.java
      //coz both files have same child class
   }
}

