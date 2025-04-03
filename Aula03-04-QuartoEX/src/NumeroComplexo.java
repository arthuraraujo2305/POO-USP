public class NumeroComplexo {
    private double real;
    private double imaginario;
    public NumeroComplexo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }
    public double modulo() {
        return Math.sqrt(real * real + imaginario * imaginario);
    }
    public NumeroComplexo adicionar(NumeroComplexo outro) {
        return new NumeroComplexo(this.real + outro.real, this.imaginario + outro.imaginario);
    }
    public NumeroComplexo multiplicar(NumeroComplexo outro) {
        return new NumeroComplexo(this.real * outro.real - this.imaginario * outro.imaginario,
                this.real * outro.imaginario + this.imaginario * outro.real);
    }
    @Override
    public String toString() {
        return String.format("%.1f %s %.1fi",
                real,
                (imaginario >= 0 ? "+" : "-"),
                Math.abs(imaginario));
    }
    //getters
    public double getReal() {
        return real;
    }
    public double getImaginario() {
        return imaginario;
    }
}
