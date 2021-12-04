package com.artcruz.games;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HealthyActor extends Actor {

	private int hp;
	private Texture healthyImage;
	private Texture damagedImage;
	private Texture deceasedImage;

	public void draw(Batch b) {
		if(hp > 50) 
			b.draw(healthyImage, getX(), getY());
		else if (hp > 0 && hp <= 50)
			b.draw(damagedImage, getX(), getY());
		else
			b.draw(deceasedImage, getX(), getY());
	}

}
