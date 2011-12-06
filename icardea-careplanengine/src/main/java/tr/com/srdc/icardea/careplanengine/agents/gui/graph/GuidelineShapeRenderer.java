package tr.com.srdc.icardea.careplanengine.agents.gui.graph;

//~--- non-JDK imports --------------------------------------------------------

import prefuse.render.ShapeRenderer;

import prefuse.util.ColorLib;

import prefuse.visual.VisualItem;

//~--- JDK imports ------------------------------------------------------------

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

/**
 * User: mehmet
 * Date: Mar 29, 2006
 * Time: 6:47:10 PM
 */
public class GuidelineShapeRenderer extends ShapeRenderer {
    public GuidelineShapeRenderer(int i) {
        super(i);
    }

    public void render(Graphics2D graphics2D, VisualItem visualItem) {
        Rectangle2D textBounds = visualItem.getFont().getStringBounds(visualItem.getString(GuidelineGraph.LABEL),
                                     graphics2D.getFontRenderContext());

        super.render(graphics2D, visualItem);
        visualItem.setDouble(GuidelineGraph.WIDTH, textBounds.getWidth());
        graphics2D.setColor(ColorLib.getColor(visualItem.getTextColor()));
        graphics2D.setFont(visualItem.getFont());
        graphics2D.drawString(visualItem.getString(GuidelineGraph.LABEL),
                              (int) (visualItem.getX() - textBounds.getWidth() / 2),
                              (int) (visualItem.getY() + textBounds.getHeight() / 2));
    }

    public void setBounds(VisualItem item) {
        if (!m_manageBounds) {
            return;
        }

        Shape shape = getShape(item);

        if (shape == null) {
            item.setBounds(item.getX(), item.getY(), 0, 0);
        } else {
            setBounds(item, shape, getStroke(item));
        }
    }

    public static void setBounds(VisualItem item, Shape shape, BasicStroke stroke) {
        double x, y, w, h, lw, lw2,
               oldw = 0;

        if (shape instanceof RectangularShape) {

            // this covers rectangle, rounded rectangle, ellipse, and arcs
            RectangularShape r = (RectangularShape) shape;

            x = r.getX();
            y = r.getY();
            w = r.getWidth();
            h = r.getHeight();
        } else if (shape instanceof Line2D) {

            // this covers straight lines
            Line2D l = (Line2D) shape;

            x = l.getX1();
            y = l.getY1();
            w = l.getX2();
            h = l.getY2();

            if (w < x) {
                lw = x;
                x  = w;
                w  = lw - x;
            } else {
                w = w - x;
            }

            if (h < y) {
                lw = y;
                y  = h;
                h  = lw - y;
            } else {
                h = h - y;
            }
        } else {

            // this covers any other arbitrary shapes, but
            // takes a small object allocation / garbage collection hit
            Rectangle2D r = shape.getBounds2D();

            x = r.getX();
            y = r.getY();
            w = r.getWidth();
            h = r.getHeight();
        }

        if (item.getDouble(GuidelineGraph.WIDTH) > w) {
            oldw = w;
            w    = item.getDouble(GuidelineGraph.WIDTH);
            x    -= (w - oldw) / 2;
        }

        // adjust boundary for stoke length as necessary
        if ((stroke != null) && (lw = stroke.getLineWidth()) > 1) {
            lw2 = lw / 2.0;
            x   -= lw2;
            y   -= lw2;
            w   += lw;
            h   += lw;
        }

        item.setBounds(x, y, w, h);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
