package lec_try_catch;

public class over1000 extends Exception {
    @Override
    public String getMessage()
    {
        return "결과가 1000보다 큼.";
    }
}
