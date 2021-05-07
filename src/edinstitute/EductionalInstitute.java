
package edinstitute;

public class EductionalInstitute{
    
   private String name;
   
   Student stu;
   Instructor ins;
   Administrator adm;
   
   public EductionalInstitute(Student stu,Instructor ins,Administrator adm){
       
       this.stu = stu;
       this.ins = ins;
       this.adm = adm;
   
   }
   
   public String getName(){
       
       return name;
   
   }
   
   public void setName(String n){
       
       name = n;
   
   }

}


