
package edinstitute;


public class Student {
    
   private String name;
    private int id;
    
    public Student() {
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public float getGrade(Subject sub){
        
        return sub.getGrade();
       
    }
    
}
