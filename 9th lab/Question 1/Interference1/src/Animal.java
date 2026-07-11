public interface Animal {
    int legs=0;
    String eat=null;
}
class Spider implements Animal{
    public int legs(){
        return  6;
    }
    public String eat(){
        return  "Insects";
    }
}

class CaterPillar implements Animal{
    public int legs(){
        return  8;
    }
    public String eat(){
        return  "Green Leaves And Insects";
    }
}
class Cat implements Animal{
    public int legs(){
        return  4;
    }
    public String eat(){
        return  "Rats And Drinking Milk";
    }
}