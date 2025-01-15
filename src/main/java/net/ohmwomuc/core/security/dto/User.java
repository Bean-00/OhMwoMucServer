package net.ohmwomuc.core.security.dto;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import java.util.Set;

public class User {

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Principal {
        private String email;
        private String nickname;
        private Set<GrantedAuthority> role;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class LoginRequest {
        private String email;
        private String password;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class UserAccountInfo {
        private String email;
        private String password;
        private String nickname;
        private Set<GrantedAuthority> role;
    }

}