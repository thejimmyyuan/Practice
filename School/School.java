package School;

import java.util.ArrayList;

public class School {
    private ArrayList<Classroom> classrooms;

    public School()
    {
        classrooms = new ArrayList<Classroom>();
    }

    public ArrayList<Classroom> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(ArrayList<Classroom> classrooms) {
        this.classrooms = classrooms;
    }

    public void removeClass(Classroom c)
    {
        for(int i = 0; i < classrooms.size(); i++)
        {
            if(c.getRoom() == classrooms.get(i).getRoom())
            {
                classrooms.remove(i);
            }
        }
    }

    public void addClass(int room)
    {
        Classroom n = new Classroom(room);
        classrooms.add(n);
    }
    public Student findStudent(Classroom c, Student s)
    {
        ArrayList<Student> students = c.getStudents();
        for(int i = 0; i < students.size(); i++)
        {
            if(s.getName().equals(students.get(i).getName()))
            {
                return students.get(i);
            }
        }
        return null;
    }
    public void swapClass(Classroom a, Classroom b, String name)
    {
        ArrayList<Student> rostera = a.getStudents();
        ArrayList<Student> rosterb = b.getStudents();

        for(int i = 0; i < rostera.size(); i++)
        {
            if(rostera.get(i).getName().equals(name))
            {
                Student temp = rostera.get(i);
                rostera.remove(i);
                rosterb.add(temp);
            }
        }

    }
}
