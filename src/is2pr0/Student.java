package is2pr0;

import java.util.Date;

public class Student {

    private String name;
    private Date birthDate;
    private static long MILISECSTOYEAR=31536000000l;
    
    public Date getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public long getAge() {
    Date CurrentDate=new Date();
    long temp;
    
        temp=(CurrentDate.getTime()-this.birthDate.getTime())/MILISECSTOYEAR;   
      
        return (temp);
    }
           
}
