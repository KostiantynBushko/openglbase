package com.bushko.openglbase;

import android.content.Context;
import android.opengl.GLSurfaceView;

/**
 * Created by Saiber on 14.12.13.
 */
public class GLView extends GLSurfaceView {
    public GLView(Context context) {
        super(context);
        this.setRenderer(new GLRenderer());
    }
}
