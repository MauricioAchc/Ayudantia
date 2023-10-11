package com.company;

public class productList {
    private int quantityProdcuts;
    private int maxProducts;
    private Product[] products;

    public productList(int maxProducts) {
        this.maxProducts = maxProducts;
        products = new Product[maxProducts];
        quantityProdcuts = 0;
    }

    public void add(Product product){
        products[quantityProdcuts] = product;
        quantityProdcuts++;

    }


    public boolean searchByid(int id){
        for(int i = 0; i < quantityProdcuts; i++){
            if(products[i].getId() == id){
                return true;
            }
        }
        return false;
    }

    public Product get(int index){
        return products[index];

    }

    public boolean deleteByid(int id){
        for(int i = 0; i < quantityProdcuts; i++){
            if(products[i].getId() == id){
                products[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean existByName(String name){
        for(int i = 0; i < quantityProdcuts; i++){
            if(products[i].getName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }


}
