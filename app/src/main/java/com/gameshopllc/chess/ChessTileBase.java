package com.gameshopllc.chess;

import com.jme3.app.SimpleApplication;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;

import java.util.ArrayList;
import java.util.Vector;

public class ChessTileBase extends CurrencyMesh{


    public ChessTileBase(SimpleApplication app) {
        super(app);


        this.vertices.clear();



//        vertices.add(new Vector3f(0,0,0));

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

        polys.add(new Poly(app, vertices, texCoord, indexes, ColorRGBA.fromRGBA255(0, 0, 128, 255)));





    }
}
