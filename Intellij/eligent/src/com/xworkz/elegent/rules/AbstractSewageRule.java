package com.xworkz.elegent.rules;

public abstract class AbstractSewageRule implements SewageRule{

    @Override
    public boolean dumping() {
        return false;
    }

    @Override
    public boolean pipeLines() {
        return false;
    }
}
