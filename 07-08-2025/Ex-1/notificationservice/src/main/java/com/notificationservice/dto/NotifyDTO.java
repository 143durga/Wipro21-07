package com.notificationservice.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotifyDTO {
    private User user;
    private String action;

    @Data
    public static class User {
        private String username;
        private String password;
        private String address;
    }
}
