package com.hw.pojo;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * ClassName: Employee
 * Package: com.hw
 * Description:
 *
 * @Author Hacker by HW
 * @Create 2024/8/28 11:36
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@Getter
@Setter
@ToString
public class Employee {

    private Integer empId;

    private String empName;

    private Double empSalary;

    //getter | setter
}
