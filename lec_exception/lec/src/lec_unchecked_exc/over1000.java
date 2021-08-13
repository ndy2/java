package lec_unchecked_exc;

public class over1000 extends RuntimeException {
    @Override
    public String getMessage()
    {
        return "결과가 1000보다 큼.";
    }
}
