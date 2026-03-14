package com.backend.bitblock.adapter.in;

import org.springframework.http.ResponseEntity;

import com.backend.bitblock.application.domain.dto.BlockStatus;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "BitBlock API")
public interface ISwaggerBitBlockController {

  @Operation(summary = "Obtém o status atual do Bitcoin.", description = "Retorna informações sobre o status atual do Bitcoin, incluindo preço, volume e outras métricas relevantes.")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Status do Bitcoin obtido com sucesso."),
      @ApiResponse(responseCode = "500", description = "Erro interno ao obter o status do Bitcoin.")
  })
  ResponseEntity<BlockStatus> getStatus();
}
