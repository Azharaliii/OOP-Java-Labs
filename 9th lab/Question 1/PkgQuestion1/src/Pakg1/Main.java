package Pakg1;
import Friends.*;
import Family.*;
import Myself.*;

class Main{
    public static void main(String[] args){

        Friend obj1= new Friend();
        Family obj2= new Family();
        Myself obj3= new Myself();

        obj1.Bestfriend();
        obj1.Bestfriend2();
        obj2.MethodCall();
        obj2.MethodCall2();
        obj3.MyMethod();
        obj3.MyMethod2();
    }
}