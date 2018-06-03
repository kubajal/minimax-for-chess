package chess.runnables;

import chess.controller.Controller;
import chess.view.BoardPanel;

public class AIThread extends Thread{

    public AIRunnable airunnable;
    Controller controller;

    public AIThread(AIRunnable aiRunnable) {
        super(aiRunnable);
    }

    void setFlag(Boolean _f){
        airunnable.setRunFlag(_f);
    }
}