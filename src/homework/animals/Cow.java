package homework.animals;

import homework.animals.Animal;

public class Cow extends Animal {
    //что если нам захочется унаследоваться от класса Animal  новым классом Cow, который находится вне пакета
// пробуем создать контруктор Cow
    public Cow(String name, String color, int age) {
        super(name, color, age);
    }
// возникла проблема с досупом к полям переменным
    //как дать доступ наследникам вне пакета??
    //вводим новый идентификатор "protected" в классе родительском Animal
    // теперь можем перенести класс Cow в пакет animals

    //переопределяем метод voice()
    //используем метод @Override через Alt+Insert


    @Override
    public void voice() {
        System.out.println(name+": Muu!");
    }
}
