package ModelPackage;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Enemy extends Rectangle
{
	private int hp = 1000; //life of an enemy
	private int speed = 1;
	private boolean isAsteroid = false;
	private boolean isDestroyed = false;
	private BufferedImage image;

	public Enemy(){}

	//sets life of an object
	public void setLife(int hp)
	{
		this.hp = hp;
	}

	//sets speed of an object
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}

	//sets if object is asteroid ( fast moving enemy)
	public void setIfAsteroid(boolean isAsteroid)
	{
		this.isAsteroid = isAsteroid;
	}

	//sets if object has hp below zero and can be removed form scene
	public void setIfIsDestroyed(boolean isDestroyed)
	{
		this.isDestroyed = isDestroyed;
	}

	//gets information if enemy was destroyed and can be removed from scene
	public boolean getIsDestroyed()
	{
		return isDestroyed;
	}

	//gets center of the enemy by global coordinates system, not local center
	public Point getCenter()
	{
		return new Point(this.getLocation().x+this.getBounds().width/2, this.getLocation().y+this.getBounds().height/2);
	}

	//sets image of an object to paint
	public void setImage(BufferedImage image)
	{
		this.image = image;
	}

	//gets image of an object to paint
	public BufferedImage getImage()
	{
		return image;
	}

	//gets speed of an object
	public int getSpeed()
	{
		return speed;
	}

	//gets if object is an asteroid
	public boolean getIfAsteroid()
	{
		return isAsteroid;
	}

	//gets hp of this object
	public int getEnemyLife()
	{
		return hp;
	}
}
