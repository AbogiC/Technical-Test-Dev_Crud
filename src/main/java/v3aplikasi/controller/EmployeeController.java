package v3aplikasi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import v3aplikasi.model.dto.DefaultResponse;
import v3aplikasi.model.dto.EmployeeDto;
import v3aplikasi.model.entity.EmployeeEntity;
import v3aplikasi.service.EmployeeService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/employeedao")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/all")
    public String home(Model model, HttpServletRequest request){
        request.setAttribute("action", "insert");
        if(request.getParameter("id") != null){
            try{
                EmployeeEntity employeeEntity = new EmployeeEntity();
                employeeEntity = employeeService.getEmployee(Integer.parseInt(request.getParameter("id")));
                request.setAttribute("name", employeeEntity.getName());
                request.setAttribute("birth_date", employeeEntity.getBirth_date());
                request.setAttribute("position_id", employeeEntity.getPositionID());
                request.setAttribute("id_number", employeeEntity.getId_number());
                request.setAttribute("gender", employeeEntity.getGender());
            } catch (Exception e){
                //TODO Auto-generated catch block
                e.printStackTrace();
                request.setAttribute("errorMessage", e.getMessage());
            }
            request.setAttribute("action", request.getParameter("action"));
        } else{
            request.setAttribute("action", "insert");
        }
        defaultList(request);
        return request.getQueryString();
    }

    public void defaultList(HttpServletRequest request){
        Collection<EmployeeEntity> employeeEntityCollection = new ArrayList<EmployeeEntity>();
        try{
            employeeEntityCollection = employeeService.listEmployee();
        } catch (Exception e){
            //TODO Auto-generated catch block
            e.printStackTrace();
            request.setAttribute("errorMessage", e.getMessage());
        }
        request.setAttribute("employeeEntityCollection", employeeEntityCollection);
    }
}
