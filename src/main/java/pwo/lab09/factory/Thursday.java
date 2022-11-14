package pwo.lab09.factory;

public class Thursday implements MessageFactoryInterface {
    @Override
    public String createIntroMessage() {
        return "Dzień dobry czwartek.";
    }

    @Override
    public String createMainMessage() {
        return "Praca w czwartek przed weekendem.";
    }

    @Override
    public String createClosingMessage() {
        return "Minął czwartek";
    }
}
