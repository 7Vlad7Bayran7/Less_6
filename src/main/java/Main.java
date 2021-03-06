import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Cat cat = new Cat();
        cat.run(150);
        cat.jump(300);

        Cat cat2 = new Cat();
        cat.jump(200);
        cat.swim(300);

        Dog dog1 = new Dog();
        dog1.jump(50);
        dog1.swim(9);

        System.out.println("Всего котов: " + Cat.ccount);
        System.out.println("Всего собак: " + Dog.dcount);

        //не нашел короче способа для конвертации
        Integer i1 = Cat.ccount;
        Integer i2 = Dog.dcount;
        int i3 = i1+i2;
        System.out.println("Всего животных: " + i3 );
    }
}

//1 Создать классы Собака и Кот с наследованием от класса Животное.
//2 Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
// Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//*4 Добавить подсчет созданных котов, собак и животных.