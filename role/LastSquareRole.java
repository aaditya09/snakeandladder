package com.example.demo.lld.SnakesAndLadder.role;

import com.example.demo.lld.SnakesAndLadder.modal.Square;

/**
 * Created by enduser on 12/11/19.
 */
public final class LastSquareRole extends SquareRole {
    public LastSquareRole ( Square s ) {
        super ( s );
    }

    @Override
    public boolean isLastSquare () {
        return true ;
    }

}