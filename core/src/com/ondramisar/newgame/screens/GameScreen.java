package com.ondramisar.newgame.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.ondramisar.newgame.JumpingGame;
import com.ondramisar.newgame.Resources;
import com.ondramisar.newgame.graph.Background;


public class GameScreen extends DefaultScreen {
    SpriteBatch batch;

    public static final int SCREEN_W = 12 * Resources.TILE_SIZE;
    public static final int SCREEN_H = 8 * Resources.TILE_SIZE;

    private Stage gameStage;
    private Background bg;

    public GameScreen(JumpingGame _game) {
        super(_game);
        batch = new SpriteBatch();

        bg = new Background();
        ExtendViewport viewport = new ExtendViewport(SCREEN_W, SCREEN_H);
        gameStage = new Stage(viewport, batch);
    }

    public void update(float delta){
        gameStage.act(delta);

    }

    @Override
    public void render(float delta) {
        update(delta);

        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        bg.draw(gameStage,game.res);
        gameStage.draw();
    }



    @Override
    public void dispose() {
        super.dispose();
        batch.dispose();

    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
        gameStage.getViewport().update(width,height, true);

    }
}
