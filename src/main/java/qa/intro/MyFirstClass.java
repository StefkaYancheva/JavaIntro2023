package qa.intro;

public class MyFirstClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(Sistem.in);

        System.out.println("Please enter your name:");

        String userName = scanner.nextLine();

        System.out.println("Nice to meet you, "+ userName + "!");

        System.out.println("What is your hobby?");

        String userHobby = Scanner.nextLine();

    }
}
