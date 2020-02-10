public class Question7 {

    /**
    *Converts temperature from Fahrenheit to Celsius
    *@param tempInFahrenheit
    *@return calculated temperature in degrees Celsius
    */
    public double fahrenheitToCelsius(double tempInFahrenheit){
        return (tempInFahrenheit - 32) * 5 / 9;
    }

    /**
    *Prints temperature in both degrees Fahrenheit and Celsius
    *@param tempInFahrenheit
    */
    public void printTemperature(double tempInFahrenheit){
        System.out.println("F: " + tempInFahrenheit);
        System.out.println("C: " + fahrenheitToCelsius(tempInFahrenheit);)
    }
}