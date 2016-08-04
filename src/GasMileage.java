/**
 * Created by jonesdc on 8/4/16.
 */
public class GasMileage {

    public boolean gasPrediction(double[] driveDistances, double currentGasLevel, double avgMileage)
    {

        double totalDistance = 0;
        for (int i = 0; i < driveDistances.length; i++)
        {
            totalDistance += driveDistances[i];
        }
        double gasConsumed = totalDistance / avgMileage;

        return currentGasLevel < gasConsumed / 12.0;
    }
}
