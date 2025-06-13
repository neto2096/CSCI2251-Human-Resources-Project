public class PersonImperialSet extends PersonSet {
    @Override
    public void add(Person chosenPerson) {
        if (chosenPerson != null) {
            // Create new Person with converted height and weight
            Person imperialPerson = new Person(
                chosenPerson.getName(),
                convertHeight(chosenPerson.getHeight()),
                convertWeight(chosenPerson.getWeight())
            );
            // Add converted Person using PersonSet's add
            super.add(imperialPerson);
        }
    }

    private double convertHeight(double height) {
        // 1 cm ~ 0.393701 inches
        return Math.round(height * 0.393701 * 100.0) / 100.0;
    }

    private double convertWeight(double weight) {
        // 1 kg ~ 2.20462 pounds
        return Math.round(weight * 2.20462 * 100.0) / 100.0;
    }
}