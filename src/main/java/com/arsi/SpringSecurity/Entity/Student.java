package com.arsi.SpringSecurity.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Student {

    private final Integer studentId;
    private final String studentName;


}
