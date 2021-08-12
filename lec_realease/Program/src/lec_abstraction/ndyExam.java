package lec_abstraction;

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
    public int total() {
        // int total = onTotal()+com;
        int total = getKor()+getEng()+getMath()+getCom();
        return total;
    }

    @Override
    public float avg() {
        float avg = total()/4.0f;
        return avg;
    }
}
