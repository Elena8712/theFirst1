package sweets;

public class Candy extends Sweets{

    private String uniqInt;//создаем поле уникальных идентификаторов

    public Candy(String name, double weight, double price, String uniqInt){

        super(name, weight, price);//вызов конструктора Sweets
        this.uniqInt = uniqInt;
    }

    public String getUniqInt(){
        return uniqInt;
    }
}
