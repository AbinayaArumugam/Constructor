package constructor;
import java.util.Scanner;
import java.util.*;;
public class ConstructorRunner{

static Scanner input = new Scanner(System.in);
 
public int getIntegerInput(){
int integer;
try {
integer = input.nextInt();
} catch (InputMismatchException e) {
System.out.println("Invalid Input.Enter the Valid Input");
input.nextInt();
integer =getIntegerInput();
}
return integer;
}

public String getStringInput(){
String str = input.next();
return str;
}

public String[] getStringArray(int numberOfString){
String[] strArr = new String[numberOfString];
for(int i=0;i<numberOfString;i++) {
strArr[i]=input.next();
}
return strArr;
}

public List<String> createStringArrayList(String[] strArr){
List<String> array = new ArrayList<String>();
for(int i=0;i<strArr.length;i++){
array.add(strArr[i]);
}
return array;
}

public List<String> createStrArrayList() {
ConstructorRunner obj = new ConstructorRunner();
System.out.println("Enter the number of Strings: ");
int numberOfString=obj.getIntegerInput();
System.out.println("Enter the Strings: ");
String[] strArr = obj.getStringArray(numberOfString);
List<String> array=createStringArrayList(strArr);
return array;
}

 public List<Detail> getDetail(){
 ConstructorRunner obj = new ConstructorRunner();
  List<Detail> list =new ArrayList<>();
  System.out.println("Enter the number of detail you want to enter: ");
  int number = obj. getIntegerInput();
  for(int i=0;i<number;i++){
   System.out.println("Enter the Employee ID: "); 
   Integer id =obj. getIntegerInput();
   System.out.println("Enter the Name: ");
   String name= obj.getStringInput();
   System.out.println("Enter the Company: ");
   String company=obj.getStringInput();
  Detail del = new Detail();
   del.setId(id);
   del.setName(name);
   del.setCompany(company);
   list.add(del);
   }
   return list;
   }


public static void main(String[] args) {
System.out.println("Enter the Question No: ");
ConstructorRunner obj = new ConstructorRunner();
int questionNo=obj.getIntegerInput();
switch(questionNo) {
case 1:
 ConstructorProgram construct1 = new ConstructorProgram();
 break;
 case 2:
 System.out.println("Enter the String");
String str2 = obj.getStringInput();
 ConstructorProgram construct2 = new ConstructorProgram(str2 );
 break;
 case 3:
 System.out.println("Enter the Integer");
int integer = obj.getIntegerInput();
 ConstructorProgram construct3 = new ConstructorProgram(integer );
 break;
 case 4:
 System.out.println("Enter the ArrayList");
 List<String> arrayList=obj.createStrArrayList();
 ConstructorProgram construct4 = new ConstructorProgram(arrayList );
 break;
 case 5:
 List<Detail> detail = obj.getDetail();
 ConstructorProgram construct5 = new ConstructorProgram(detail);
 break;
 case 6:
 System.out.println("Enter the Name");
 String name6 = obj.getStringInput();
 System.out.println("Enter the ID");
 int id6=obj.getIntegerInput();
 List<String> list6=obj.createStrArrayList();
 List<Detail> customList6=obj.getDetail();
 AnotherExample example6 = new AnotherExample(id6,name6,list6,customList6);
 System.out.println(example6);
 break;
 case 7:
 System.out.println("Enter the Name");
 String name7 = obj.getStringInput();
 System.out.println("Enter the ID");
 int id7=obj.getIntegerInput();
 List<String> list7=obj.createStrArrayList();
 List<Detail> customList7=obj.getDetail();
 AnotherExample example7 = new AnotherExample(id7,name7,list7,customList7);
 example7.setName(name7);
 example7.setId(id7);
 example7.setList(list7);
 example7.setCustomList(customList7);
  System.out.println(example7);
 break;
 case 8:
 CheckClass construct8 = CheckClass.getObject();
 break;
 case 9:
 //there is no static Constructor in java.
 break;
 case 10:
// Example construct10= new  Example();//Example is abstract; cannot be instantiated, but can be subclassed.
 break;
 default:
 System.out.println("Invalid");
 break;
 }
 } 
 public static void closeScanner() {
input.close();
} 
 }
