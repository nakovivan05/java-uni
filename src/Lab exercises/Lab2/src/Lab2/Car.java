package Lab2;



class Car {
    String brand;
    String model;
    String color;
    double power;
    String engineType;
    String gearboxType;
    int yearOfProduction;
    public Car()
    {

    }
    public Car(String brand, String model, String color, double power, String engineType, String gearboxType, int yearOfProduction)
    {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.power = power;
        this.engineType = engineType;
        this.gearboxType = gearboxType;
        this.yearOfProduction = yearOfProduction;
    }
    public String getBrand()
    {
        return brand;
    }
    public String getModel()
    {
        return model;
    }
    public String getColor()
    {
        return color;
    }
    public double getPower()
    {
        return power;
    }
    public String getEngineType()
    {
        return engineType;
    }
    public String getGearboxType()
    {
        return gearboxType;
    }
    public int getYearOfProduction()
    {
        return yearOfProduction;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setPower(double power)
    {
        this.power = power;
    }
    public void setEngineType(String engineType)
    {
        this.engineType = engineType;
    }
    public void setGearboxType(String gearboxType)
    {
        this.gearboxType = gearboxType;
    }
    public void setYearOfProduction(int yearOfProduction)
    {
        this.yearOfProduction = yearOfProduction;
    }
    public void printInfo()
    {
        System.out.printf("Brand: %s, Model: %s, Color: %s, Power: %f, Engine Type: %s, Gearbox Type: %s, Year of production: %d%n",this.brand,this.model,this.color,this.power,this.engineType,this.gearboxType,this.yearOfProduction);
    }
    public static Car [] carsWithGivenLetter(Car[] cars, char letter)
    {
        int countOfCars = cars.length;
        int countOfFilteredCars=0;
        for(Car car:cars)
        {
            if(car.brand.charAt(0)==letter)
            {
                countOfFilteredCars++;
            }
        }
        Car [] result = new Car[countOfFilteredCars];
        int index = 0;
        for(int i=0;i<countOfCars;i++)
        {
            if(cars[i].brand.charAt(0)==letter)
            {
                result[index] = cars[i];
                index++;
            }
        }
        return result;
    }
    public static Car[] sort(Car[]cars,String sortType)
    {
        if(sortType.equals("Ascending"))
        {
            Car[]ascendingCars = new Car[cars.length];
            for (int i = 0; i < cars.length; i++) {
                ascendingCars[i] = cars[i];
            }
            for(int i =0; i< ascendingCars.length-1;i++)
            {
                boolean isBiggerThanNext = false;
                for(int j=0; j<ascendingCars.length - i - 1;j++)
                {

                    isBiggerThanNext = ascendingCars[j].brand.compareTo(ascendingCars[j+1].brand)>0;
                    if(isBiggerThanNext)
                    {
                        Car tmp = ascendingCars[j];
                        ascendingCars[j] = ascendingCars[j+1];
                        ascendingCars[j+1] = tmp;
                    }
                }

            }
            return ascendingCars;
        }
        else if (sortType.equals("Descending"))
        {
            Car[]descendingCars = new Car[cars.length];
            for (int i = 0; i < cars.length; i++) {
                descendingCars[i] = cars[i];
            }
            for(int i =0; i< descendingCars.length-1;i++)
            {
                boolean isLowerThanNext = false;
                for(int j=0; j<descendingCars.length - i - 1;j++)
                {

                    isLowerThanNext = descendingCars[j].brand.compareTo(descendingCars[j+1].brand)<0;
                    if(isLowerThanNext)
                    {
                        Car tmp = descendingCars[j];
                        descendingCars[j] = descendingCars[j+1];
                        descendingCars[j+1] = tmp;
                    }
                }

            }
            return descendingCars;
        }
        System.out.println("Invalid sort type!");
        return cars;
    }
    public static Car [] removeDuplicates(Car[]cars)
    {
        Car [] temp = new Car[cars.length];
        int count = 0;
        for(int i = 0; i< cars.length;i++)
        {
            boolean duplicate = false;
            for(int j=0; j<count;j++)
            {
                if(cars[i].brand.equals(temp[j].brand)&&cars[i].model.equals(temp[j].model)&&cars[i].yearOfProduction==temp[j].yearOfProduction)
                {
                    duplicate = true;
                    break;

                }
            }
            if(!duplicate)
            {
                temp[count] = cars[i];
                count++;
            }
        }
        Car[]result = new Car[count];
        for(int i =0; i<count;i++)
        {
            result[i] = temp[i];
        }
        return result;





    }

    public static void main(String[] args) {

        Car c1 = new Car("Audi", "A4", "Black", 150, "Petrol", "Automatic", 2018);
        Car c2 = new Car("BMW", "X5", "White", 250, "Diesel", "Automatic", 2020);
        Car c3 = new Car("Alfa Romeo", "Giulia", "Red", 280, "Petrol", "Manual", 2017);
        Car c4 = new Car("BMW", "X5", "White", 250, "Diesel", "Automatic", 2020);
        Car c5 = new Car("Audi", "Q7", "Gray", 200, "Diesel", "Automatic", 2021);
        Car c6 = new Car("Audi", "Q7", "Gray", 200, "Diesel", "Automatic", 2021);
        Car [] cars = {c1,c2,c3,c4,c5,c6};
        System.out.printf("Cars with letter A:");
        Car[]carsWithSameLetter = Car.carsWithGivenLetter(cars,'A');
        for(Car car:carsWithSameLetter)
        {
            car.printInfo();
        }
        Car[]ascendingCars = Car.sort(cars,"Ascending");
        Car[]descendingCars = Car.sort(cars,"Descending");
        for(Car car:ascendingCars)
        {
            car.printInfo();
        }
        for(Car car:descendingCars)
        {
            car.printInfo();
        }
        Car[]removedDuplicates = Car.removeDuplicates(cars);
        for(Car car:removedDuplicates)
        {
            car.printInfo();
        }


    }
    }

