import java.util.ArrayList;

public class PersonSet implements PersonList {
    protected ArrayList<Person> personList;

    public PersonSet() {
        personList = new ArrayList<>();
    }

    @Override
    public void add(Person chosenPerson) {
        if (chosenPerson != null && !personList.contains(chosenPerson)) {
            personList.add(chosenPerson);
        }
    }

    @Override
    public Person get(int index) {
        if (index >= 0 && index < personList.size()) {
            return personList.get(index);
        } else {
            System.out.println("Index " + index + " is out of bounds");
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuild = new StringBuilder();
        for (Person person : personList) {
            stringBuild.append(person.toString()).append("\n");
        }
        return stringBuild.toString();
    }
}
