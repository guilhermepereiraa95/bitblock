package com.backend.bitblock.adapter.in;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.bitblock.application.domain.dto.BlockStatus;
import com.backend.bitblock.port.in.IBlockStatusUseCase;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/bitcoin")
public class BitBlockController implements ISwaggerBitBlockController {

    public final IBlockStatusUseCase useCase;

    @Override
    @GetMapping("/status")
    public ResponseEntity<BlockStatus> getStatus() {
        return ResponseEntity.ok(useCase.obterStatusAtual());
    }
}