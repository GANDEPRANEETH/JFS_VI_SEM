
class Main{
    public static void main(String arg[]) {
        int result = 0;
        int a = Integer.parseInt(arg[0]);
        int b = Integer.parseInt(arg[1]);
        switch (arg[2]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "s":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;

        }
        System.out.println("ans"+result);
    }

}
