public class ParametrosInvalidosException extends Exception {
private String messagemDeErro;

    public ParametrosInvalidosException(String messagemDeErro) {
        this.messagemDeErro = messagemDeErro;
    }

    public String getMessage() {
        return messagemDeErro;
    }
}












   












   
