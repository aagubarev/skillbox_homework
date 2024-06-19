//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int volume = 1200;
        int fillingSpeed = 30;
        int devastationSpeed = 10;
        int currentVolume = 0;
        int countIteration = 0;

        while (true) {
            currentVolume += fillingSpeed - devastationSpeed;
            countIteration++;
            if (currentVolume == volume) break;
        }

        System.out.printf("Для наполенния бассейна потребовалось: " + countIteration + " минут.");
    }
}