package com.artcruz.games;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class TexturedActor extends Actor {
	
	private Texture image;
	
	public void draw(Batch b) {
		b.draw(getTexture(), getX(), getY());
	}
	
	public Texture getTexture() {
		return image;
	}
	
	public void setTexture(Texture texture) {
		image = texture;
	}
}
