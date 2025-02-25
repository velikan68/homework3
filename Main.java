import java.util.Scanner;

import ru.netology.service.CustomService;

public class Main {

    public static void main(String[] args){
        System.out.println("Здравствуйте! Этот расчет поможет вам узнать размер пошлины на товар.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите цену товара (в руб.):");
        int productPrice = scanner.nextInt();

        System.out.print("Введите вес товара (в кг.):");
        int productWeight = scanner.nextInt();

        int dutyPrice = CustomService.calculateCustoms(productPrice, productWeight);
        System.out.println("Размер таможенной пошлины: " + dutyPrice + " руб.");

        //scanner.close();
    }
}