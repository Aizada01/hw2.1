public class Lion extends Predators{
    private String name;
    private Integer height;

    public Lion(Integer age, String name, Integer height) {
        super(age);
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public Integer getHeight() {
        return height;
    }

    @Override
    public void print() {
        System.out.println("Имя Льва: " + getName() +
                "\nРост Льва: " + getHeight() +
                "\nВозраст Льва: " + getAge());


    }
}
