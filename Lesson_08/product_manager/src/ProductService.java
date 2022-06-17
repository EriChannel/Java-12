import java.util.ArrayList;

public class ProductService {

    public ArrayList<Product> getAllProduct(){
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product(1, "Cốc", "Cốc sứ", 20, 80000, "Chiếc"));
        list.add(new Product(2, "Bút", "Bút thiên long", 4, 3000, "Chiếc"));
        list.add(new Product(3, "Bàn", "Bàn chân gập", 20, 400000, "Chiếc"));
        list.add(new Product(4, "Ghế", "Ghế gập", 3, 200000, "Chiếc"));
        list.add(new Product(5, "Bảng", "Bảng mica", 20, 150000, "Chiếc"));

        return list;
    }

    public void show(ArrayList<Product> list){
        for(Product p : list){
            System.out.println(p);
        }
    }

    public void getProductByName(ArrayList<Product> list, String fName){
        for(Product p : list){
            if(p.getName().toLowerCase().contains(fName.toLowerCase())){
                System.out.println(p);
            }
        }
    }
    public Product getProductById(ArrayList<Product> list, int id){
        //Product p = null;
        for(Product product : list){
            if(product.getId() == id){
                return product;
            }
        }
        return null;
    }

    public void deleteProduct(ArrayList<Product> list, Product product){
        if(list.remove(product)){
            System.out.println("Xóa thành công");
        }else {
            System.out.println("Xóa thất bại");
        }
    }

    public void updateAmountProduct(Product product, int newAmount){
        product.setAmount(newAmount);
    }

    public void getProductByAmount(ArrayList<Product> list, int amount){
        for (Product p : list){
            if(p.getAmount() < amount){
                System.out.println(p);
            }
        }
    }

    public void getProductByPrice(ArrayList<Product> list, long minPrice, long maxPrice){
        for (Product p : list){
            if(p.getPrice() > minPrice && p.getPrice() <= maxPrice){
                System.out.println(p);
            }
        }
    }
}
