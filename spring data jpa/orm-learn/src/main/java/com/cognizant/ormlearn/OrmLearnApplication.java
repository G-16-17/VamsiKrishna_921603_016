package com.cognizant.ormlearn;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Sort;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.model.Department;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.model.Skill;
import com.cognizant.ormlearn.model.Stock;
import com.cognizant.ormlearn.repository.StockRepository;
import com.cognizant.ormlearn.service.CountryService;
import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.SkillService;
import com.cognizant.ormlearn.service.StockService;
import com.cognizant.ormlearn.service.exception.CountryNotFoundException;

@SpringBootApplication
public class OrmLearnApplication {
	
	private static final Logger LOGGER=(Logger) LoggerFactory.getLogger(OrmLearnApplication.class);
	//private static CountryService service;
	//private static StockService stockService;
	//@Autowired
	//private static StockRepository stockRepository;
	private static EmployeeService employeeService;
	private static DepartmentService departmentService;
	private static SkillService skillService;
	
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(OrmLearnApplication.class, args);
		employeeService=context.getBean(EmployeeService.class);
		departmentService=context.getBean(DepartmentService.class);
		skillService=context.getBean(SkillService.class);
        
		//testGetEmployee();
		//testAddEmployee();
		//testUpdateEmployee();
		//testGetDepartment();
		testAddSkillToEmployee();

	}
		

	
	/*public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(OrmLearnApplication.class, args);
		LOGGER.info("Application Started....");
		//service=context.getBean(StockService.class);
		stockRepository=context.getBean(StockRepository.class);
		List<Stock> stockList=stockRepository.findStockByCodeandVolume("FB",Sort.by("volume"));
		stockList.forEach(System.out::println);
		//List<Stock> stockList=stockService.getAllStock("FB",9,2019);
		//List<Stock> stockList=stockRepository.findStockByCodeandMonthandYear("FB", 9, 2019);
		//LOGGER.info("Stock: {}",stockList);
	}*/

//	public static void main(String[] args) {
//		ApplicationContext context=SpringApplication.run(OrmLearnApplication.class, args);
//		LOGGER.info("Application Started....");
//		service=context.getBean(CountryService.class);
//		List<Country> countryList=service.getAllCountry("ou");
//		LOGGER.info("Country: {}",countryList);
//		LOGGER.info("End");
//
//		testGetAllCountries();
//		testAddCountry();
//		testUpdateCountry();
//		testDeleteCountry();
//	}
	
//	public static void testGetAllCountries() {
//		LOGGER.info("start");
//		//List<Country> countryList=service.getAllCountries();
//		//List<Country> countryList=service.getAllCountry();
//		List<Country> countryList=service.getAllCountry("ou");
//		LOGGER.info("Countries: {}",countryList);
////		try {
////		Country country=service.findCountryByCode("IN");
////		LOGGER.info("Country: {}",country);
////		}catch(CountryNotFoundException e) {
////			LOGGER.error(e.getMessage());
////		}
//		LOGGER.info("End");
//			
//	}
	
//	public static void testAddCountry() {
//		LOGGER.info("start");
//		Country country=new Country("MM","New Country");
//		service.addCountry(country);
//		LOGGER.info("End");
//	}
	
//	public static void testUpdateCountry() {
//		LOGGER.info("start");
//		try {
//		    service.updateCountry("MM","New Country Modified");
//		}catch(CountryNotFoundException e) {
//			LOGGER.error(e.getMessage());
//		}
//		LOGGER.info("End");
//			
//	}
	
//	public static void testDeleteCountry() {
//		LOGGER.info("start");
//		service.deleteCountry("MM");
//		LOGGER.info("End");
//	}

    /*private static void testGetEmployee() {
        LOGGER.info("Start");
        Employee employee = employeeService.get(1);
        LOGGER.debug("Employee:{}", employee);
        LOGGER.debug("Department:{}", employee.getDepartment());
        LOGGER.debug("Skills:{}", employee.getSkillList());
        LOGGER.info("End");

    }*/
	
	/*public static void testAddEmployee() {
		LOGGER.info("Start");
		Department department=departmentService.get(1);
		Employee employee=new Employee();
		employee.setName("Tom");
		employee.setSalary(new BigDecimal(15000));
		employee.setPermanent(true);
		SimpleDateFormat date=new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date dob=date.parse("2/07/2000");
			employee.setDateOfBirth(dob);
			employee.setDepartment(department);
			employeeService.save(employee);
			LOGGER.debug("Employee:{}", employee);
			
		}catch(Exception e) {
			LOGGER.error(e.getMessage());
		}

	}*/
	
	/*public static void testUpdateEmployee() {
		Employee employee=employeeService.get(4);
		Department department=departmentService.get(2);
		employee.setDepartment(department);
		employeeService.save(employee);
		LOGGER.debug("Employee: {}",employee);
	}*/
	
	/*public static void testGetDepartment() {
		Department department=departmentService.get(1);
		LOGGER.debug("Department: {}",department);
		LOGGER.debug("Employee: {}",department.getEmployeeList());
		
	}*/
    
    public static void testAddSkillToEmployee() {
    	Employee employee=employeeService.get(4);
    	Skill skill=skillService.get(1);
    	employee.getSkillList().add(skill);
    	employeeService.save(employee);
    	
    }
}
