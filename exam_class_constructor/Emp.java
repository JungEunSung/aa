package exam_class_constructor;

public class Emp {
    private String empno; //사번
    private int gi; //기본급
    private double su; //수당
    private double se; //세금
    private double bong; //본봉
    private String grad; //등급

    public Emp() {}

    public Emp(String empno, int gi) {
        this.empno = empno;
        this.gi = gi;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public int getGi() {
        return gi;
    }

    public void setGi(int gi) {
        this.gi = gi;
    }

    public double getSu() {
        su = getGi()*0.15;
        return su;
    }

    public double getSe() {
        se = getGi() *0.2;
        return gi;
    }

    public double getBong() {
        bong = getGi() - getSe() + getSu();
        return bong;
    }

    public String getGrad() {
        if (getBong() > 500000) {
            grad = "관리자";
        }else {
            grad = "영업";
        }
        return grad;
    }

    public String toString() {
        String str = String.format("%4s | %6d  | %8.0f  |  %8.0f  |  %7.0f  |  %5s",
                this.getEmpno(), this.getGi(), this.getSu(), this.getSe(), this.getBong(), this.getGrad());
        return str;
    }
}
