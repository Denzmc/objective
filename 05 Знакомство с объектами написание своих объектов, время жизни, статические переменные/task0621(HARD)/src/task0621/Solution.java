package task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
Задача: У каждой кошки есть имя и кошка-мама.
Создать класс, который бы описывал данную ситуацию.
Создать два объекта: кошку-дочь и кошку-маму.
Вывести их на экран.

Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
The cat's name is дедушка Вася, no mother, no father
The cat's name is бабушка Мурка, no mother, no father
The cat's name is папа Котофей, no mother, father is дедушка Вася
The cat's name is мама Василиса, mother is бабушка Мурка, no father
The cat's name is сын Мурчик, mother is мама Василиса, father is папа Котофей
The cat's name is дочь Пушинка, mother is мама Василиса, father is папа Котофей


Requirements:
1. Программа должна считывать имена 6 котов в указанном порядке.
2. Метод main должен создавать 6 объектов типа Cat.
3. Программа должна выводить 6 строк с информацией о котах.
4. Строка про дедушку (первая) должна соответствовать условию.
5. Строка про бабушку (вторая) должна соответствовать условию.
6. Строка про папу (третья) должна соответствовать условию.
7. Строка про маму (четвертая) должна соответствовать условию.
8. Строка про сына (пятая) должна соответствовать условию.
9. Строка про дочь (шестая) должна соответствовать условию.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFather = reader.readLine();
        Cat catOldMan = new Cat(grandFather);

        String granny = reader.readLine();
        Cat catGranny = new Cat(granny);

        String dad = reader.readLine();
        Cat daddy = new Cat(dad, null, catOldMan);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGranny, null);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, daddy);

        String sunName = reader.readLine();
        Cat catSun = new Cat(sunName, catMother, daddy);

        System.out.println(catOldMan);
        System.out.println(catGranny);
        System.out.println(daddy);
        System.out.println(catMother);
        System.out.println(catDaughter);
        System.out.println(catSun);
    }

    public static class Cat {
        private String name;
        private Cat mom;
        private Cat dad;

        Cat(String name) {
            this.name = name;
        }

        public Cat(String name, Cat mom, Cat dad) {
            this.name = name;
            this.mom = mom;
            this.dad = dad;
        }


        @Override
        public String toString() {
            if (mom == null && dad == null)
                return "The cat's name is " + name + ", no mother, no father ";
            else if (mom == null && dad != null){
                return "The cat's name is " + name + ", FATHER is " + dad.name+" no mom";
            }
            else if (mom != null && dad == null) {
                return "The cat's name is " + name + ", mother is " + mom.name+" no father";
            }
            return "The cat's name is " + name + ", mother is " + mom.name+" father is "+ dad.name;
        }
    }

}
