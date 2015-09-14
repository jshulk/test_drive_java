import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("Hello, ");
        builder.append("World!");

        String greeting = builder.toString();

        System.out.println(greeting);

        Scanner scanner = new Scanner(System.in);
        System.out.print("What's you name");
        String name = scanner.nextLine();
        System.out.println("Hello,  " + name);
    }
}
