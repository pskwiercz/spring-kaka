package com.pskwiercz.springkafka.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDispatched {

    private UUID orderId;

    private UUID processedById;

    String notes;
}
