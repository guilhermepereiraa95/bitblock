package com.backend.bitblock.adapter.out;

import org.springframework.stereotype.Repository;

import com.backend.bitblock.adapter.out.client.IBlockchainFeignClient;
import com.backend.bitblock.port.out.IBlockchainRepository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BlockchainRepository implements IBlockchainRepository {

    private final IBlockchainFeignClient feignClient;
    
    @Override
    public String getLatestBlockHeight() {
        return this.feignClient.getLatestBlockHeight();
    }
    
    @Override
    public String getLastHash() {
        return this.feignClient.getLastHash();
    }

     @Override
    public String getCurrentReward() {
        return this.feignClient.getCurrentReward();
    }
}
