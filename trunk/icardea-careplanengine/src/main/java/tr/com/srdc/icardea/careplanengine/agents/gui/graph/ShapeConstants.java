package tr.com.srdc.icardea.careplanengine.agents.gui.graph;

//~--- non-JDK imports --------------------------------------------------------

import prefuse.Constants;

import prefuse.render.Renderer;
import prefuse.render.ShapeRenderer;

import prefuse.util.ColorLib;

//~--- JDK imports ------------------------------------------------------------

import java.awt.*;

/**
 * User: mehmet
 * Date: Mar 15, 2006
 * Time: 2:26:31 PM
 */
public abstract class ShapeConstants {

/*
    public static final Color   ACTION_STEP_COLOR           =   Color.GREEN,
                                MACRO_ACTION_STEP_COLOR     =   Color.GREEN,
                                BRANCH_STEP_COLOR           =   Color.RED,
                                CASE_STEP_COLOR             =   Color.CYAN,
                                CHOICE_STEP_COLOR           =   Color.BLUE,
                                UTILITY_CHOICE_STEP_COLOR   =   Color.BLUE,
                                MACRO_DECISION_STEP_COLOR   =   Color.GREEN,
                                PATIENT_STATE_STEP_COLOR    =   Color.YELLOW,
                                SYNCHRONIZATION_STEP_COLOR  =   Color.PINK;

    public static final String  ACTION_STEP_TEXT           =   "ACTION_STEP",
                                MACRO_ACTION_STEP_TEXT     =   "MACRO_ACTION_STEP",
                                BRANCH_STEP_TEXT           =   "BRANCH_STEP",
                                CASE_STEP_TEXT             =   "CASE_STEP",
                                CHOICE_STEP_TEXT           =   "CHOICE_STEP",
                                UTILITY_CHOICE_STEP_TEXT   =   "UTILITY_CHOICE_STEP",
                                MACRO_DECISION_STEP_TEXT   =   "MACRO_DECISION_STEP",
                                PATIENT_STATE_STEP_TEXT    =   "PATIENT_STATE_STEP",
                                SYNCHRONIZATION_STEP_TEXT  =   "SYNCHRONIZATION_STEP";

                                */
    public static final Color[]    STEP_COLORS         = new Color[] {
        Color.GREEN,                       // ACTION_STEP_COLOR
        Color.GREEN,                       // MACRO_ACTION_STEP_COLOR
        new Color(239, 83, 83),            // BRANCH_STEP_COLOR
        Color.CYAN,                        // CASE_STEP_COLOR
        new Color(13, 105, 255),           // CHOICE_STEP_COLOR
        new Color(13, 105, 255),           // UTILITY_CHOICE_STEP_COLOR
        Color.GREEN,                       // MACRO_DECISION_STEP_COLOR
        Color.YELLOW,                      // PATIENT_STATE_STEP_COLOR
        Color.PINK,                        // SYNCHRONIZATION_STEP_COLOR
        Color.RED,                         // SUBGUIDELINE_COLOR
        new Color(117, 191, 255),          // DEFAULT_STEP_COLOR
        new Color(200, 200, 200)           // OTHER
    };
    public static final String[]   STEP_TEXTS          = new String[] {
        "Action Step",                     // ACTION_STEP_TEXT
        "Macro Action Step",               // MACRO_ACTION_STEP_TEXT
        "Branch Step",                     // BRANCH_STEP_TEXT
        "Case Step",                       // CASE_STEP_TEXT
        "Choice Step",                     // CHOICE_STEP_TEXT
        "Utility Choice Step",             // UTILITY_CHOICE_STEP_TEXT
        "Macro Decision Step",             // MACRO_DECISION_STEP_TEXT
        "Patient State Step",              // PATIENT_STATE_STEP_TEXT
        "Synchronization Step",            // SYNCHRONIZATION_STEP_TEXT
        "Subguideline",                    // SUBGUIDELINE_TEXT
        "Default Step",                    // DEFAULT_STEP_TEXT
        "OPPPPPPPPS"                       // OTHER
    };
    public static final Renderer[] STEP_RENDERERS      = new Renderer[] {
        new GuidelineShapeRenderer(40),    // ACTION_STEP_RENDERER
        new GuidelineShapeRenderer(40),    // MACRO_ACTION_STEP_RENDERER
        new GuidelineShapeRenderer(40),    // BRANCH_STEP_RENDERER
        new GuidelineShapeRenderer(40),    // CASE_STEP_RENDERER
        new GuidelineShapeRenderer(40),    // CHOICE_STEP_RENDERER
        new GuidelineShapeRenderer(40),    // UTILITY_CHOICE_STEP_RENDERER
        new GuidelineShapeRenderer(40),    // MACRO_DECISION_STEP_RENDERER
        new GuidelineShapeRenderer(40),    // PATIENT_STATE_STEP_RENDERER
        new GuidelineShapeRenderer(40),    // SYNCHRONIZATION_STEP_RENDERER
        new GuidelineShapeRenderer(60),    // SUBGUIDELINE_RENDERER
        new GuidelineShapeRenderer(40),    // DEFAULT_STEP_RENDERER
        new GuidelineShapeRenderer(40)     // OTHER
    };
    public static final int[]      SHAPE_TYPES         = new int[] {
        Constants.SHAPE_RECTANGLE,         // ACTION_STEP_SHAPE
        Constants.SHAPE_RECTANGLE,         // MACRO_ACTION_STEP_SHAPE
        Constants.SHAPE_ELLIPSE,           // BRANCH_STEP_SHAPE
        Constants.SHAPE_DIAMOND,           // CASE_STEP_SHAPE
        Constants.SHAPE_HEXAGON,           // CHOICE_STEP_SHAPE
        Constants.SHAPE_HEXAGON,           // UTILITY_CHOICE_STEP_SHAPE
        Constants.SHAPE_DIAMOND,           // MACRO_DECISION_STEP_SHAPE
        Constants.SHAPE_DIAMOND,           // PATIENT_STATE_STEP_SHAPE
        Constants.SHAPE_RECTANGLE,         // SYNCHRONIZATION_STEP_SHAPE
        Constants.SHAPE_STAR,              // SUBGUIDELINE_SHAPE
        Constants.SHAPE_HEXAGON,           // DEFAULT_STEP_SHAPE
        Constants.SHAPE_ELLIPSE            // OTHER
    };
    public static final int[]      PREFUSE_STEP_COLORS = new int[ShapeConstants.SIZE + 1];
    public static final int
        ACTION_STEP                                    = 0,
        MACRO_ACTION_STEP                              = 1,
        BRANCH_STEP                                    = 2,
        CASE_STEP                                      = 3,
        CHOICE_STEP                                    = 4,
        UTILITY_CHOICE_STEP                            = 5,
        MACRO_DECISION_STEP                            = 6,
        PATIENT_STATE_STEP                             = 7,
        SYNCHRONIZATION_STEP                           = 8,
        SUBGUIDELINE                                   = 9,
        DEFAULT_STEP                                   = 10,
        SIZE                                           = 11;

    static {
        for (int i = 0; i < PREFUSE_STEP_COLORS.length; i++) {
            PREFUSE_STEP_COLORS[i] = ColorLib.color(ShapeConstants.STEP_COLORS[i]);
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
