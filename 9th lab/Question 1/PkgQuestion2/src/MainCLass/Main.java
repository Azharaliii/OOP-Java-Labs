package MainCLass;

import library.books.Fiction;
import library.books.NonFiction;
import library.members.Faculty;
import library.members.Student;

class Main{
    public static void main(String[] args){
        NonFiction n = new NonFiction();
        Fiction    f = new Fiction();
        Student    s = new Student();
        Faculty    Fac= new Faculty();

        System.out.println("Display the Information");
        n.DisplayInfo();
        f.DisplayInfo();
        s.borrowBook();
        s.returnBook();
        Fac.borrowBook();
        Fac.returnBook();
    }
}