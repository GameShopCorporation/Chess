package com.gameshopllc.chess;
import com.jme3.app.SimpleApplication;
import com.jme3.app.state.VideoRecorderAppState;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.Node;
import com.jme3.scene.VertexBuffer.Type;
import com.jme3.scene.shape.Box;
import com.jme3.system.AppSettings;
import com.jme3.util.BufferUtils;

import java.io.File;

/**
 * @author lyndenjayevans
 */
public class AppMain extends SimpleApplication {

    ChessTileBase chessTileBase;
    @Override
    public void simpleInitApp() {
        settings.setSamples(32);
        settings.setFrameRate(120);
        chessTileBase = new ChessTileBase(this);



    }


    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code

       chessTileBase.updateRender();
    }
}