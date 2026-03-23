package com.dogukantez.device_service.dto;

import com.dogukantez.device_service.model.DeviceType;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class DeviceDto {
    private Long id;
    private String name;
    private DeviceType type;
    private String location;
    private Long userId;
}
