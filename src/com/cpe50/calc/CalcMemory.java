package com.cpe50.calc;

import java.util.ArrayList;

/**
 * Created by msalvio on 21/08/17.
 */
public class CalcMemory {
    private String currentOperation = null;
    private double ans = 0;
    private double values[];
    private int index = 0;

    private boolean allowOverride = true;

    public void setAllowOverride(boolean allowOverride) {
        this.allowOverride = allowOverride;
    }

    public boolean isAllowedOverride() {
        return allowOverride;
    }

    public CalcMemory(){
        values = new double[2];
    }

    public double setValue( double value, String currentOperation ) {
        if ( index == 0 ) {
            values[index] = value;
            this.currentOperation = currentOperation;
            allowOverride = true;
            index++;
            return values[0];
        }

        if ( isAllowedOverride() && !currentOperation.equals("=") ) {
            this.currentOperation = currentOperation;
            return values[0];
        }


        values[1] = value;
        System.out.println( values[0] + this.currentOperation + values[1]);


        double ans = value;
        switch (this.currentOperation) {
            case "+": {
                ans = values[0] + values[1];
                break;
            }
            case "-": {
                ans = values[0] - values[1];
                break;
            }
            case "x": {
                ans = values[0] * values[1];
                break;
            }
        }


        allowOverride = true;

        values[0] = ans;
        values[1] = 0;

        if ( !currentOperation.equals("=") ) {
            this.currentOperation = currentOperation;
        } else {
            this.currentOperation = null;
            this.index = 0;
        }

        return ans;
    }



}
