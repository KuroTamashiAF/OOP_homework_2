import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RalationHumanAnimal implements RealayionInterface {
    // private Human human;
    // private List<Animal> animal;

    private Map<Human, List<Animal>> humanToAinmals;
    public RalationHumanAnimal() {                         //ctor
        humanToAinmals = new HashMap<>();                  //ctor
    }
    @Override
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

    @Override
    public List<Animal> returnAnimalsByHuman(Human human) {
        
        return humanToAinmals.get(human);
    }
}
