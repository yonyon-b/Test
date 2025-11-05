package com.alma.classesproj.model;

import java.util.ArrayList;

public class ItemCart {
    ArrayList<Item> arr;
    public ItemCart(ArrayList<Item> arr) {
        this.arr = arr;
    }
    public ItemCart() {
    }
    public ArrayList<Item> getArr() {
        return arr;
    }
    public void setArr(ArrayList<Item> arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "ItemCart{" +
                "arr=" + arr +
                '}';
    }
}
