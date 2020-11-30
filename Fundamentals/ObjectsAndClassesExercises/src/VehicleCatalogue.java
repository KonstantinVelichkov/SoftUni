import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //read input
        List<Cars> carParameters = new ArrayList<>();
        String[] carString = scan.nextLine().split("\\s+");
        String firstCommand = carString[0];
        int carsCount = 0;
        int trucksCount = 0;
        while (!firstCommand.equals("End")) {
            Cars c1 = new Cars(typeToUpperString(carString), carString[1], carString[2], Integer.parseInt(carString[3]));
            carParameters.add(c1);
            if (carString[0].equals("Car")) {
                carsCount++;
            } else if (carString[0].equals("Truck")) {
                trucksCount++;
            }
            carString = scan.nextLine().split("\\s+");
            firstCommand = carString[0];
        }

        String carModel = scan.nextLine();

        while (!carModel.equals("Close the Catalogue")) {
            int index = searchIndex(carParameters, carModel);
            System.out.printf("%s%n", carParameters.get(index));
            carModel = scan.nextLine();
        }

        if (carsCount > 0) {
            double averageCars = averageHorsepowerCars(carParameters);
            System.out.printf("Cars have average horsepower of: %.2f.%n", averageCars);
        } else {
            System.out.printf("Cars have average horsepower of: 0.00.%n");
        }
        if (trucksCount>0){
            double averageTrucks = averageHorsepowerTrucks(carParameters);
            System.out.printf("Trucks have average horsepower of: %.2f.", averageTrucks);
        }else{
            System.out.printf("Trucks have average horsepower of: 0.00.%n");
        }
    }

    public static String typeToUpperString(String[] carString) {
        String type;
        if (carString[0].equals("car") || carString[0].equals("truck")) {
            type = (carString[0].substring(0, 1).toUpperCase() + carString[0].substring(1).toLowerCase());
            carString[0] = type;
            return carString[0];
        }
        return "";
    }

    private static class Cars {
        String type;
        String model;
        String color;
        int horsePower;

        private Cars(String type, String model, String color, int horsePower) {
            this.color = color;
            this.horsePower = horsePower;
            this.model = model;
            this.type = type;
        }

        private String getType() {
            return this.type;
        }

        private String getModel() {
            return this.model;
        }

        private int getPower() {
            return this.horsePower;
        }

        @Override
        public String toString() {
            return (String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %s",
                    this.type, this.model, this.color, this.horsePower));
        }

    }

    private static double averageHorsepowerCars(List<Cars> carParameters) {
        int sumCar = 0;
        int count = 0;
        for (Cars carParameter : carParameters) {
            if (carParameter.getType().equals("Car")) {
                sumCar += carParameter.getPower();
                count++;
            }
        }
        return sumCar / (double) count;
    }

    private static double averageHorsepowerTrucks(List<Cars> carParameters) {
        int count = 0;
        int sumTruck = 0;
        for (Cars carParameter : carParameters) {
            if (carParameter.getType().equals("Truck")) {
                sumTruck += carParameter.getPower();
                count++;
            }
        }
        return sumTruck / (double) count;
    }

    private static int searchIndex(List<Cars> carParameters, String carModel) {
        for (int i = 0; i < carParameters.size(); i++) {
            if (carParameters.get(i).getModel().equals(carModel)) {
                return i;
            }
        }
        return -1;
    }
}
