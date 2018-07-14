package sweets;

public class Jellybean2 extends Sweets {

    private String uniq;

    public Jellybean2(String name, double weight, double price, String uniq) {
        //вызов конструктора Sweets
        super(name, weight, price);
        this.uniq = uniq;
    }

    public String getUniq() {
        return uniq;
    }

}

