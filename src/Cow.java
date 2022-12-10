public class Cow extends Herbivores implements Printable{

    private Integer weight;


    public Cow(Integer age, Integer weight) {
        super(age);
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

    @Override
    public void print() {
        System.out.println("Возраст Коровы: " + getAge() +
                "\nВес Коровы: " + getWeight() );

    }
}
