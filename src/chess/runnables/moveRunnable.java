package chess.runnables;

import chess.controller.Controller;

public class moveRunnable implements Runnable {
    private Controller c;
    public moveRunnable(Controller _c){
        c = _c;
    }

    @Override
    public void run() {
        c.getBoardPanel().getAIButton().setEnabled(false);
        c.makeComputerMove();
        c.getBoardPanel().getAIButton().setEnabled(true);
    }
}
