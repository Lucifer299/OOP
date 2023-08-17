package OOP;

public class Homo {
  public static void main(String[] args) {
    Person Vitaliy = new Person();
    Vitaliy.name = "Витя";
    Vitaliy.age = 20;
    Vitaliy.weight = 75;
    
    Person Nikolay = new Person();
    Nikolay.name = "Коля";
    Nikolay.age = 22;
    Nikolay.weight = 85;

    Person Alex = new Person();
    Alex.name = "Леха";
    Alex.age = 21;
    Alex.weight = 61;
    float averageAge = (Vitaliy.age + Nikolay.age + Alex.age)/ 3;
    float averageWeight = (Vitaliy.weight + Nikolay.weight + Alex.weight)/ 3;
    System.out.println("Средний возраст\n" + averageAge + "\n" + "Средний вес\n" + averageWeight);
  }
}
