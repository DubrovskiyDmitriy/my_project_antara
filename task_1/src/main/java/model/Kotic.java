package model;

import java.util.Random;
public class Kotic {
//    public static void main(String[] args) {
//        model.Kotic kotic = new model.Kotic("Saha",12,30,"Мяу-Мяу");
//        kotic.liveAnotherDay();
//    }
    private String name;
    private int prettiness;
    private int weight;
    private String meow;
    static int catCount = 0;
    int  degreeSatiety;

    public Kotic() {
        this.name = "Unnamed";
        this.degreeSatiety = 100;
        catCount++;
    }
    public Kotic(String name, int prettiness, int weight, String meow){
        this.prettiness = prettiness;
        this.weight = weight;
        this.meow = meow;
        this.degreeSatiety = 100;
        this.name = name;
        catCount ++;
    }
    public static int getCatCount() {
        return catCount;
    }

    public void setPrettiness(int prettiness) {
        this.prettiness = prettiness;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    public String getName() {
        return name;
    }

    public int getSatiety() {
        return degreeSatiety;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public int getWeight() {
        return weight;
    }

    public String getMeow() {
        return meow;
    }
    public boolean play(){
        if (this.degreeSatiety <= 0) {
            System.out.println("Пора кормить" + " "+ name);
            feedingСat();
            return false;
        }else{
            this.degreeSatiety -= 5;
            System.out.println("Играет"+ " "+ name);
            return true;
        }

    }
    public boolean sleep(){
        if (this.degreeSatiety <= 0) {
            System.out.println("Пора кормить"+ " "+ name);
            feedingСat();
            return false;
        }else{
            this.degreeSatiety -= 5;
            System.out.println("Спит"+ " "+ name);
            return true;
        }

    }
    public boolean chaseMouse(){
        if (this.degreeSatiety <= 0) {
            System.out.println("Пора кормить"+ " "+ name);
            feedingСat();
            return false;
        }else{
            this.degreeSatiety -= 5;
            System.out.println("Ловит мышь"+ " "+ name);
            return true;
        }

    }
    public boolean meows(){
        if (this.degreeSatiety <= 0) {
            System.out.println("Пора кормить"+ " "+ name);
            feedingСat();
            return false;
        }else{
            this.degreeSatiety -= 5;
            System.out.println("Мяукает"+ " "+ name);
            return true;
        }

    }
    public boolean sharpensHisClaws(){
        if (this.degreeSatiety <= 0) {
            System.out.println("Пора кормить"+ " "+ name);
            feedingСat();
            return false;
        }else{
            this.degreeSatiety -= 5;
            System.out.println("Точит когти"+ " "+ name);
            return true;
        }

    }

    public void feedingСat(){
        eat();
    }
    public void eat() {
        eat(100);
        eat(100, "кошачья еда");
    }

    public void eat(int satietyIncrease) {
        degreeSatiety += satietyIncrease;
        System.out.println(name + " ест");
    }

    public void eat(int satietyIncrease, String foodName) {
        System.out.println(name + " поел на " + satietyIncrease + " " + foodName + ".");
    }
    public void liveAnotherDay(){
        Random r = new Random();
        for(int i = 0; i < 24; i++){
            int num = r.nextInt(4);
//        int num = count;
            switch(num) {
                case 0:
                    sleep();
                    break;
                case 1:
                    chaseMouse();
                    break;
                case 2:
                    play();
                    break;
                case 3:
                    sharpensHisClaws();
                    break;
                case 4:
                    meows();
                    break;
            }
        }
    }
}
