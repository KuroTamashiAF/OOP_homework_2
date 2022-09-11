public class Action extends RalationHumanAnimal {
    @Override
    public String toString() {
        
        return humanToAinmals.toString();
    }

    public void SummoningTechnique(Human human) {
        if (humanToAinmals.containsKey(human)) {
            System.out.printf("%s call all Animals to him", human.GetName());
            // for (iterable_type iterable_element : iterable) {
                System.out.printf("%s come to the kitchen ", humanToAinmals.get(human));
        }
    }
    public void PetAnCat(Human human, Class<?> cls){
        for (Animal animal : humanToAinmals.get(human)) {
            if (cls.isInstance(animal) && animal.getClass()==Cat.class){
                System.out.printf("%s is happy",animal.getNickname() );
            }
            System.out.println();
            if (cls.isInstance(animal) && animal.getClass()==Dog.class){
                System.out.printf("%s is happy",animal.getNickname() );
            }
            
        }

    }
    /*public void PetAnDog(Human human, Class<?> cls){
        for (Animal animal : humanToAinmals.get(human)) {
            if (cls.isInstance(animal) && animal.getClass()==Dog.class){
                System.out.printf("%s is happy",animal.getNickname() );
            }
            
        }*/

}
