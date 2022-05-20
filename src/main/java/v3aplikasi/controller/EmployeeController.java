package v3aplikasi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/home")
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

    @PostMapping("/insert")
    public String insert(Model model, HttpServletRequest request){
        String action = request.getParameter("action");
        if(action.equalsIgnoreCase("insert")){
            try{
                EmployeeEntity employeeEntity = new EmployeeEntity();
                employeeEntity.setName(request.getParameter("name"));
//                employeeEntity.setBirth_date(request.getParameter("birth_date"));
                employeeEntity.setGender(Integer.valueOf(request.getParameter("gender")));
                employeeEntity.setId_number(Integer.valueOf(request.getParameter("id_number")));
                employeeEntity.setPositionID(request.getParameter("position_id"));
                employeeService.insertEmployee(employeeEntity);
            } catch(Exception e){
                //TODO Auto-generated catch block
                e.printStackTrace();
                request.setAttribute("errorMessage", e.getMessage());
            }
            request.setAttribute("action", "insert");
        } else if(action.equalsIgnoreCase("edit")){
            try{
                EmployeeEntity employeeEntity = new EmployeeEntity();
                employeeEntity.setName(request.getParameter("name"));
//                employeeEntity.setBirth_date(request.getParameter("birth_date"));
                employeeEntity.setGender(Integer.valueOf(request.getParameter("gender")));
                employeeEntity.setId_number(Integer.valueOf(request.getParameter("id_number")));
                employeeEntity.setPositionID(request.getParameter("position_id"));
                employeeService.updateEmployee(employeeEntity);
            } catch(Exception e){
                //TODO Auto-generated catch block
                e.printStackTrace();
                request.setAttribute("errorMessage", e.getMessage());
            }
            request.setAttribute("action", "insert");
        }
        defaultList((request));
        return "employee-list";
    }

    @PostMapping("/delete")
    public String delete(Model model, HttpServletRequest request){
        String action = request.getParameter("action");
        if(action.equalsIgnoreCase("delete")){
            int id = Integer.parseInt(request.getParameter("id"));
            EmployeeEntity employeeEntity = new EmployeeEntity();
            employeeEntity.setId(id);
            try{
                employeeService.deleteEmployee(employeeEntity);
            } catch(Exception e){
                //TODO Auto-generated catch block
                e.printStackTrace();
                request.setAttribute("errorMessage", e.getMessage());
            }
            request.setAttribute("action", "insert");
        }
        defaultList(request);
        return "employee-list";
    }
}
