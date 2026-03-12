package com.backend.bitblock.application.usecase;

import org.springframework.stereotype.Service;

import com.backend.bitblock.application.domain.dto.BlockStatus;
import com.backend.bitblock.port.in.IBlockStatusUseCase;
import com.backend.bitblock.port.out.IBlockchainRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BlockStatusUseCase implements IBlockStatusUseCase {
    private final IBlockchainRepository blockchainRepository;

    @Override
    public BlockStatus obterStatusAtual() {
    
        return BlockStatus.builder()
                .lastHash(blockchainRepository.getLastHash())
                .proximoBloco(blockchainRepository.getLatestBlockHeight())
                .recompensaBloco(this.blockchainRepository.getCurrentReward())
                .build();
    }
    
}
