package com.datorium.Datorium.API;

public class MathService {

    public int sum(int a, int b) {
        if (a+b >100) {
            return 0;
        } else {
            return a + b;
        }
    }
}
