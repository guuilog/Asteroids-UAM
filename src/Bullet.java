
import java.awt.*;
import java.awt.Rectangle;

public class Bullet extends BaseVectorShape {

    //retângulo delimitador
    public Rectangle getBounds() {
        Rectangle r;
        r = new Rectangle((int)getX(), (int) getY(), 1, 1);
        return r;
    }

    Bullet() {
        //netodo construtor. criar a forma da bala
        setShape(new Rectangle(0, 0, 1, 1));
        setAlive(false);
    }
}

