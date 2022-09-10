import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RalationHumanAnimal {
    // private Human human;
    // private List<Animal> animal;

    private Map<Human, List<Animal>> humanToAinmals;
    public RalationHumanAnimal() {
        humanToAinmals = new HashMap<>();
    }

    public void addAnimaltoHuman(Human hum, Animal ani){
        if (humanToAinmals.containsKey(hum)){
            humanToAinmals.get(hum).add(ani);
        }
        else {
            List<Animal> forAdding = new ArrayList<>();
            forAdding.add(ani);
            humanToAinmals.put(hum, forAdding);
        }
    }
}
