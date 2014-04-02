package com.sohu.saccount.trident;

import com.sohu.saccount.KafkaConfig;


public class TridentKafkaConfig extends KafkaConfig {
    public TridentKafkaConfig(BrokerHosts hosts, String topic) {
        super(hosts, topic);
    }

    public IBatchCoordinator coordinator = new DefaultCoordinator();
}
