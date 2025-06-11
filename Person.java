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
}
