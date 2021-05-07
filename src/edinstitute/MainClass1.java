
package edinstitute;

public class MainClass1 {

    public static void main(String[] args) {
        
        Subject sub1=new Subject("math", 86.5f);
        
        Student st1 = new Student();
        st1.setName("ahmed");
        st1.setId(12);
        
        Instructor ins1 = new Instructor();
        ins1.setName("youssef");
        
        Administrator ad1 = new Administrator();
        
        EductionalInstitute ed1 = new EductionalInstitute(st1, ins1, ad1);

        System.out.println("The student name is " + st1.getName() + " and his grade is : " + st1.getGrade(sub1));
        
        System.out.println("The subject that taughut by instructor " + ins1.getName()+ " is : "+ ins1.getInfo(sub1));

            }
    
}
