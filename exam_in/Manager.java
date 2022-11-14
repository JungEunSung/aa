package exam_in;

public class Manager extends Person  {
    private int bonus;
    public  String job;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setMgrDate(String name, String address, String phoneNumber, int salary, String job, int bonus) {
        setEmpData(name, address, phoneNumber, salary);
        this.job = job;
        this.bonus = bonus;
    }

    public String toString() {
        String data = ", job = " + job + ", bonus" + bonus;
        return super.toString() + data;
    }
}
