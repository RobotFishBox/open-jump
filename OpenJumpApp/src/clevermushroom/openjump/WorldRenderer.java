package clevermushroom.openjump;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Rectangle;

public class WorldRenderer {
	
	private World world;
	private OrthographicCamera cam;
	
	/** for debug rendering **/
	ShapeRenderer debugRenderer = new ShapeRenderer();
	
	public WorldRenderer(World world) {
		this.world = world;
		this.cam = new OrthographicCamera(10, 7);
		this.cam.position.set(5, 3.5f, 0);
		this.cam.update();
	}
	
	public void render() {
		// render each block
		debugRenderer.setProjectionMatrix(cam.combined);
		debugRenderer.begin(ShapeType.Rectangle);
		for (Block block : world.getBlocks()) {
			Rectangle rect = block.getBounds();
			debugRenderer.setColor(new Color(1, 0, 0, 1));
			debugRenderer.rect(block.getPosition().x + rect.x, 
					block.getPosition().y + rect.y,
					rect.width,
					rect.height);
		}
		
		// render the Jumper
		Jumper jumper = world.getJumper();
		Rectangle rect = jumper.getBounds();
		debugRenderer.setColor(new Color (0, 1, 0, 1));
		debugRenderer.rect(jumper.getPosition().x + rect.x,
				jumper.getPosition().y + rect.y, 
				rect.width,
				rect.height);
		debugRenderer.end();
	}

}
