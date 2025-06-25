class Student{
  private String id;
  private String name;

  public Student(String id,String name){
    this.id = id;
    this.name = name;
  }

  public Student(){
    this.id = "000";
    this.name = "";
  }

  public void PrintStudent(){
    System.out.print("ID : "+this.id+" Name : "+this.name);
  }

  public void setId(String id){
    this.id = id;
  }
  
  public void setName(String name){
    this.name = name;
  }

  public String getId(){
    return this.id;
  }

  public String getName(){
    return this.name;
  }

};




