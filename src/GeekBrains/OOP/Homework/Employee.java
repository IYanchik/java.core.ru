package GeekBrains.OOP.Homework;

/*
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в
консоль.
4. Создать массив из 5 сотрудников.
5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */
public class Employee {
    public String name;
    public String position;
    public String email;
    public byte numberPhone;
    public int salary;
    public byte age;

    public Employee(String name, String position, String email, byte numberPhone, int salary, byte age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.age = age;

    }

    public void String(){
    System.out.print("Имя сотрудника: " + name + "должность: " + position + "дрес эл.почты: " + email + " ");
    System.out.println("номер телефона" + numberPhone + "зарплата" + salary + "возраст" + age);
    }


}
