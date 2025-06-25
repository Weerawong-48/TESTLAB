class Teacher{
  private String id;
  private String name;

  public Teacher(String id,String name){
    this.id = id;
    this.name = name;
  }

  public Teacher(){
    this.id = "000";
    this.name = "";
  }

  public void PrintTeacher(){
    System.out.println("ID : "+this.id+" Name : "+this.name);
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
