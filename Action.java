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

}
