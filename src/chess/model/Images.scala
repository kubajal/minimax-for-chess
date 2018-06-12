package chess.model

import javax.swing.ImageIcon

import scala.collection.immutable.Stack

/**
  * Icons that will be show on the board for each figure.
  */

object Images {

  def getWhitePawnImage = new ImageIcon(getClass.getResource("/chess/images/white_pawn.png"))
  def getWhiteKnightImage = new ImageIcon(getClass.getResource("/chess/images/white_knight.png"))
  def getWhiteBishopImage = new ImageIcon(getClass.getResource("/chess/images/white_bishop.png"))
  def getWhiteRookImage = new ImageIcon(getClass.getResource("/chess/images/white_rook.png"))
  def getWhiteQueenImage = new ImageIcon(getClass.getResource("/chess/images/white_queen.png"))
  def getWhiteKingImage = new ImageIcon(getClass.getResource("/chess/images/white_king.png"))
  def getBlackPawnImage = new ImageIcon(getClass.getResource("/chess/images/black_pawn.png"))
  def getBlackKnightImage = new ImageIcon(getClass.getResource("/chess/images/black_knight.png"))
  def getBlackBishopImage = new ImageIcon(getClass.getResource("/chess/images/black_bishop.png"))
  def getBlackRookImage = new ImageIcon(getClass.getResource("/chess/images/black_rook.png"))
  def getBlackQueenImage = new ImageIcon(getClass.getResource("/chess/images/black_queen.png"))
  def getBlackKingImage = new ImageIcon(getClass.getResource("/chess/images/black_king.png"))
}