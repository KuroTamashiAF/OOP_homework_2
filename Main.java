public class Main {
    public static void main(String[] args) {
        Human hunan1 = new Human("Alex");
        Animal animalCat = new Cat("Murka");
        Animal animalDog = new Dog("Barlog");
        
        // Animal AnimalCat1 = new Cat ("Barsicik");
        RealayionInterface relations = new RalationHumanAnimal();
        // relations.addAnimaltoHuman(hunan1, animalCat);
        // relations.addAnimaltoHuman(hunan1, animalDog);
        // relations.addAnimaltoHuman(hunan1, AnimalCat1);
        // System.out.println(relations.returnAnimalsByHuman(hunan1));
        // System.out.println(Cat.class);
        Action action1 =  new Action();
        action1.addAnimaltoHuman(hunan1, animalCat);
        action1.addAnimaltoHuman(hunan1, animalDog);
        //action1.SummoningTechnique(hunan1);
        System.out.println();
        action1.PetAnCat(hunan1, Animal.class);
    }
}
