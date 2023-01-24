public class Main {
    public static void main(String[] args) {
      
      Scanner aAa = new Scanner(System.in);
      System.out.println("What is your first name, did you say?");

      String bBb = aAa.nextLine();
      Animal name = new Animal(bBb);

      name.printInfo();
    }
}
