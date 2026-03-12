package com.backend.bitblock.application.domain.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BlockStatus {
    String proximoBloco;
    String lastHash;
    String recompensaBloco;
}