package com.sohu.saccount.trident;

import java.io.Serializable;

public interface IBatchCoordinator extends Serializable {
    boolean isReady(long txid);

    void close();
}
