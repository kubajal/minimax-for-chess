package chess
/**
  *  Logic of the game. Bootstrap the whole application, manipulate the state of the board: make a move, update the model of the board,
  *  handle checkmates and stalemates, run AI with the a given evaluation function.
  *  - [[chess.controller.Controller]] - core logic of the game,
  *  - [[chess.controller.Algorithm]] - minimax algorithm with alpha-beta pruning,
  *  - [[chess.controller.Evaluator]] - evaluation function, that calculates how good the position of a given player is. Used by [[chess.controller.Algorithm]].
  *  - [[chess.controller.InternalState]] - state of the board: white figures + black figures,
  *  - [[chess.controller.Main]] - bootstraps the application.
  */
package object controller {}