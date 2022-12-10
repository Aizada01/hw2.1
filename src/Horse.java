public class Horse extends Herbivores implements  Printable{
    private Integer height;


    public Horse(Integer age, Integer height) {
        super(age);
        this.height = height;
    }

    public Integer getHeight() {
        return height;
    }

    @Override
    public void print() {
        System.out.println("Возраст Лошади: " + getAge() +
                "\nРост Лошади: " + getHeight());

    }
}
