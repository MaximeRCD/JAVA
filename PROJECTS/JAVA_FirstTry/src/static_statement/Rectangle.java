package static_statement;

public class Rectangle {
    static int width; // class variable
    int height; //instance variable
    int area(){
        return width*height;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.width = 1;
        r1.height =5;

        Rectangle r2 = new Rectangle();
        r2.width = 2;
        r2.height = 6;

        System . out . println ("r1 = " + r1 . height + " x " + r1 . width ) ;
        System . out . println ("r2 = " + r2 . height + " x " + r2 . width ) ;
        System . out . println (" Rectangle . width = " + Rectangle . width );

    }
}
