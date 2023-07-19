package chapter6;
/*
OBJECTS are structures which contain data in the form of fields and methods (these are class components) which afterwards can be utilized in other classes.

Classes should practice ENCAPSULATION = when you create a class that's going to represent an object,
then your fields should be private. So that the class itself determines how the data is going to be
set and accessed (but it doesn't need to contain the data).
Encapsulation says to make your fields private and make your methods that are used to access those fields public.

First way to SET VALUES for an object is GETTER and SETTER methods
(which then will or will not be accessed by other classes by access modifier ('public' for all other classes of other packages to access,
'protected' for only this package's classes (=no access mod at all))).

Second way is CONSTRUCTOR. All objects have a constructor (default one (doesn't have params) and other constructors).
Constructors are used to initialize an object or set up it's state in some way.
All constr-s must have same name as class, what differs is the params they accept.
 */
public class Rectangle { //This blueprint is meant to be a generalized shell that we can then later on, in other classes, make more specific.

    private double length; //these are GLOBAL variables
    private double width; //No other code outside of this class can access 'private' data.
    // That's what the getters, setters, and constructors are for - to allow this class itself to determine how these fields get set and how they are accessed.

    public Rectangle(){ //this is a default constructor.
        //Default constructor's name should be exact same as class name! List of params is optional.
        //Default constructor is used to assign DEFAULT values to the fields.
        //Here we don't use 'this.' method because this constructor doesn't have variable in scope
        // (in parentheses) calling those variables, so it's clear that we're talking about
        // 'length' and 'width' from class body.
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){ //This time we can say, go ahead and pass us a length and pass us a width, and we'll set those values for you.
        this.length = length; //can be set this way
        setWidth(width); //or can be set this way. these are only different here to demo alternative options.
    }

    double getLength(){ //this is a GETTER method
        return length;
    }

    public void setLength(double length){ //this is a SETTER method.
        // It doesn't pass any value, so it's void type.
        //'public' means other classes from other PACKAGES can call these methods.
        //remember: the '(double length)' variable is not the same as 'length' declared in class body.
        this.length = length; //'this' keyword refers to this class, it says to take 'length' from class body
        // and store it in this class' version of 'length'
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width; //again, it means that this classes version of width (this.width) should be equal to
        // 'width' that was just passed to us.
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }
}