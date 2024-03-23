public class student1{
     public static void main(String[] args){
         student s=new student("james","1232");
            factorial.main(null);
            s.display();
    }
}
class student{
  String nm,rn;
  student(String name,String rno){
        nm=name;
        rn=rno;
      }
public void display(){
        System.out.printf("welcome %s roll no is %s \n",nm,rn);  
   }
}