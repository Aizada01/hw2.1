public class Deer extends Herbivores implements Printable{

    private String name;

    public Deer(Integer age, String name) {
        super(age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Возраст Оленя: " + getAge() +
                "\nИмя Оленя: " + getName());

    }
}
