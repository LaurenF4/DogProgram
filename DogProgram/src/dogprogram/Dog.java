package dogprogram;

/**
 * Author: Lauren Fenwick
 * Date: 03/10/23
 */
public class Dog {
    //Instance Variables
    private String name;
    private String breed;
    private String colourOfCoat;
    private String size;
    private String ownerName;
    private String foodType;
    private String gender;
    private int noOfLegs;
    private int age;
    private double weight;
    private double height;
    private double distanceWalked;
    private boolean trained;
    private boolean isHungry;
    private boolean teethDirty;
    private boolean isHappy;

    
    //Methods
    public void bark (){
        System.out.println("Woof Woof!");
    }
    
    public void displayDetails(){
        System.out.println("________________________________");
        System.out.println("Details for " + ownerName + "'s dog, " + name);
        System.out.println("________________________________");
        System.out.println("Breed: " + breed);
        System.out.println("Coat Colour: " + colourOfCoat);
        System.out.println("Size: " + size);
        System.out.println("Food Type: " + foodType);
        System.out.println("Gender: " + gender);
        System.out.println("Number of Legs: " + noOfLegs);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("Distance Walked: " + distanceWalked);
        System.out.println("Dog is Trained: " + trained);
        System.out.println("Dog is Hungry: " + isHungry);
        System.out.println("Dog has Dirty Teeth: " + teethDirty);
        System.out.println("Dog is Happy: " + isHappy);
    }
    
    public void walkTheDog(double distance){
        distanceWalked += distance;
        isHappy = true;
        isHungry = true;
        System.out.println("Dog has had a lovely walk!");
    }
    
    public void patTheDog(){
       isHappy = true;
        System.out.println("Dog was patted and is now happy!");
              
    }
    
    public void cleanTheTeeth(){
        teethDirty = false;
        isHappy = false;
        System.out.println("Dog had their teeth cleaned!");
    }
    
    public void feedTheDog(){
        teethDirty = true;
        isHungry = false;
        System.out.println("Dog has been fed!");
    }

    //Constructors
    Dog(){
        name = "Unknown";
        ownerName = "Unknown";
        breed = "Unknown";
        colourOfCoat = "Unknown";
        size = "Unknown";
        foodType = "Unknown";
        gender = "Unknown";
        noOfLegs = 4;
        age = 0;
        weight = 0;
        height = 0;
        distanceWalked = 0;
        trained = false;
        isHungry = true;
        teethDirty = false;
        isHappy = true;
    }
    
        //getters and setters
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
            return name;
    }
        public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColourOfCoat() {
        return colourOfCoat;
    }

    public void setColourOfCoat(String colourOfCoat) {
        this.colourOfCoat = colourOfCoat;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }
        public double getDistanceWalked() {
        return distanceWalked;
    }

    public void setDistanceWalked(double distanceWalked) {
        this.distanceWalked = distanceWalked;
    }

    public boolean isIsHungry() {
        return isHungry;
    }

    public void setIsHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public boolean isTeethDirty() {
        return teethDirty;
    }

    public void setTeethDirty(boolean teethDirty) {
        this.teethDirty = teethDirty;
    }

    public boolean isIsHappy() {
        return isHappy;
    }

    public void setIsHappy(boolean isHappy) {
        this.isHappy = isHappy;
    }
}
