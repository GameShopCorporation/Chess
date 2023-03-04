package com.gameshopllc.chess;
import com.jme3.app.SimpleApplication;
import com.jme3.app.state.VideoRecorderAppState;
import com.jme3.input.KeyInput;
import com.jme3.input.MouseInput;
import com.jme3.input.android.AndroidKeyMapping;
import com.jme3.input.controls.ActionListener;
import com.jme3.input.controls.InputListener;
import com.jme3.input.controls.KeyTrigger;
import com.jme3.input.controls.MouseButtonTrigger;
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
import java.util.ArrayList;

/**
 * @author lyndenjayevans
 */
public class AppMain extends SimpleApplication {

    ChessTileBase chessTileBase;
    ArrayList<ChessTileBase> board;

    Pawn pawn;
    /**
     * Release Variable Is For Google Play Release.
     * False When Focusing On One Model.
     * */
    boolean release = true;

    boolean isTrue = true;

    boolean isFalse = false;

    boolean isFloating = true;

    ActionListener actionListener  = new ActionListener(){
        @Override
        public void onAction(String name, boolean keyPressed, float tpf) {
            if (name.equals("W")) {

                isTrue = !isTrue;

            }
            else if (name.equals("D")) {

                isFalse = !isFalse;


            }
            else if (name.equals("F")) {

                isFloating = !isFloating;
            }
            else if (name.equals("G")) {

                //isFalse = !isFalse;
            }
        }
    };



//    InputListener analogListener = new InputListener() {
//        @Override
//        public int hashCode() {
//            return super.hashCode();
//        }
//    };
    @Override
    public void simpleInitApp() {



        settings.setBitsPerPixel(32);
        settings.setSamples(32);
        settings.setFrameRate(120);
        settings.setVSync(true);
        settings.setStencilBits(8);
        settings.setDepthBits(32);
        viewPort.setBackgroundColor(ColorRGBA.White);


        actionListener.onAction("W", true, 0);
        actionListener.onAction("D", true, 0);
        actionListener.onAction("F", true, 0);
        actionListener.onAction("G", true, 0);

        //settings.setFrequency(120);

        inputManager.deleteMapping(AppMain.INPUT_MAPPING_MEMORY);

        initKeys();

        inputManager.addListener(actionListener, "W", "D", "F","G");


        //if (release) {

//            board = new ArrayList<ChessTileBase>();
//
//            for (int i = 0; i < 64; i++){
//
//                board.add(new ChessTileBase(this, ColorRGBA.White));
//            }

        //chessTileBase = new ChessTileBase(this, ColorRGBA.Black);

//            if (isTrue || isTrue) {
//                chessTileBase = new ChessTileBase(this, ColorRGBA.fromRGBA255(100, 84, 0, 100), new Vector3f(0, 0, 0));
//            }if (isTrue || isTrue) {
//                if (isTrue || isTrue) {
//                    pawn = new Pawn(this, ColorRGBA.fromRGBA255(0, 0, 128, 100), new Vector3f(0, 8, 0));
//                }
//
//            }





//        else {
//            chessTileBase = new ChessTileBase(this, ColorRGBA.Black);
//            //chessTileBase
//        }
    }


    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
        //if (release) {
            if (isTrue || isTrue) {
                chessTileBase = new ChessTileBase(this, ColorRGBA.fromRGBA255(100, 84, 0, 100), new Vector3f(0, 0, 0));
            }if (isTrue || isTrue) {
                if (isTrue || isTrue) {
                    pawn = new Pawn(this, ColorRGBA.fromRGBA255(0, 0, 128, 100), new Vector3f(0, 8, 0));
                }

            }

            //chessTileBase.app.simpleUpdate(tpf);

            //pawn = new Pawn(this, ColorRGBA.fromRGBA255(0, 0, 128,100), new Vector3f(0,8,0));

        }
   // }


    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code

       // if (release) {
            chessTileBase.updateRender();
            pawn.updateRender();

       // }

    }

    /** Custom Keybinding: Map named actions to inputs. */
    private void initKeys() {
        /* You can map one or several inputs to one named mapping. */
        inputManager.addMapping("W",  new KeyTrigger(KeyInput.KEY_SPACE));
        inputManager.addMapping("D",   new KeyTrigger(KeyInput.KEY_D));
        inputManager.addMapping("F",  new KeyTrigger(KeyInput.KEY_F));
        inputManager.addMapping("G", new KeyTrigger(KeyInput.KEY_G));
             //   new MouseButtonTrigger(MouseInput.BUTTON_LEFT));
        /* Add the named mappings to the action listeners. */

        //inputManager.addListener(actionListener, "Pause");

       // AndroidKeyMapping.getJmeKey()
    }
}