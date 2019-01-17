

import java.awt.Polygon;
import java.awt.Rectangle;


public class Ship extends BaseVectorShape {
    //define o poligono da nave 
    private int[] shipx = { -8, -5, 0 , 5, 8, 0 };
    private int[] shipy = { 8, 9, 9, 9, 8, -9 };

        
        
        
        
        
        
    //retângulo delimitador
    public Rectangle getBounds() {
        Rectangle r;
        r = new Rectangle((int)getX() - 6, (int) getY() - 6, 12,12);
        return r;
    }
    //Metodo contrutor da nave
    Ship() {
        setShape(new Polygon(shipx, shipy, shipx.length));
        setAlive(true);
    }
}

