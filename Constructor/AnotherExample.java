package constructor;
import java.util.*;
public class AnotherExample{
int id;
String name;
List<String> list = new ArrayList<>();
List<Detail> customList = new ArrayList<>();
public AnotherExample() {
}
public AnotherExample(int id,String name,List<String> list, List<Detail> customList){
setId(id);
setName(name);
setList(list);
setCustomList(customList);
}
public String getName(){
return name;
}
public void setName(String name){
this.name=name;
}
public int getId(){
return id;
}
public void setId(int id){
this.id=id;
}
public List<String> getList(){
return list;
}
public void setList(List<String> list){
this.list=list;
}
public List<Detail> getcustomList(){
return customList;
}
public void setCustomList(List<Detail> customList){
this.customList=customList;
}
public String toString(){
return "Id: "+ id +"   Name: "+ name +"  ArrayList: "+ list+"  CustomList: "+ customList + "\n";
}
}
