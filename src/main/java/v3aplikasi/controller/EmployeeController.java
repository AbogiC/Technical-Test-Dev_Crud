package v3aplikasi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import v3aplikasi.model.dto.DefaultResponse;
import v3aplikasi.model.dto.EmployeeDto;
import v3aplikasi.model.entity.EmployeeEntity;
import v3aplikasi.service.EmployeeService;

@RestController
@RequestMapping("/employeedao")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

}
