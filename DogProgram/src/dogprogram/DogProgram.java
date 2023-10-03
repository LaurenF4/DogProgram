package dogprogram;

/**
 * Author: Lauren Fenwick
 * Date: 03/10/23
 */
public class DogProgram {


    public static void main(String[] args) {
        Dog theDog = new Dog();
        keyboard kb = new keyboard();
        
        theDog.setName(kb.getString("what is the Dog's name?  "));
        theDog.setGender(kb.getString("what is " + theDog.getName() + "'s gender? "));
        theDog.setBreed(kb.getString("what breed is " + theDog.getName() + " ?  "));
        theDog.setColourOfCoat(kb.getString("what colour is " + theDog.getName() + "'s coat?  "));
        theDog.setSize(kb.getString("what size is " + theDog.getName() + "?  ")); 
        theDog.setOwnerName(kb.getString("what is " + theDog.getName() + "'s owner's name? "));
        theDog.setFoodType(kb.getString("what does " + theDog.getName() + " eat? "));
        theDog.setAge(kb.getInt("how old is " + theDog.getName() + "? "));
        theDog.setNoOfLegs(kb.getInt("how many legs does " + theDog.getName() + " have? "));
        theDog.setWeight(kb.getDouble("How much does " + theDog.getName() + " weigh? "));
        theDog.setHeight(kb.getDouble("How tall is " + theDog.getName() + " ? "));
        //theDog.walkTheDog(kb.getDouble("How far did " + theDog.getName() + " walk today? "));
        //theDog.setTrained(kb.getBool("is " + theDog.getName() + " trained? "));
       
        theDog.displayDetails();
        
  
    }
}