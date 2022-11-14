package pwo.lab09.factory;

public class Saturday implements MessageFactoryInterface {
    @Override
    public String createIntroMessage() {
        return "Dzień dobry Sobota.";
    }

    @Override
    public String createMainMessage() {
        return "W sobotę nie pracuję";
    }

    @Override
    public String createClosingMessage() {
        return "Minęła sobota";
    }
}
