package chess

/**
  * Threads that are executed when the AI algorithms are called.
  *
  * - [[chess.runnables.AIRunnable]] - along with [[chess.runnables.AIThread]] makes up the mechanism of the AI that is run during a computer vs computer game
  * - [[chess.runnables.AIThread]] - the thread that is being run during computer vs computer game, uses [[chess.runnables.AIRunnable]]
  * - [[chess.runnables.AIRunnable]] - the thread that makes moves as the computer during a human vs computer game
  */
package object runnables {}