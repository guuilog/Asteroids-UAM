
import java.util.Random;

public class Star extends Circle{
	
	
	public Star(){
		super(pos(),size());
	}
	
	// Metodo de tamanho: cria e retorna random tamanho para a Estrela
	public static int size(){
		Random r = new Random();
		int size = r.nextInt(6);
		return size;
	}
	
	// pos: cria e retorna random posições para a Estrela
	
	public static Point pos(){
		Random r = new Random();
		int x = r.nextInt(Asteroids.w);
		int y = r.nextInt(Asteroids.h);
		Point pos = new Point(x,y);
		return pos;
	}
	
	 // Metodo starArray cria e retorna uma array de Estrelas (Quantidade)
	
	public static Star[] starArray(int n){
		Star[] output = new Star[n];
		for(int i = 0; i < n; i++){
			output[i] = new Star();
		}
		return output;
	}

}
