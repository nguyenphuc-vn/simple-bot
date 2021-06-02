import java.util.Scanner;

public class ChatBotApp {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Bot bot = new Bot("John",1993);
        System.out.println("Hello! My name is "+ bot.getBotName()
                +"\nI was created in "+bot.getBirthYear());
        System.out.println("Please, remind me your name.");
        String name = input.nextLine();
        User user = new User(name);
        System.out.println("What a great name you have, "+ user.getName()+"!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int re3 = input.nextInt();
        int re5 = input.nextInt();
        int re7 = input.nextInt();
        int age = (re3 * 70 + re5 * 21 + re7 * 15) % 105 ;
        user.setAge(age);
        System.out.println("Your age is "+ user.getAge()+"; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int userNumber = input.nextInt();
        bot.countNumber(userNumber);
        System.out.println("Let's test your programming knowledge.");
        bot.displayTest();
        bot.testKnowledge(input.nextInt(),input);
        System.out.println("Congratulations, have a nice day!");
    }
}
