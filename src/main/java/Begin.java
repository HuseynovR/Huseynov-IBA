import java.util.Scanner;

public class Begin {
    public static void main(String[] args) {
        System.out.print("Hello from Java");
        System.out.println("Hello,what is your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello." +name);
        System.out.println("Nice to meet you."+name);
        System.out.println("Bye");

        System.out.println("How old are you?");
        int age;
        age=sc.nextInt();
        if(age<18)
            System.out.println("Lets go to sinema");
        else System.out.println("Lets go to night club");

    }
}