import java.util.Scanner;

public class Bot {
    private String botName;
    private int birthYear;

    public Bot(String botName, int birthYear) {
        this.botName = botName;
        this.birthYear = birthYear;
    }

    public void countNumber(int num){
        for(int i=0; i<=num;i++){
            System.out.println(i+"!");
        }
    }
    public void displayTest(){
        System.out.println(
                "Why do we use methods?\n" +
                        "1. To repeat a statement multiple times.\n" +
                        "2. To decompose a program into several small subroutines.\n" +
                        "3. To determine the execution time of a program.\n" +
                        "4. To interrupt the execution of a program.");
    }
    public void testKnowledge(int num, Scanner scanner){

        while(true){
            if(num ==2) {
                break;
            }
            System.out.println("Please, try again.");
            num = scanner.nextInt();

        }
    }
    @Override
    public String toString() {
        return "Bot{" +
                "botName='" + botName + '\'' +
                ", birthYear='" + birthYear + '\'' +
                '}';
    }

    public String getBotName() {
        return botName;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
