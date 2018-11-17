public class NumerToConvert {

    private long j;


    public long ConvertNumber (String num){


        // System.out.println(num.length());

        char [] nazwaLiczby = new char[num.length()];
        for ( int i = 0; i < num.length(); i++){
            nazwaLiczby[i] = num.charAt(i);
        }

        switch (nazwaLiczby[0]) {
            case 'j':
                j = 1;
                break;
            case 't':
                j = 3;
                break;
            case 'c':
                j = 4;
                break;
            case 'p':
                j = 5;
                break;
            case 'o':
                j = 8;
                break;
            case 'd':
                if (nazwaLiczby.length==3) {
                    j = 2;
                } else if (nazwaLiczby[4]=='w'){
                    j=9;
                }else if (nazwaLiczby[4]=='s') {
                    j = 10;
                }
                break;
            case 's':
                if (nazwaLiczby[1]=='z'){
                    j = 6;
                }
                if (nazwaLiczby[1]=='i'){
                    j = 7;
                }
            default:
                System.out.println("Nie rozpoznano liczby");

        }
        return j;
    }






}
