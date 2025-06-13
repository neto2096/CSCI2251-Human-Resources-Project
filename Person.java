/*
 * Person.java
 * Name: Ernesto Morales Carrasco
 * Email: emoralescarras@cnm.edu
 * Assignment: Human Resources Part 1
 * Purpose: Represents a person with name, height, and weight attributes.
 */

public class Person implements Comparable<Person>{
    private String name;
    private double height, weight;

    public Person(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    // Setters
    public void setName(String chosenName) {
        name = chosenName;
    }

    public void setHeight(double chosenHeight) {
        height = chosenHeight;
    }

    public void setWeight(double chosenWeight) {
        weight = chosenWeight;
    }

    // toString Method
    @Override
    public String toString() {
        return name + "\t" + height + "\t\t" + weight;
    }

    // Compare two Person objects based on name, height, and weight
    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (o == this)
            return true;
        if (!(o instanceof Person))
            return false;
        Person p = (Person) o;
        return this.name.equals(p.name) &&
                Double.compare(this.height, p.height) == 0 &&
                Double.compare(this.weight, p.weight) == 0;
    }


    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }
}
