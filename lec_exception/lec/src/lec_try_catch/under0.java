package lec_try_catch;

public class under0 extends Exception{
    @Override
    public String getMessage()
    {
        return "결과가 0보다 작음.";
    }
}
