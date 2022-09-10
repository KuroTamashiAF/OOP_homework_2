public class Main {
    public static void main(String[] args) {
        Human hunan1 = new Human("Alex");
        Animal animalCat = new Cat("Murka");
        Animal animalDog = new Dog("Barlog");
        RealayionInterface relations = new RalationHumanAnimal();
        relations.addAnimaltoHuman(hunan1, animalCat);
        

        

    }
}
