package pwo.lab09.factory;

public class Sunday implements MessageFactoryInterface {
    @Override
    public String createIntroMessage() {
        return "Dzień dobry Niedziela.";
    }

    @Override
    public String createMainMessage() {
        return "Ostatni dzień weekendu :(";
    }

    @Override
    public String createClosingMessage() {
        return "Minęła niedziela. Koniec tygodnia";
    }
}
