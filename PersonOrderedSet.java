import java.util.Collections;

public class PersonOrderedSet extends PersonSet {
    @Override
    public void add(Person chosenPerson) {
        super.add(chosenPerson);
        sort();
    }
    
    private void sort() {
        Collections.sort(personList);
    }
}
