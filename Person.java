public class Person {
    private String name;
    private double height, weight;

    public Person(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public double getHeight(){
        return height;
    }

    public double getWeight(){
        return weight;
    }

    public void setName(String chosenName){
        name = chosenName;
    }

    public void setHeight(double chosenHeight){
        height = chosenHeight;
    }

    public void setWeight(double chosenWeight){
        weight = chosenWeight;
    }

    @Override
    public String toString(){
        return name + ": * Height: " + height + " * Weight: " + weight;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o == this) return true;
        if (!(o instanceof Person)) return false;
        Person p = (Person) o;
        return this.name.equals(p.name) &&
               Double.compare(this.height, p.height) == 0 &&
               Double.compare(this.weight, p.weight) == 0;
    }
}
