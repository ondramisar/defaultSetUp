package com.ondramisar.newgame.graph;


import com.badlogic.gdx.scenes.scene2d.Stage;
import com.ondramisar.newgame.Resources;

public class Background {
    public Background(){

    }

    public void draw(Stage stage, Resources res){
        stage.getBatch().begin();
        for (int y = 0; y <= stage.getHeight(); y += Resources.TILE_SIZE) {
            for (int x = 0; x <= stage.getWidth(); x += Resources.TILE_SIZE) {

                stage.getBatch().draw(res.ground, x, y,0,0, Resources.TILE_SIZE, Resources.TILE_SIZE, 1.01f, 1.01f,0);
            }
        }
            for (int x = 0; x <= stage.getWidth(); x += Resources.TILE_SIZE) {
                stage.getBatch().draw(res.wall,x,stage.getHeight() - Resources.TILE_SIZE,0,0,Resources.TILE_SIZE,Resources.TILE_SIZE,1.01f,1.01f,0);
            }

        stage.getBatch().end();
    }
}
