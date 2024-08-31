package com.hw.mapper;

import com.hw.pojo.Employee;

/**
 * ClassName: EMpioyeeMapper
 * Package: com.hw.mapper
 * Description:
 *
 * @Author Hacker by HW
 * @Create 2024/8/28 11:39
 * @Version 1.0
 */
public interface EmployeeMapper {
    /**
     * 根据员工id查询员工数据方法
     * @param empId  员工id
     * @return 员工实体对象
     */
    Employee selectEmployee(Integer empId);
}
