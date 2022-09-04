/*Refer to Pass_parameter.java file. */
public class Volume {

    int l;  		// length of the object
    int b;  	// breadth of the object
    int h;  	// height of the object
    int r;  	// radius of the circle/object
    float vol;  // voulume of object

    void volOfCuboid(int length, int breadth, int height){
        vol = length*breadth*height;
    }
    void volOfCube(int length){
        vol = length*length*length;
    }
    void volOfCylinder(int radius, int height){
        final float PI = (float) 3.14;
        vol =(PI*(radius*radius)*height);
    }
    
    Volume(int length, int breadth, int height){
        l = length;
        b = breadth;
        h = height;
        this.volOfCuboid(length, breadth, height);
    }
    Volume(int length){
        l = length;
        this.volOfCube(length);
    }
    Volume(int radius, int height){
        r = radius;
        h = height;
        this.volOfCylinder(radius, height);
    }

    void displayvolofcuboid(){
        System.out.print("Volume of cuboid is "+vol+"\n");
    }
    void displayvolofcube(){
        System.out.print("Volume of cube is "+vol+"\n");
    }
    void displayvolofcylinder(){
        System.out.print("Volume of cylinder is "+vol+"\n");

    }   
}
