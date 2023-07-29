package companydependency;

public class ProductBased implements Company
{

    Project project;

    public ProductBased(Project project) {
        this.project = project;
    }

    public void setEmployee(Employee employee) {

        this.employee = employee;
    }

    private Employee employee;


    @Override
    public void getCompanyType()
    {
        System.out.println("company type ProductBased Company");
    }

    @Override
    public void getEmployees()
    {
        employee.getEmployee();

    }

    @Override
    public void getProjects()
    {
        project.getProjectDetails();

    }
}
