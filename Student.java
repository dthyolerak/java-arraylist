// import java.util.ArrayList;

/**
 * Student
 */

public class Student {

    private String name;
    private String program;
    private int currentYear;
    private String id;
    public int length;
    public Student() {
    }

    public Student(String name, String program, int currentYear, String id) {
        this.name = name;
        this.program = program;
        this.currentYear = currentYear;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return this.program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getCurrentYear() {
        return this.currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Student name(String name) {
        setName(name);
        return this;
    }

    public Student program(String program) {
        setProgram(program);
        return this;
    }

    public Student currentYear(int currentYear) {
        setCurrentYear(currentYear);
        return this;
    }

    public Student id(String id) {
        setId(id);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", program='" + getProgram() + "'" +
            ", currentYear='" + getCurrentYear() + "'" +
            ", id='" + getId() + "'" +
            "}";
    }


}