package finalwork;



public class Bread extends Food{
    private String flour;
    
    public Bread(String name, Double price, Integer count, String unit, String expDate, String flour) {
        super(name, price, count, unit, expDate);
        this.flour = flour;
    }

    public String getName() {
        return String.format("Хлеб ", super.getName());
    }

    @Override
    public String toString() {
        return String.format("Мука: %s ", 
                             super.toString(), flour);
    }
}
