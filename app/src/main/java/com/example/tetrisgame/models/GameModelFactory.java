package com.example.tetrisgame.models;

import com.example.tetrisgame.presenter.GameModel;

public class GameModelFactory {
    private GameModelFactory() {
    }

    public static GameModel newGameModel(GameType gameType) {
        switch (gameType) {
            case TETRIS:
                return new TetrisGameModel();
            default:
                return null;
        }
    }
}
