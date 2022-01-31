package Abstraction;


import java.util.*;
import java.io.*;
import Class.*;
import Interface.*;





public abstract class User{
    protected Food foods[] = new Food[100];
    public abstract void showFoods();
    public abstract void addFood(Food f);
}