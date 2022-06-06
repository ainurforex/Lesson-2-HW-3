public class Main {
    public static void main(String[] args) {
        byte bananWeightGr=80;
        byte milkWeightGr=105;
        byte plombirWeightGr=100;
        byte eggWeightGr=70;
        float breakfastTotalWeightGr;
        float breakfastTotalWeightKg;
        breakfastTotalWeightGr=(bananWeightGr*5)+(milkWeightGr*2)+(plombirWeightGr*2)+(eggWeightGr*4);
        breakfastTotalWeightKg=breakfastTotalWeightGr/1000;
        System.out.println("Общий вес завтрака- "+breakfastTotalWeightKg+" кг.");
    }
}