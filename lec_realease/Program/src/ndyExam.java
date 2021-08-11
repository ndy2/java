import Lec.OOP.v4.Exam;

public class ndyExam extends Exam {

    private int com;

    public int getCom() {
        return com;
    }

    public void setCom(int com) {
        this.com = com;
    }

    public ndyExam(int kor, int eng, int math) {
        super(kor, eng, math);
    }

}
