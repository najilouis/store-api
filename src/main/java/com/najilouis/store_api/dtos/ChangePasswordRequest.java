package com.najilouis.store_api.dtos;

import lombok.Data;
import org.springframework.scheduling.support.SimpleTriggerContext;

@Data
public class ChangePasswordRequest {
    private String oldPassword;
    private String newPassword;
}
