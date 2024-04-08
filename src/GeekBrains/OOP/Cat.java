package GeekBrains.OOP;

public class Cat {

    /*
    * public - в любой точке программе
    * private - поля и методы доступны только в данном классе
    * protected - для наследников от текущего класса
    * default
     */
    private String name;
    private String color;
    private int age;


    public Cat (String name, String color, int age){
         this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() { // для использования(чтения)
        return name;
    }

    public void setName(String name) { // для записи
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void meow(){

        System.out.println(name + " мяукнул");
    }
    /*
    * Можно сделать один публичный метод, который вызывает private метод
     для его вызова в другом классе
    * */



}
