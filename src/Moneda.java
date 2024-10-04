public record Moneda(String result, String base_code, String target_code, double conversion_rate, double conversion_result) {

    @Override
    public String toString() {
        return ("La conversion de " + base_code + ", a " + target_code + " Es igual: " + conversion_result);
    }
}
