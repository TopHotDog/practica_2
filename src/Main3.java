import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        String pixelKcalDay = "43"; // столько калорий съел Пиксель до похода к бабушке
        String beefKcal = "30.2"; // калорийность говядины
        String chickenKcal = "23.8"; // калорийность курицы
        String creamKcal = "32.1"; // калорийность сливок
        String milkKcal = "13.5"; // калорийность молока

        float initialKcal = Float.parseFloat(pixelKcalDay);
        float pixelChoice = getMinKcalsSum(beefKcal, chickenKcal, creamKcal, milkKcal);
        float totalKcal = initialKcal + pixelChoice;

        checkKcal(totalKcal);
    }

    private static Float getMinKcalsSum(String firstDishKcal, String secondDishKcal, String firstDesert, String secondDesert) {
        float dish1 = Float.parseFloat(firstDishKcal);
        float dish2 = Float.parseFloat(secondDishKcal);
        float minDishKcal = Math.min(dish1,dish2);
        float desert1 = Float.parseFloat(firstDesert);
        float desert2 = Float.parseFloat(secondDesert);// вычислите минимальную калорийность основного блюда
        float minDesertKcal = Math.min(desert1,desert2); // вычислите минимальную калорийность десерта
        return minDishKcal + minDesertKcal;
    }

    private static void checkKcal(float catKcal) {
        System.out.println("Калорийность рациона Пикселя за день: " + catKcal);
        if (catKcal > 100) {
            System.out.println("Пиксель сегодня не уложился в норму.");
        } else {
            System.out.println("Лимит не превышен!");
        }
    }
}