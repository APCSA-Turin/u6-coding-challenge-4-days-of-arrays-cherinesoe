package com.example.project;
import java.util.Random;
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};

    public static String generateElfName(String name){
        if (name.length() >= 1) {
            int rand = (int) (Math.random() * 5);
            return elf_names[rand] + name;  
        } else {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
    }
}