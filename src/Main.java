
public class Main {
    public static void main(String[] args) {
        int time = 10;
        boolean ifDay = time  >= 10 && time <= 20;
        boolean ifGood = false;
        if (ifDay && ifGood){
            System.out.println("иди гуляй пока можешь");
        } else if (!ifDay) {
            System.out.println("иди спать ато не выспишся");
        } else if (!ifGood) {
            System.out.println("иди читай книгу или посмотри телевизор");
        }


    }
}
