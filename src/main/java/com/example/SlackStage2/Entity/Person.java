package com.example.SlackStage2.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "slack_stage2")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z ]+$" , message = "Field should only contain letters")
    private String name;

//    @NotNull
//    @Min(1)
//    @Max(200)
//    private int age;
}
