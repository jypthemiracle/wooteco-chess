package chess.model.piece;

import chess.model.Direction;
import chess.model.PlayerType;
import chess.model.Point;

public class Queen extends Piece {
    private static final double QUEEN_SCORE = 9;

    public Queen(PlayerType team, Point point) {
        super(team, point, QUEEN_SCORE);
    }

    @Override
    public boolean canMove(Direction direction, Point destination) {
        return Direction.rookDirection().contains(direction)
                || Direction.bishopDirection().contains(direction);
    }

    @Override
    public String toString() {
        return "queen";
    }
}
