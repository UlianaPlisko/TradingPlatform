package com.uliana.treading.model;

import com.uliana.treading.domain.VERIFICATION_TYPE;
import lombok.Data;

@Data
public class TwoFactorAuth {
    private boolean isEnable = false;
    private VERIFICATION_TYPE sendTo;
}
