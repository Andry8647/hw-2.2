package transport;

public class Mechanic {
    private String nameAndSurname;
    private String company;

    public Mechanic(String nameAndSurname, String company) {
        this.nameAndSurname = nameAndSurname;
        this.company = company;
    }

    public void carryOutMaintenance()  {
        System.out.println("Провести тех обслуживание");
        System.out.println();


    }


    public void fixTheCar()  {
        System.out.println("Починить машину");


    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
