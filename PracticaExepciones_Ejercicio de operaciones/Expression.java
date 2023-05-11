import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Expression {
    ArrayList<Element> elementList = new ArrayList<>();

    ArrayList<Character> operatorList = new ArrayList<Character>(Arrays.asList('+', '-', '*', '/'));

    public void reconocer(String character) {

        if (operatorList.contains(character.charAt(0))) {
            setElement(new Operator(character));
        } else if (character.charAt(0) >= 48 && character.charAt(0) <= 57) {
            int num = Integer.parseInt(character);
            setElement(new Num(num));
        } else {
            throw new RuntimeException("El caracter: " + character
                    + " no es un numero o una operacion asociada al programa, intente denuevo con otra expresion");
        }
    }

    public Double evaluar() {
        int i = 0;
        Double result = 0.0;
        while (i < elementList.size()) {
            if (i == 0) {
                Num num = (Num) elementList.get(i);
                result = (double) num.getNum();
                i++;
            }
            Element element = elementList.get(i);
            if (element.getClass().equals(Operator.class)) {
                Operator operator = (Operator) element;
                if (operator.getOperator().equals("+")) {
                    Num num = (Num) elementList.get(i + 1);
                    result = sumar(result, num.getNum());
                }
                if (operator.getOperator().equals("-")) {
                    Num num = (Num) elementList.get(i + 1);
                    result = restar(result, num.getNum());
                }
                if (operator.getOperator().equals("*")) {
                    Num num = (Num) elementList.get(i + 1);
                    result = multiplicar(result, num.getNum());
                }
                if (operator.getOperator().equals("/")) {
                    Num num = (Num) elementList.get(i + 1);
                    result = dividir(result, num.getNum());
                }
                i += 2;
            }
            if (i + 1 >= elementList.size() && i <= elementList.size() - 1) {
                throw new RuntimeException(
                        "La expresion no es valida, el orden de los elementos no esta bien o faltan datos, verifique e intente denuevo");
            }
        }
        return result;
    }

    private void setElement(Element element) {
        elementList.add(element);
    }

    public void clearList() {
        elementList.clear();
    }

    private Double sumar(Double num1, int num2) {
        return num1 + num2;
    }

    private Double restar(Double num1, int num2) {
        return num1 - num2;
    }

    private Double multiplicar(Double num1, int num2) {
        return num1 * num2;
    }

    private Double dividir(Double num1, int num2) {
        if (num2 == 0)
            throw new RuntimeException(
                    "Una division por 0 no se puede realizar, vuelva a intentar con otra expresion");

        return num1 / num2;
    }

}
