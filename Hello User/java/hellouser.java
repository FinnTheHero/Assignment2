import java.util.Scanner;

public class hellouser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter name: ");
        
        String name = sc.nextLine();

        System.out.println("Hello " + name);
    }
}