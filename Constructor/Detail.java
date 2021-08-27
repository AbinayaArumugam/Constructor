package constructor;
public class Detail{
  private int id;
  private String name;
  private String company;
  
  public int setId() {
  return id;
  }
  public void setId(int id) {
  this .id =id;
  }
  public String getName() {
  return name;
  }
  public void setName(String name) {
  this.name=name;
  }
  public String getCompany() {
  return company;
  }
  public void setCompany(String company){
  this.company=company;
  }
  public String toString(){
  return "Employee ID: "+ id + "  Name: "+ name + "  Company: " + company +"\n";
  }
  }
  
  
