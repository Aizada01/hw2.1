public class Main {
    public static void main(String[] args){
        Cow cow = new Cow(7, 150);
        Horse horse = new Horse(12, 210);
        Deer deer = new Deer(14, "Бэмби");
        cow.print();
        horse.print();
        deer.print();














        Predators lion = createObject("Lion");
        Predators wolf = createObject("Wolf");
        Predators black_panther = createObject("Black_Panther");
        lion.print();
        wolf.print();
        black_panther.print();
    }



    public static Predators createObject( String className){
       switch (className) {
           case "Lion":
               Lion lion = new Lion(13, "Алекс", 123);
               return lion;
           case "Wolf":
               Wolf wolf = new Wolf(9, "Ааууу", 67);
               return wolf;
           case "Black_Panther":
               Black_Panther black_panther = new Black_Panther(5, 56, "Тчала");
               return black_panther;

       }
    return null;
    }
}