public enum Season {
    WINTER(-5), SPRING(15), AUTUMN(12), SUMMER(25); //Необязательно писать с большой буквы, но согласно конвенции желательно

    private int temperature;

    Season(int tempurature) {
        this.temperature = tempurature;
    }

    public int getTemperature() {
        return temperature;
    }
}
