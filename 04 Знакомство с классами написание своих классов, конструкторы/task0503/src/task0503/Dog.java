package task0503;


/* 
Геттеры и сеттеры для класса Dog
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создай геттеры и сеттеры для всех переменных класса Dog.


Requirements:
1. Программа не должна считывать данные с клавиатуры.
2. У класса Dog должна быть переменная name с типом String.
3. У класса Dog должна быть переменная age с типом int.
4. У класса должен быть сеттер для переменной name.
5. У класса должен быть геттер для переменной name.
6. У класса должен быть сеттер для переменной age.
7. У класса должен быть геттер для переменной age.*/

public class Dog {
    private String name;
    private int age;

    public static void main(String[] args) {
        
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
