public class Black_Panther extends Predators{

    private Integer weight;
    private String name;

    public Black_Panther(Integer age, Integer weight, String name) {
        super(age);
        this.weight = weight;
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Имя Пантеры: " + getName() +
                "\nВес Пантеры: " + getWeight() );

    }
}
