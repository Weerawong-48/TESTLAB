public class test {
  public static void main(String[] args) {
   Student aaa = new Student("001","Thane");
    aaa.PrintStudent();
    System.out.println(aaa.getId());
    Teacher bbb = new Teacher("003", "Komsan");
      bbb.PrintTeacher();
      System.out.println(bbb.getId());
  }
}