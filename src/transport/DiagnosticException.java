package transport;

public class DiagnosticException extends Exception{

    private Drivers driver;
    public DiagnosticException(String message, Drivers driver) {
        super(message);
        this.driver = driver;
    }

    public Drivers getDriver() {
        return driver;
    }

    public void setDriver(Drivers driver) {
        this.driver = driver;
    }
}
