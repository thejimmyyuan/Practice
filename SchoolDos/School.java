package SchoolDos;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class School {
    private Map<Integer,Classroom> classrooms;

    public School()
    {
        classrooms = new HashMap<Integer,Classroom>();
    }

    public Map<Integer,Classroom> getClassrooms() {
        return classrooms;
    }

    public List<Classroom> getClassroomList()
    {
        List<Classroom> temp = new ArrayList<Classroom>();
        for(Map.Entry<Integer, Classroom> entry: classrooms.entrySet())
        {
            temp.add(entry.getValue());
        }
        return temp;
    }

//    public void setClassrooms(Map<Integer,Classroom> classrooms) {
//        this.classrooms = classrooms;
//    }

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

    public boolean removeClass(int room)
    {
        if(classrooms.containsKey(room))
        {
            classrooms.remove(room);
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
        else
        {
            return null;
        }
    }

    public Student findStudentWithID(int id)
    {
        for(Map.Entry<Integer, Classroom> entry : classrooms.entrySet())
        {
            if(entry.getValue().getStudents().containsKey(id))
            {
                return entry.getValue().getStudents().get(id);
            }
        }
        return null;
    }

    public Classroom findStudentClassroom(int id)
    {
        for(Map.Entry<Integer, Classroom> entry : classrooms.entrySet())
        {
            if(entry.getValue().getStudents().containsKey(id))
            {
                return entry.getValue();
            }
        }
        return null;
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
            return true;
        }

    }

    public boolean swapClass(int id, Classroom a)
    {
        Student temp = findStudentWithID(id);
        Classroom pointer = findStudentClassroom(id);

        if(temp != null)
        {
            pointer.removeStudent(temp);
            a.getStudents().put(temp.getId(), temp);
            return true;
        }
        else
        {
            return false;
        }
    }
}
