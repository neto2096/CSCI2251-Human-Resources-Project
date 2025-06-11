import java.util.ArrayList;

public class PersonSet implements PersonList {
    private ArrayList<Person> personList;

    public PersonSet() {
        personList = new ArrayList<>();
    }

    public void add(Person chosePerson) {

    }

    public Person get(int index) {
        if (index >= 0 && index < personList.size()) {
            return personList.get(index);
        } else {
            System.out.println("Index " + index + " is out of bounds");
            return null;
        }
    }
}
