package com.example.demokrak2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HobbyRequest {
    String name;
    String link;
    String category;
    String inOut;
}
