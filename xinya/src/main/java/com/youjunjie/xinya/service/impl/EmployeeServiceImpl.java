package com.youjunjie.xinya.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.youjunjie.xinya.entity.Employee;
import com.youjunjie.xinya.mapper.EmployeeMapper;
import com.youjunjie.xinya.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
