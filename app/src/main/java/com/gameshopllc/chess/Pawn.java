package com.gameshopllc.chess;

import com.jme3.app.SimpleApplication;
import com.jme3.input.controls.ActionListener;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;

import java.util.Vector;

public class Pawn extends ChessTileBase {
    public Pawn(SimpleApplication app, ColorRGBA color, Vector3f coordinate) {
        super(app, color, coordinate);

        poly.geo.setLocalTranslation(0,coordinate.y,0);

        this.vertices.clear();

        vertices.add(new Vector3f(0,0,0));
        vertices.add(new Vector3f(8,0,0));
        vertices.add(new Vector3f(0,2,0));
        vertices.add(new Vector3f(8,2,0));

        vertices.add(new Vector3f(0,0,-8));
        vertices.add(new Vector3f(0,0,0));
        vertices.add(new Vector3f(0,2,-8));
        vertices.add(new Vector3f(0,2,0));

        vertices.add(new Vector3f(8,0,-8));
        vertices.add(new Vector3f(8,0,0));
        vertices.add(new Vector3f(8,2,-8));
        vertices.add(new Vector3f(8,2,0));

        vertices.add(new Vector3f(0,0,-8));
        vertices.add(new Vector3f(8,0,-8));
        vertices.add(new Vector3f(0,2,-8));
        vertices.add(new Vector3f(8,2,-8));

        //Top And Bottom
        vertices.add(new Vector3f(8,2,0));
        vertices.add(new Vector3f(8,2,-8));

        vertices.add(new Vector3f(0,2,0));
        vertices.add(new Vector3f(0,2,-8));

        vertices.add(new Vector3f(8,0,0));
        vertices.add(new Vector3f(8,0,-8));

        vertices.add(new Vector3f(0,0,0));
        vertices.add(new Vector3f(0,0,-8));

        indexes.add(2);
        indexes.add(0);
        indexes.add(1);
        indexes.add(1);
        indexes.add(3);
        indexes.add(2);

        indexes.add(2 + 4);
        indexes.add(0 + 4);
        indexes.add(1 + 4);
        indexes.add(1 + 4);
        indexes.add(3 + 4);
        indexes.add(2 + 4);

        indexes.add(2 + 8);
        indexes.add(0 + 8);
        indexes.add(1 + 8);
        indexes.add(1 + 8);
        indexes.add(3 + 8);
        indexes.add(2 + 8);

        indexes.add(2 + 12);
        indexes.add(0 + 12);
        indexes.add(1 + 12);
        indexes.add(1 + 12);
        indexes.add(3 + 12);
        indexes.add(2 + 12);

        indexes.add(2 + 16);
        indexes.add(0 + 16);
        indexes.add(1 + 16);
        indexes.add(1 + 16);
        indexes.add(3 + 16);
        indexes.add(2 + 16);

        indexes.add(2 + 20);
        indexes.add(0 + 20);
        indexes.add(1 + 20);
        indexes.add(1 + 20);
        indexes.add(3 + 20);
        indexes.add(2 + 20);

        indexes.add(2 + 24);
        indexes.add(0 + 24);
        indexes.add(1 + 24);
        indexes.add(1 + 24);
        indexes.add(3 + 24);
        indexes.add(2 + 24);

        indexes.add(2 + 28);
        indexes.add(0 + 28);
        indexes.add(1 + 28);
        indexes.add(1 + 28);
        indexes.add(3 + 28);
        indexes.add(2 + 28);





    }


}
