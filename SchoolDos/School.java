package SchoolDos;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class School {
    private Map<Integer,Classroom> classrooms = new HashMap<Integer,Classroom>();

    public School()
    {
        classrooms = new Map<Integer,Classroom>();
    }

    public Map<Integer,Classroom> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(Map<Integer,Classroom> classrooms) {
        this.classrooms = classrooms;
    }

    public boolean removeClass(Classroom c)
    {
        if(classrooms.containsKey(c.getRoom()))
        {
            classrooms.remove(c.getRoom());
            return true;
        }
        else
        {
            return false;
        }
    }

    public void addClass(int room)
    {
        Classroom n = new Classroom(room);
        classrooms.put(room, n);
    }



    //Also I was thinking you may want to find a student in the school, and not just the classroom, so we might not have had the classroom number.
    public Student findStudent(int room, int id)
    {
        Classroom c = classrooms.get(room);
        if(c.getStudents().containsKey(id))
        {
            return c.getStudents().get(id);
        }
    }


    //Takes 2 classrooms, finds student in class a, and put into class b.
    public boolean swapClass(Classroom a, Classroom b, int id)
    {
        Map<Integer, Student> rostera = a.getStudents();
        Map<Integer, Student> rosterb = b.getStudents();

        if(!rostera.containsKey(id))
        {
            return false;
        }
        else
        {
            Student temp = rostera.get(id);
            rostera.remove(id);
            rosterb.put(id, temp);

        }

    }
}
