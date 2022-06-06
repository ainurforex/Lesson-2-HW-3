public class Main {
    public static void main(String[] args) {
        int banan=5;
        int bananWeightGr=80;
        int milk=200/100;
        int milkWeightGr=105;
        int plombir=2;
        int plombirWeightGr=100;
        int egg=4;
        int eggWeightGr=70;
        int breakfastTotalWeightGr;
        float breakfastTotalWeightKg;
        int grInKg=1000;
        breakfastTotalWeightGr=(bananWeightGr*banan)+(milkWeightGr*milk)+(plombirWeightGr*plombir)+(eggWeightGr*egg);
        breakfastTotalWeightKg=(float) breakfastTotalWeightGr/(float) grInKg;
        System.out.println("Общий вес завтрака- "+breakfastTotalWeightKg+" кг.");
    }
}