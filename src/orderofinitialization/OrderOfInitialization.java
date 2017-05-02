
package orderofinitialization;

public class OrderOfInitialization {
                                                        //Rule:1 Super call -> 1:static methods,2:instance and 3:constructors 
    static{                                             //Rule:2 static initializers. or static methods and variables. 
        add(2);                                         //Rule 3: instance variables and methods
    }                                                   //Rule 4: Constructors.
    public static void add(int numb){
        
        System.out.println(numb + "");
    }
    OrderOfInitialization(){
        add(5);
    }
    static{
        add(4);
    }
    {
        add(6);
    }
    static{
       new OrderOfInitialization();        //instantiate a new object.
    }
    {
        add(8);
    }
    
    public static void main(String[] args) {
       
    }
    
}
