package com.ondramisar.newgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;


public class Resources {

    TextureAtlas gameSprites;
    public static final int TILE_SIZE = 70;

    public TextureRegion ground;
    public TextureRegion wall;

    public Resources(){
        gameSprites = new TextureAtlas(Gdx.files.internal("packed/game.atlas"));
        ground = gameSprites.findRegion("grassCenter");
        wall = gameSprites.findRegion("grassMid");
    }

    public void dispose(){
        gameSprites.dispose();
    }
}
