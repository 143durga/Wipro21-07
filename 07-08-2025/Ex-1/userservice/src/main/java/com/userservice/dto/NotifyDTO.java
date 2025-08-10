package com.userservice.dto;


import com.userservice.entity.User;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotifyDTO {
    private User user;
    private String action; // "Created", "Updated", "Deleted"
}
