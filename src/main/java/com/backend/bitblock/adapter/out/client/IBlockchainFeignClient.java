package com.backend.bitblock.adapter.out.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "blockchain-api", url = "https://blockchain.info")
public interface IBlockchainFeignClient {
    @GetMapping("/q/getblockcount")
    String getLatestBlockHeight();

    @GetMapping("/q/latesthash")
    String getLastHash();

    @GetMapping("/q/bcperblock")
    String getCurrentReward();
    
}