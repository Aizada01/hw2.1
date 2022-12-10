public class Wolf extends Predators{
    private String voice;
    private Integer weight;


    public Wolf(Integer age, String voice, Integer weight) {
        super(age);
        this.voice = voice;
        this.weight = weight;
    }

    public String getVoice() {
        return voice;
    }

    public Integer getWeight() {
        return weight;
    }

    @Override
    public void print() {
        System.out.println("Голос Волка: " + getVoice() +
                "\nВес Волка: " + getWeight() +
                "\nВозраст Волка: " + getAge());

    }
}
