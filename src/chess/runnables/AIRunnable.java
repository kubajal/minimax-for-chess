package chess.runnables;

import chess.controller.Controller;

public class AIRunnable implements Runnable {

    public Boolean flag = true;
    public Controller c;

    public AIRunnable(Controller _c){
        c = _c;
    }

    public void setRunFlag(Boolean _f){
        flag = _f;
    }

    @Override
    public void run() {
        while(true) {
            if(flag == true)
                c.computerVsComputer();
            if(flag == true)
                c.getBoardPanel().repaintFigures();
            if(flag == false)
                break;
        }
        c.getBoardPanel().getAIButton().setEnabled(true);
        c.getBoardPanel().getAIButton().setBackground(null);
        c.getBoardPanel().enableFigures();

    }
}
