import java.util.*;
class Student{
    private int id;
    private String name;
    private String college;
    public Student(int id,String name,String college){
        this.id=id;
        this.name=name;
        this.college=college;
    }
    public void display(){ 
        System.out.println(this.id+" "+this.name+" "+this.college);
    }
}
public class prmtrConstructor{
    public static void main(String[] args) {
        // static int a=100;
        // prmtrConstructor mo=new prmtrConstructor();
        // System.out.println(mo.a);
        // Student obj1=new Student(1,"a","vce");
        // Student obj2=new Student(2,"b","vce");
        // Student obj3=new Student(3,"c","vce");
        // obj1.display();
        // obj2.display();
        // obj3.display();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            char ch;
            if(i==0||i==(n-1)){
                ch='*';
            }
            else{
                ch=' ';
            }
            System.out.print('*');
            for(int j=1;j<n-1;j++){
                System.out.print(" "+ch);
            }
            System.out.print(" "+'*');
            System.out.println();
        }
    }
}
//static varibale is the common variable to all the instances 