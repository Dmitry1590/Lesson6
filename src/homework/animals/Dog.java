package homework.animals;

public class Dog extends Animal {

    //используем наследование с помощью слова "extends"
    //теперь поля переменных можно убрать и метод jump которые есть в классе Animal

    //private String name;
    //private String color;
   //private int age;

    //создаем конструктор

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }
    //создаем метод (любой)
  //  public void jump(){
   //     System.out.println(name+ " jump!");
  //  };

    //переопределяем метод voice()
    //используем метод @Override через Alt+Insert


    @Override
    public void voice() {
        System.out.println(name+": gav!");
    }
}
