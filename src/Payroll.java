public class Payroll
{
    private int[] itemsSold; // number of items sold by each employee
    private double[] wages; // wages to be computed in part (b)

    /** Returns the bonus threshold as described in part (a).
     */
    public double computeBonusThreshold()
    {
        int max = itemsSold[0];
        int min = itemsSold[0];
        for (int items : itemsSold) {
            if (items > max) {
                max = items;
            }
            if (items < min) {
                min = items;
            }
        }
        double sum = -1 * (max + min);

        for (int items : itemsSold) {
            sum += items;
        }

        return sum / (itemsSold.length - 2);
    }

    /** Computes employee wages as described in part (b)
     * and stores them in wages.
     * The parameter fixedWage represents the fixed amount each
     employee
     * is paid per day.
     * The parameter perItemWage represents the amount each
     employee
     * is paid per item sold.
     */
    public void computeWages(double fixedWage, double perItemWage)
    {
        double threshold = computeBonusThreshold();

        for (int i = 0; i < itemsSold.length; i++) {
            double wage = fixedWage + (itemsSold[i] * perItemWage);
            if (itemsSold[i] > threshold) {
                wage *= 1.1;
            }

            wages[i] = wage;
        }
    }

// Other instance variables, constructors, and methods not shown.
}