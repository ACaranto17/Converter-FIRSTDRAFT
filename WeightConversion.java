public class WeightConversion {
    private float pounds;
    private float kilograms;

    //default constructor
    public WeightConversion(){
        pounds = 0f;
        kilograms = 0f;
    }

    //overloaded constructor
    public WeightConversion(float lb, float kg) {
        pounds = lb;
        kilograms = kg;
    }

    // getters and setters
    public float getPounds() {
        return pounds;
    }

    public void setPounds(float pounds) {
        this.pounds = pounds;
    }

    public float getKilograms() {
        return kilograms;
    }

    public void setKilograms(float kilograms) {
        this.kilograms = kilograms;
    }

    // methods

    public float poundToKilogram(float pounds) {
        kilograms = (float) (pounds * 0.454);
        return kilograms;
    }       // converts pounds to kilograms

    public float kilogramToPound(float kilograms) {
        pounds = (float) (kilograms / 0.454);
        return pounds;
    }       // converts kilograms to pounds

}
