package com.vitaliy.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/")
    public String showMyView(){
        return "myView";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){

//        Employee employee = new Employee();
//        employee.setName("Ivan");
//        employee.setSurname("Stalnoi");
//        employee.setSalary(1);

        model.addAttribute("employee", new Employee());

        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@ModelAttribute("employee") Employee employee){

        return "show-emp-details-view";
    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(){
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model){
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAttribute", empName);
//        model.addAttribute("description", "best user");
//        return "show-emp-details-view";
//    }
}
