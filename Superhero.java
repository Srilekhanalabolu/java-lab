class Superhero{
         String sname,spower,behaviour;
         int age;
         Superhero(String name,String pwr,String bhvr,int ag){
                this.sname=name;
                this.spower=pwr;
                this.behaviour=bhvr;
                this.age=ag;
 }

void display(){
          System.out.println("your hero is");
          System.out.println("hero name:"+sname);
          System.out.println("super power is:"+spower);
          System.out .println("behaviour is:"+behaviour);
          System.out.println("age is:"+age);
  }
}
     