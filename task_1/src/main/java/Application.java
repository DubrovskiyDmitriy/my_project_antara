import model.Kotic;

public class Application {
    public static void main(String[] args) {
        Kotic cat1 = new Kotic("Вася",8, 5, "Мяу-мяу");
        Kotic cat2 = new Kotic();
        cat2.setPrettiness(6);
        cat2.setName("Филип");
        cat2.setWeight(4);
        cat2.setMeow("Мур...");

        cat1.liveAnotherDay();
        cat2.liveAnotherDay();
        if (cat1.getMeow() == cat2.getMeow()){
            System.out.println("Одинаковые имена");
        }else {
            System.out.println("Разные имена");
        }
        System.out.println("Количество созданных конструкторов"+ " " + Kotic.getCatCount());
    }
}
