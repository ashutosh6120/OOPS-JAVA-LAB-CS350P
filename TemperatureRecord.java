// TEMPERATURE RECORD JAVA PROGRAM !!!

import java.util.Scanner;

class CityTemperatureRecord{
    String cityNames[];
    double temperatures[][];

    public CityTemperatureRecord()
    {
        cityNames = new String[5];
        temperatures = new double[5][6];
    }

    public void readTemperatures()
    {
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < 5; i++)
        {
            System.out.print("enter city" + (i+1) + "name: ");
            cityNames[i] = s.next();

            System.out.println("enter temperature for city " +(i+1) + ": ");
            for(int j = 0; j < 6; j++)
                temperatures[i][j] = s.nextDouble();
        }
        s.close();
    }

    public void findLowestTemperature()
    {
        double lowestTemp = temperatures[0][0];
        int lowestCityIdx = 0;
        for(int i = 0; i< 5; i++)
        {
            for(int j = 0; j < 6; j++)
            {
                if(temperatures[i][j] < lowestTemp)
                {
                    lowestTemp = temperatures[i][j];
                    lowestCityIdx = i;
                }
            }
        }
        System.out.println(cityNames[lowestCityIdx] + " has the lowest temperature of " + lowestTemp);
    }

    public void findHighestTemperature()
    {
        double highestTemp = temperatures[0][0];
        int highestCityIdx = 0;
        for(int i = 0; i< 5; i++)
        {
            for(int j = 0; j< 6; j++)
            {
                if(temperatures[i][j] > highestTemp)
                {
                    highestTemp = temperatures[i][j];
                    highestCityIdx = i;
                }
            }
        }
        System.out.println(cityNames[highestCityIdx] + " has the highest temperature of " + highestTemp);
    }
}

public class TemperatureRecord
{
    public static void main(String[] args)
    {
        CityTemperatureRecord records = new CityTemperatureRecord();
        records.readTemperatures();
        records.findHighestTemperature();
        records.findLowestTemperature();
    }
}