package sweets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GiftBox {

    private Map <String, Double> weightGift;// ключ - название конфет, значение вес
    private Map <String, Double> priceGift;// ключ - название конфет, значение стоимость
    private double overallWeight;//итоговый вес подарка
    private double overallPrice;//итоговая стоимость подарка
    private ArrayList<Sweets> sweetsList;//список конфет в подарке


    public GiftBox(){
        weightGift = new HashMap<>();
        priceGift = new HashMap<>();
        overallPrice = 0;
        overallWeight = 0;
        sweetsList = new ArrayList<>();
    }

    public void addSweets(){

        Sweets newSweet;//объявление сладости, пока не известен тип
        System.out.println("Что желаете добавить в подарок: 1 - Candy, 2 - Jellybean.");
        int sweetType = GiftMaking.scanner.nextInt(); //считываем какого типа будет конфета
        if ((sweetType != 1) & (sweetType != 2))
            throw new IllegalArgumentException("Недопустимый ввод. Вы не определили 1 - Candy или 2 - Jellybean.");

        System.out.println("Введите название добавляемых конфет.");
        String name = GiftMaking.scanner.next();
        System.out.println("Введите вес добавляемых конфет.");
        double weight = GiftMaking.scanner.nextDouble();
        System.out.println("Введите стоимость добавляемых конфет.");
        double price = GiftMaking.scanner.nextDouble();
        System.out.println("Введите уникальный идентификатор сладости.");
        String uniqInt = GiftMaking.scanner.next();
        //Создаем сладость класса Candy
        if (sweetType == 1) {
            newSweet = new Candy(name, weight, price, uniqInt);//создание Candy
        }
        //Создаем сладость класса Jellybean2
        else {
            newSweet = new Jellybean2(name, weight, price, uniqInt);
        }
        sweetsList.add(newSweet); //добавление сладости
        System.out.println("Сладость " + newSweet.getName() + " успешно добавлена.");
        // Проверим, что вес и стоимость не равны null
        Double weightChecker = weightGift.get(newSweet.getName());
        if(weightChecker == null)
            weightChecker = 0.;//зануляем значение при добавление ключа
        Double priceChecker = priceGift.get(newSweet.getName());
        if(priceChecker == null)
            priceChecker = 0.;
        // Обновление карт для быстрого удаления/добавления элементов с одним именем
        weightGift.put(newSweet.getName(), weightChecker + newSweet.getWeight());
        priceGift.put(newSweet.getName(), priceChecker + newSweet.getPrice());
        updateWeightAndCost();//обновление стоимости и веса всего подарка
    }

    public void updateWeightAndCost(){
        overallWeight = 0;
        overallPrice = 0;
        for (Map.Entry<String,Double> entry: weightGift.entrySet()) { //обойдем всю карту
            overallWeight += entry.getValue();
        }
        for (Map.Entry<String, Double> entry: priceGift.entrySet()) {
            overallPrice += entry.getValue();
        }
    }

    //класс по удалению


    /**
     * Вывод информации по составу подарка, а также общий вес и стоимость
     */
    public void printResult() {
        System.out.println("Состав подарка:");
        for(Sweets bsSw: sweetsList){
            System.out.println("Имя: " + bsSw.getName() + " Вес: " + bsSw.getWeight() + " Стоимость: " + bsSw.getPrice());
        }
        System.out.println("Вес подарка составляет "+ overallWeight +" грамм, стоимость " + overallPrice + " руб.");
    }

}



