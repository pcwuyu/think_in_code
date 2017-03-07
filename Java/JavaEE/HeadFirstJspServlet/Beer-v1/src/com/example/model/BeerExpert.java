package com.example.model;

import java.util.ArrayList;
import java.util.List;

/**
 * package/file: com.example.model/BeerExpert
 * author: pcwuyu
 * version: 2016/9/26 15:34
 */
public class BeerExpert {
    public List getBrands(String color) {
        List brands = new ArrayList();

        //注意我们是如何利用高级的条件表达式来表达有关啤酒的"复杂"专家知识
        if (color.equals("amber")) {
            brands.add("jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return (brands);
    }
}
