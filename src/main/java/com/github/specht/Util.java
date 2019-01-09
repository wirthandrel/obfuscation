package com.github.specht;

import java.math.BigDecimal;

public class Util {

    protected int x = 0;
    private String text = "Hello ";

    public String printText () {
        x++;
        
        Integer vlAtt = 1;
        Integer vlAtt2 = 2;
        
        BigDecimal vlAtt3 = BigDecimal.TEN.add(BigDecimal.ONE); 
        
        vlAtt = vlAtt + vlAtt2 + vlAtt;

        return text + "Obfuscation works! Here is some int: " + vlAtt;
    }
}
