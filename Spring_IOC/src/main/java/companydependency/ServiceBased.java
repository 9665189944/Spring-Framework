package companydependency;

public class ServiceBased implements Company
{
    Project project;

    public ServiceBased(Project project) {

        this.project = project;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    private Employee employee;



    @Override
    public void getCompanyType()
    {
        System.out.println("company type is service based");
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
