package com.backend.bitblock.port.out;
public interface IBlockchainRepository {
    String getLatestBlockHeight();

    String getLastHash();

    String getCurrentReward();
}
