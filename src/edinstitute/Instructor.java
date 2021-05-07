
package edinstitute;


public class Instructor {
    
    private String name;
    private float officeHour;
    
    public Instructor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(float officeHour) {
        this.officeHour = officeHour;
    }
    
    public String getInfo(Subject sub){
        
        return sub.getName();
    
    
    }

    
    
}
