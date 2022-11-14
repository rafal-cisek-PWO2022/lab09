package pwo.lab09.factory;

public class Wendesday implements MessageFactoryInterface {
    @Override
    public String createIntroMessage() {
        return "Dzień dobry Środa.";
    }

    @Override
    public String createMainMessage() {
        return "Już połowa tygodnia";
    }

    @Override
    public String createClosingMessage() {
        return "Koniec środy";
    }
}
