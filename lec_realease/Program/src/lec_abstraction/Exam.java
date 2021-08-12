package lec_abstraction;

//추상 클래스 - 공통 자료형
public abstract class  Exam {
    private int kor;
    private int eng;
    private int math;
    
    public Exam()
    {
        this(0,0,0);
    }

    public Exam(int kor,int eng, int math)
    {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public void setKor(int kor){
        this.kor = kor;
    }
    
    public void setEng(int eng){
        this.eng = eng;
    }
    
    public void setMath(int math){
        this.math = math;
    }

    public int getKor(){
        return kor;
    }
    
    public int getEng(){
        return eng;
    }
    
    public int getMath(){
        return math;
    }

    
    //추상 메소드
    //구현 자체는 공통이 아니지만 서비스만 공통임
    
    public abstract int total();

    //자식에게만 공개
    protected int onTotal(){
        return kor+eng+math;
    }

    public abstract float avg();
}