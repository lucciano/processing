package processing.lwjgl;

public class PGraphics2D extends processing.opengl.PGraphics2D {

  public PGraphics2D() {
    pgl = new PGL(this);

    if (tessellator == null) {
      tessellator = new Tessellator();
    }

    intBuffer = PGL.allocateIntBuffer(2);
    floatBuffer = PGL.allocateFloatBuffer(2);
    viewport = PGL.allocateIntBuffer(4);

    inGeo = newInGeometry(IMMEDIATE);
    tessGeo = newTessGeometry(IMMEDIATE);
    texCache = newTexCache();

    initialized = false;
  }
}
