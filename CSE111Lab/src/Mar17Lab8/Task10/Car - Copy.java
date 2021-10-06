package Mar17Lab8.Task10;
public class Car {
    static int count=0;
    int year;
    Car(){
        count++;
    }
    Car(int y){{
        year = y;
        count++;
    }
        
    }
    public static int getObjectCount(){
        return count;
    }
    int getYear(){
        return year;
    }

}
