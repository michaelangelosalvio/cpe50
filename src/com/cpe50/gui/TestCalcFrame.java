package com.cpe50.gui;

import java.awt.*;

/**
 * Created by msalvio on 14/08/16.
 */
public class TestCalcFrame {
    public static void main(String[] args) {
        CalcFrame frame = new CalcFrame();


        Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation( dm.width / 2 - frame.getSize().width / 2, dm.height / 2 - frame.getSize().height / 2  );
    }
}
