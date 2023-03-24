package finalwork;

public abstract class Food extends Product{
    private String date;
    
    public Food(String name, Double price, Integer count, String unit, String date) {
        super(name, price, count, unit);
        this.date = date;
    }

    public String getName() {
        return "Продукты питания";
    }

    @Override
    public String toString() {
        return String.format("Срок годности: 24.03.2023 %s ", 
                             super.toString(), date);
    }
}
