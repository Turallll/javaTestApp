package enumTest;

public enum EnumTest {

    alma("quba almasi"),
    armud("Terter armudu"),
    nar("Goycay nari");
   // Tural(1000);

    String s;
    Integer salary;

    EnumTest(String str) {
        this.s = str;
      //  this.salary = salary;
    }

    public String getS() {
        return s;
    }
    public Integer getSalary(){
        return salary;
    }
}
