import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class RawData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] line = scan.nextLine().split("\\s+");
            String model = line[0];
            int engineSpeed = Integer.parseInt(line[1]);
            int enginePower = Integer.parseInt(line[2]);
            int cargoWeight = Integer.parseInt(line[3]);
            String cargoType = line[4];
            double tire1Pressure = Double.parseDouble(line[5]);
            int tire1Age = Integer.parseInt(line[6]);
            double tire2Pressure = Double.parseDouble(line[7]);
            int tire2Age = Integer.parseInt(line[8]);
            double tire3Pressure = Double.parseDouble(line[9]);
            int tire3Age = Integer.parseInt(line[10]);
            double tire4Pressure = Double.parseDouble(line[11]);
            int tire4Age = Integer.parseInt(line[12]);

            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tire tire1 = new Tire(tire1Pressure, tire1Age);
            Tire tire2 = new Tire(tire2Pressure, tire2Age);
            Tire tire3 = new Tire(tire3Pressure, tire3Age);
            Tire tire4 = new Tire(tire4Pressure, tire4Age);
            Car car = new Car(model, engine, cargo, tire1, tire2, tire3, tire4);

            carList.add(car);
        }

        String command = scan.nextLine();
        List<String> output = new ArrayList<>();
        if (command.equals("fragile")) {
                carList.stream().filter(e -> e.getCargo().getCargoType().equals("fragile"))
                        .filter(e -> Arrays.stream(e.getTires()).anyMatch(tireSet -> tireSet.getPressure() < 1))
                        .map(Car::getModel)
                        .forEach(output::add);

        } else if (command.equals("flamable")) {
            carList.forEach(e -> {
                if (e.getCargo().getCargoType().equals("flamable") && e.getEngine().getEnginePower() > 250){
                    output.add(e.getModel());
                }
            });
        }
        output.forEach(System.out::println);
    }

        private static class Car {
            String model;
            Engine engine;
            Cargo cargo;
            Tire tire1;
            Tire tire2;
            Tire tire3;
            Tire tire4;


            public Car(String model, Engine engine, Cargo cargo, Tire tire1, Tire tire2, Tire tire3, Tire tire4) {
                this.model = model;
                this.cargo = cargo;
                this.engine = engine;
                this.tire1 = tire1;
                this.tire2 = tire2;
                this.tire3 = tire3;
                this.tire4 = tire4;
            }

            public Cargo getCargo() {
                return cargo;
            }

            public Tire[] getTires() {
                return new Tire[]{tire1, tire2, tire3, tire4};
            }

            public Engine getEngine() {
                return engine;
            }

            public String getModel() {
                return model;
            }
        }

        private static class Engine {
            int engineSpeed;
            int enginePower;

            public Engine(int engineSpeed, int enginePower) {
                this.engineSpeed = engineSpeed;
                this.enginePower = enginePower;
            }

            public int getEnginePower() {
                return enginePower;
            }

        }

        private static class Cargo {
            int cargoWeight;
            String cargoType;

            public Cargo(int cargoWeight, String cargoType) {
                this.cargoWeight = cargoWeight;
                this.cargoType = cargoType;
            }

            public String getCargoType() {
                return cargoType;
            }
        }

        private static class Tire {
            double pressure;
            int age;

            private Tire(double pressure, int age) {
                this.pressure = pressure;
                this.age = age;
            }

            public double getPressure() {
                return pressure;
            }
        }
    }
