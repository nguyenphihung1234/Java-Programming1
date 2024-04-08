package session2;

public class AgeCheckingException extends Exception{
    //Đây là exception do ng dùng tự định nghĩa

    public AgeCheckingException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Loi nhap so tuoi" +super.getMessage();
    }
}
