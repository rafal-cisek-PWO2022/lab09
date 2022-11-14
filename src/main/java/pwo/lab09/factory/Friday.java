package pwo.lab09.factory;

public class Friday implements MessageFactoryInterface {
    @Override
    public String createIntroMessage() {
        return "Dzień dobry środa";
    }

    @Override
    public String createMainMessage() {
        return "Piątkowa praca idzie powoli";
    }

    @Override
    public String createClosingMessage() {
        return "Piątek weekendu początek";
    }
}
