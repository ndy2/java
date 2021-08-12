package lec_factory_and_event_method;

public class ndyExam extends Exam {

    private int com;

    public int getCom() {
        return com;
    }

    public void setCom(int com) {
        this.com = com;
    }

    public ndyExam() {
        this(0,0,0,0);
    }    

    public ndyExam(int kor, int eng, int math, int com) {
        super(kor, eng, math);
        setCom(com);
    }

    @Override
    public int total()
    {
        return super.total()+getCom();
    }

    @Override
    public float avg()
    {
        return total()/4.0f;
    }

}
