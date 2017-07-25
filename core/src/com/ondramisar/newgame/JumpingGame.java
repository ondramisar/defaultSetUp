package com.ondramisar.newgame;

import com.badlogic.gdx.Game;
import com.ondramisar.newgame.screens.GameScreen;

public class JumpingGame extends Game {
	public Resources res;
	
	@Override
	public void create () {
		res = new Resources();
		setScreen(new GameScreen(this));
	}

	
	@Override
	public void dispose () {
		res.dispose();
	}
}
