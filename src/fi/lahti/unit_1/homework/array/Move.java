package fi.lahti.unit_1.homework.array;

import fi.lahti.unit_1.homework.array.IMove;

import java.util.ArrayList;

public class Move implements IMove<ArrayList> {


    @Override
    public ArrayList myMove(int[] str) {
        int a= str[0];
        int b= str[1];
        ArrayList d = new ArrayList();
        d.add(b);
        d.add(a);
        return d;
    }
}
