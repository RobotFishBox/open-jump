package clevermushroom.openjump;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Jumper {
	
	public enum State {
		IDLE, JUMPING, DEAD;
	}
	
	static final float SIZE = 0.5f;		// half a unit
	
	Vector2		position = new Vector2();
	Vector2		velocity = new Vector2();
	Rectangle	  bounds = new Rectangle();
	State		   state = State.IDLE;
	boolean	  facingLeft = true;
	
	public Vector2 getPosition() {
		return position;
	}
	
	public Rectangle getBounds() {
		return bounds;
	}
	
	public Jumper (Vector2 position) {
		this.position = position;
		this.bounds.height = SIZE;
		this.bounds.width = SIZE;
	}

}
