package com.imethod.service.sys.auth;

import com.imethod.core.util.StringTools;
import lombok.Data;

/**
 * time : 15/11/14.
 * auth :
 * desc :
 * tips :
 * 1.
 */

@Data
public class AuthUser {
    private Long userId;
    private String userName;
    private boolean guest = true;

    public AuthUser(Long userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        if (StringTools.isNotEmpty(userId)) {
            guest = false;
        }
    }

}
