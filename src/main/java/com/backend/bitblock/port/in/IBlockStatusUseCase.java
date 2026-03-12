package com.backend.bitblock.port.in;

import com.backend.bitblock.application.domain.dto.BlockStatus;

public interface IBlockStatusUseCase {
    BlockStatus obterStatusAtual();
}
