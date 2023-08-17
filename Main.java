package OOP;

public class Main {
  public static void main(String[] args) {
     Box myBox = new Box();
     Box myBox2 = new Box();
     Box myBox3 = new Box();
     myBox.length = 25;
     myBox.height = 10.2;
     myBox.width = 11.3;
     myBox2.length = 15;
     myBox2.height = 16.2;
     myBox2.width = 71.3;
     myBox3.length = 66;
     myBox3.height = 88.2;
     myBox3.width = 10.3;
     double volume = myBox.height * myBox.width * myBox.height;
     double volume2 = myBox2.height * myBox2.width * myBox2.height;
     double volume3 = myBox3.height * myBox3.width * myBox3.height;
     System.out.println("объем коробок 1, 2, 3 \n" + volume + "\n" + volume2 + "\n" + volume3);
  }
}
