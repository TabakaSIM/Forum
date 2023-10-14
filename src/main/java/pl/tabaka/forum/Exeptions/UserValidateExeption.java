package pl.tabaka.forum.Exeptions;

public class UserValidateExeption extends RuntimeException{
    public UserValidateExeption(String errorMessage){
        super(errorMessage);
    }
}
