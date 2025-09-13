public class CurrencyConversion {
    private double dollars;
    private double euros;
    private double peso;

    //default
    public CurrencyConversion(){
        dollars = 0;
        euros = 0;
        peso = 0;
    }

    //overloaded
    public CurrencyConversion(double d, double e, double p){
        dollars = d;
        euros = e;
        peso = p;
    }

    //getters and setters


    public double getDollars() {
        return dollars;
    }

    public void setDollars(double dollars) {
        this.dollars = dollars;
    }

    public double getEuros() {
        return euros;
    }

    public void setEuros(double euros) {
        this.euros = euros;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Methods, conversion rates use current rates, may be subject to becoming outdated
    // Learn to use APIs

    public double dollarToEuro (double dollars) {
        euros = dollars * 0.9337;
        return euros;
    }       // converts dollars to euros

    public double euroToDollars (double euros) {
        dollars = euros * 1.0705;
        return dollars;
    }       // converts euros to dollars

    public double dollarToPeso(double dollars) {
        peso = dollars * 57.55;
        return peso;
    }
    public double pesoToDollar(double peso) {
        dollars = peso * 0.01739;
        return dollars;
    }

}
