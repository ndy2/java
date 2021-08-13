package lec_unchecked_exc;

public class under0 extends RuntimeException{
    @Override
    public String getMessage()
    {
        return "결과가 0보다 작음.";
    }
}
