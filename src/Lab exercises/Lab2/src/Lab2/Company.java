package Lab2;

public class Company
{
    String name;
    String creationDate;
    String bulstat;
    public Company(String name, String creationDate, String bulstat)
    {
        this.name = name;
        this.creationDate = creationDate;
        setBulstat(bulstat);
    }
    public String getName()
    {
       return name;
    }
    public String getCreationDate()
    {
        return creationDate;
    }
    public String getBulstat()
    {
        return bulstat;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setCreationDate(String creationDate)
    {
        this.creationDate = creationDate;
    }
    public void setBulstat(String bulstat)
    {
        if(bulstat.length()!=10)
        {
            System.out.println("Error! Bulstat must be 10 digits long!");
            return;
        }
        this.bulstat = bulstat;
    }

    public static void main(String[] args) {
          Company c = new Company("A1","03/03/1995","0123456789");
          CompanyET et = new CompanyET("ET","03/03/2003","0123456789","Ivan Ivanov",1000,5000);
          double etEarnings = et.earnings();
          System.out.printf("Earnings: %f",etEarnings);
          c.setBulstat("123");
        System.out.printf("Company c bulstat: %s",c.getBulstat());
    }
}
class CompanyET extends Company
{
    String ownerName;
    double startingCapital;
    double currentCapital;
    public CompanyET(String name, String creationDate, String bulstat, String ownerName, double startingCapital, double currentCapital)
    {
        super(name,creationDate,bulstat);
        this.ownerName = ownerName;
        this.startingCapital = startingCapital;
        this.currentCapital = currentCapital;
    }
    public String getOwnerName()
    {
        return ownerName;
    }
    public double getStartingCapital()
    {
        return startingCapital;
    }
    public double getCurrentCapital()
    {
        return currentCapital;
    }
    public void setOwnerName(String ownerName)
    {
        this.ownerName = ownerName;
    }
    public void setStartingCapital(double startingCapital)
    {
        this.startingCapital = startingCapital;
    }
    public void setCurrentCapital(double currentCapital)
    {
        this.currentCapital = currentCapital;
    }
    public double earnings()
    {
        return this.currentCapital - this.startingCapital;
    }

}

