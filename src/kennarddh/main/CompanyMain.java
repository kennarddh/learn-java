package kennarddh.main;

import kennarddh.data.company.Company;

public class CompanyMain {
    public static void main(String[] args) {
        Company company1 = new Company();
        try {
            company1.setName("Company1");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Company.Employee company1Employee = company1.new Employee();
        try {
            company1Employee.setName("Company1Employee");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(company1Employee.getLevel().getDescription());
        company1Employee.setLevel(Company.Employee.Level.Two);
        System.out.println(company1Employee.getLevel().getDescription());

        System.out.println(company1.getName());
        System.out.println(company1Employee.getCompany().getName());

        System.out.println(company1Employee.getName());
    }
}
