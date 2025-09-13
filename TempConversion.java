public class TempConversion {
    private float fahrenheit;
    private float celsius;
    private float kelvin;

    // default constructor

    public TempConversion(){
    fahrenheit = 0f;
    celsius = 0f;
    kelvin = 0f;
    }

    // overloaded constructor

    public TempConversion(float f, float c, float k){
        fahrenheit = f;
        celsius = c;
        kelvin = k;
    }
    // getters and setters
    public float getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(float fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public float getCelsius() {
        return celsius;
    }

    public void setCelsius(float celsius) {
        this.celsius = celsius;
    }

    public float getKelvin() {
        return kelvin;
    }

    public void setKelvin(float kelvin) {
        this.kelvin = kelvin;
    }

    //methods

    public float celsiusToFahrenheit(float celsius){
        fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }// converts Celsius to Fahrenheit

    public float fahrenheitToCelsius(float fahrenheit){
        celsius = ((fahrenheit - 32) * 5) / 9;
        return celsius;
    }// converts Fahrenheit to Celsius



}
