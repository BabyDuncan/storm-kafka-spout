package com.sohu.saccount.trident;

public class FailedFetchException extends RuntimeException {
    public FailedFetchException(Exception e) {
        super(e);
    }
}
