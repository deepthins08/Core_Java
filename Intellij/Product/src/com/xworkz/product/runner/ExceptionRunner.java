package com.xworkz.product.runner;

import com.xworkz.product.exception.DataException;
import com.xworkz.product.exception.LogicalException;

public class ExceptionRunner {
    public static void main(String[] args) throws DataException{

       // throw new LogicalException("trying runtime exception");
        throw new DataException();
    }
}
