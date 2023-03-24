package finalwork;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Product> goods = readDb();
        viewGoods(goods);
    }

    public static void viewGoods(List<Product> prodList) {
        for (Product goods : prodList) {
            System.out.printf("%s\n", goods.getName());
            System.out.printf("    %s\n", goods);
        }
    }

    private static List<Product> readDb() {
        List<Product> goods = new ArrayList<>();


        
        goods.add(new Bread("Черный", 60.0, 200, "шт", "24.03.2023", "ржаная"));
        goods.add(new Bread("Белый", 50.0, 200, "шт", "24.03.2023", "пшеничная"));
        
        
        goods.add(new Eggs("куриные 2с", 60.0, 200, "шт", "24.04.2023", 10));
        goods.add(new Eggs("куриные 1с", 50.0, 200, "шт", "24.04.2023", 30));
        
        goods.add(new Mask("Одноразовая", 5.0, 200, "шт", 300));
        
        goods.add(new ToiletPaper("Двуслойная", 200.0, 200, "шт", 8, 20));
        goods.add(new ToiletPaper("Однослойная", 50.0, 200, "шт", 8, 20));
        
//      goods.add(new Diapers("Памперсы", 100.0, 200, "шт", 1, true, "32", 1, 6));
//        
        goods.add(new Pacifier("Соска", 100.0, 200, "шт", 0, false));
        
        goods.add(new Soda("Fanta", 200.0, 200, "шт", "2.5л", "24.03.2023"));
        goods.add(new Soda("CacaCola", 100.0, 200, "шт", "2.5л", "24.03.2023"));
//      goods.add(new Milk("Молоко", 50.0, 5, "б","2л", "24.03.2023", 12.5)); 
        // Не получается сделать такое с молоком и памперсами, почему-то выдает ошибку
        
        
        return goods;
    }
    
}
