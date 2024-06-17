package Seção15.ExercicioFixação.model.exceptions;

import java.io.Serial;

public class ExceptionDomain extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;
    public ExceptionDomain(String msg){
        super(msg);
    }
}
