package org.example;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

// questa e una singelton l'ho presa da https://www.baeldung.com/java-singleton
//con un po di modifike
    public final class WareHouse {

        private static WareHouse INSTANCE;

        List<Product> productList = new ArrayList<>();

        private WareHouse() {
            //query if db
            this.productList.add(new Product(1, "orange", 0.5));
            this.productList.add(new Product(2, "Apple", 0.5));
            this.productList.add(new Product(3, "Strawberry", 0.5));
        }

        public static WareHouse getInstance() {
            if (INSTANCE == null) {
                INSTANCE = new org.example.WareHouse();
            }

            return INSTANCE;
        }

        void add(Product product) {
            productList.add(product);
        }

        void remove(Product product) {
            productList.remove(product);
        }

        int nProduct() {
            return productList.size();
        }
//questo metodo premde productlist e la trasforma in un jsonformat
        String toJSon() {
            Gson gson = new Gson();
            String jsonStr = gson.toJson(productList);
            return jsonStr;
        }

        double sum (){
            double soma= 0 ;
            for(Product p :productList){
                soma=soma+p.cost;
            }
            return soma;
        }

    }

