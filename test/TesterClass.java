package test;



public class TesterClass {

    public static void testInt(){

        int a=7,b=2,c=0;

        c=a+b;
        System.out.println("a + b = "+ c); //addition

        c=a-b;
        System.out.println("a - b = "+c); //substraction

        c=a*b;
        System.out.println("a * b = "+c); //multiplication

        c=a/b;
        System.out.println("a / b = "+c);//division

        c=a%b;
        System.out.println("a % b = "+c);//modulus

        c=-a;
        System.out.println("-a = "+c);//unary minus

        c=+a;
        System.out.println("+a = "+c);//unary plus

        System.out.println("++7 = "+ ++a);//prefix increment

        a=7;
        System.out.println("7++ = " + a++);//postfix increment

        System.out.println("a = "+a);

        a=6;
        System.out.println("--6 = "+ --a);//prefix decrement

        a=5;
        System.out.println("5-- = "+ a--);//postfix decrement

        a=7;

        System.out.println("\n***** Bitwise Operators *****");


        //bitwise AND
        c = a & b;

        System.out.println("7 & 2 = "+c);

        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise OR

        c=a | b;

        System.out.println("7 | 2 = "+c);

        System.out.println("in binary form:");

        System.out.println( Integer.toBinaryString(a) + " | "+
                Integer.toBinaryString(b) + " = "+ Integer.toBinaryString(c));


        //bitwise XoR

        c=a^b;

        System.out.println("7 ^ 2 = " + c);

        System.out.println("in binary form:");
        System.out.println( Integer.toBinaryString(a) + " ^ "+
                Integer.toBinaryString(b) + " = "+ Integer.toBinaryString(c));

        //NOT

        c=~a;
        System.out.println("~7 =  " + c);

        System.out.println("in binary form:");

        System.out.println("~"+ Integer.toBinaryString(a) + " = " +
                        Integer.toBinaryString(c)
                );

        //Left shift

        a=7;

        c=a<<1;
        System.out.println("7 << 1 = " + c);

        System.out.println("in binary form:");
        System.out.println(Integer.toBinaryString(a) + " << " + 1 + " = " + Integer.toBinaryString(c));

        //Right shift

        c=a>>1;
        System.out.println("7 >> 1 = " + c);

        System.out.println("in binary form:");
        System.out.println(Integer.toBinaryString(a) + " >> " + 1 + " = " + Integer.toBinaryString(c));

        a=-7;
        c=a>>1;//right shift
        System.out.println("-7 >> 1 = " + c);

        System.out.println("in binary form:");
        System.out.println(Integer.toBinaryString(a) + " >> " + 1 + " = " + Integer.toBinaryString(c));

        a=8;
        c=a>>>1; //zero fill right shift
        System.out.println("8 >>> 1 = " + c);

        System.out.println("in binary form:");
        System.out.println(Integer.toBinaryString(a) + " >>> " + 1 + " = " + Integer.toBinaryString(c));

        a=-7;
        c=a>>>1; //zero fill right shift
        System.out.println("-7 >>> 1 = " + c);

        System.out.println("in binary form:");
        System.out.println(Integer.toBinaryString(a) + " >>> " + 1 + " = " + Integer.toBinaryString(c));


        System.out.println("\n***** Assignment Operators *****");

        a=3;
        c=7;

        System.out.println("7 += 3 --> c = " + (c+=a));
        c=7;

        System.out.println("7 -= 3 --> c = " + (c-=a));
        c=7;

        System.out.println("7 *= 3 --> c = " + (c*=a));
        c=7;

        System.out.println("7 /= 3 --> c = " + (c/=a));
        c=7;

        System.out.println("7 %= 3 --> c = " + (c%=a));

        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception


        c=7;
        c|=a;
        System.out.println("7 |= 3 --> "+c);

        c=7;
        c&=a;

        System.out.println("7 &= 3 --> "+c);

        c=7;
        c^=a;

        System.out.println("7 ^= 3 --> "+c);

        c=7;
        c>>=1;

        System.out.println("7 >>= 1 --> "+c);

        c=7;
        c<<=1;

        System.out.println("7 <<= 1 --> "+c);

        c=7;
        c>>>=1;

        System.out.println("7 >>>= 1 --> "+c);

        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.println("3 > 2 --> "+ (a>b));
        // greater than or equal to
        System.out.println("3 >= 2 --> "+ (a>=b));
        // less than
        System.out.println("3 < 2 --> "+(a<b));
        // less than or equal to
        System.out.println("3 <= 2 --> "+(a<=b));
        // equal to
        System.out.println("3 == 2 --> "+ (a==b));
        // not equal to
        System.out.println("3 != 2 --> "+ (a!=b));

        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.println("(3>2) && (3>0) --> " +  ((a>b)&&(a>0)));
        System.out.println("(3>2) & (3>0) --> " + ((a>b)&(a>0)));

        // logical OR
        System.out.println("(3>=2) || (2!=0) --> " + ((a>=b) || (b!=0) ));

        System.out.println("(3>=2) | (2=0) --> " + ((a>=b) | (b==0)));

        // logical XOR
        System.out.println("(3>=2) ^ (2!=0) --> "+ ((a >= b) ^ (b != 0)));

        //logical NOT
        System.out.println("!(3>=2) --> "+ !(a >= b));

        System.out.println("\n***** Misc Operators *****");

        //conditional operator
        System.out.println("3 < 2 ? -- > " +( a < b ? true:false));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long lt = 100000000000000000L;
        float ft = 2.9f;
        double dt = 123456789.625;
        boolean bool = true;

        System.out.println(" int = byte " + (c=bt));
        System.out.println(" int  = short " + (c=sh));
        System.out.println(" int = char " + (c=ch));
        System.out.println(" int = long " + ( c=(int)lt));
        System.out.println(" int = float " + (c=(int)ft));
        System.out.println(" int = double " + (c=(int)dt));

        //c=(int)bool;-->can not compare bool-int
        System.out.println("Can't cast int to bool");

        }

    public static void testBoolean(){

        boolean a=true; boolean b=false; boolean c;

        System.out.println("\n***** Arithmetical Operators *****");

        // c = a + b; // addition
        // c = a - b; // subtraction
        // c = a * b; // multiplication
        // c = a / b; // division
        // c = a % b; // modulus
        // c = -a; // unary minus
        // c = +a; // unary plus
        // c = ++a; // prefix increment
        // c = a++; // postfix increment
        // c = --a; // prefix decrement
        // c = a--; // postfix decrement

        System.out.println("There are no one arithmetical operations with boolean type(only true or false");

        System.out.println("\n***** Bitwise Operators *****");

        c=a&b;
        System.out.println("true & false --> "+c);//bitwise and

        c=a|b;
        System.out.println("true | false --> "+c);//bitwise or

        c=a^b;
        System.out.println("true ^ false --> "+c); //bitwise xor

//        c=~a; can't
//        c = a<<1; can't
//        c=a>>>2; can't
//        c=a>>1; can't


        System.out.println("\n***** Assignment Operators *****");

        System.out.println("true |= true --> " +(c|=a));
        System.out.println("true &= true --> " +(c&=a));
        System.out.println("true ^= true --> " +(c^=a));

        // c += a;
        // c -= a;
        // c *= a;
        // c /= a;
        // c %= a;
        // c >>= 1;
        // c <<= 1;
        // c >>>= 1;

        System.out.println("\n***** Relational Operators *****");

        System.out.println(a==b);
        System.out.println(a!=b);

        // c = a > b; // greater than
        // c = a >= b; // greater than or equal to
        // c = a < b; // less than
        // c = a <= b; // less than or equal to

        System.out.println("\n***** Logical Operations *****");
        //logical and
        System.out.println("true && false --> " + (a&&b));
        //logical or
        System.out.println("true || false --> " + (a||b));
        //logical xor
        System.out.println("true ^ false --> " + (a^b));
        //logical not
        System.out.println("!true --> "+ (!a));

        System.out.println("\n***** Misc Operators *****");

        //condition operations

        System.out.println(" false? --> " +(c?a:b));

        //type cast operators
        System.out.println(" true=false " +(a=b));

        // byte bt = 1;
        // short sh = -32000;
        // char ch = '\u0002';
        // long l = 100000000000000000L;
        // float f = 1.9f;
        // double d = 123456789.625;
        //c = (boolean) bt;
        //c = (boolean) sh;
        //c = (boolean) ch;
        //c = (boolean) l;
        //c = (boolean) f;
        //c = (boolean) d;
        }

    public static void testDouble(){

            double a=7231.2,b=222.1,c=0;

            c=a+b;
            System.out.println("7231.2 + 222.1 = "+ c); //addition

            c=a-b;
            System.out.println("7231.2 - 222.1 = "+c); //substraction

            c=a*b;
            System.out.println("7231.2 * 222.1 = "+c); //multiplication

            c=a/b;
            System.out.println("7231.2 / 222.1 = "+c);//division

            c=a%b;
            System.out.println("7231.2 % 222.1 = "+c);//modulus

            c=-a;
            System.out.println("-7231.2 = "+c);//unary minus

            c=+a;
            System.out.println("+7231.2 = "+c);//unary plus

            System.out.println("++7231.2 = "+ ++a);//prefix increment

            a=7.1232;
            System.out.println("7.1232++ = " + a++);//postfix increment

            System.out.println("a = "+a);

            a=6.12321;
            System.out.println("--6.12321 = "+ --a);//prefix decrement

            a=5.2122;
            System.out.println("5.2122-- = "+ a--);//postfix decrement


            System.out.println("\n***** Bitwise Operators *****");
            System.out.println("Bitwise operators can't apply to double");
            a=7.1211;
//            //bitwise AND
//            c = a & b;
//            System.out.println("7 & 2 = "+c);
//            //bitwise OR
//            c=a | b;
//            System.out.println("7 | 2 = "+c);
//            //bitwise XoR
//            c=a^b;
//            System.out.println("7 ^ 2 = " + c);
//            //NOT
//            c=~a;
//            System.out.println("~7 =  " + c);
//            //Left shift
//            a=7.212;
//            c=a<<1;
//            System.out.println("7 << 1 = " + c);
//            //Right shift
//            c=a>>1;
//            System.out.println("7 >> 1 = " + c);
//            a=-7;
//            c=a>>1;//right shift
//            System.out.println("-7 >> 1 = " + c);
//            a=8.21;
//            c=a>>>1; //zero fill right shift
//            System.out.println("8 >>> 1 = " + c);
//            a=-7.21;
//            c=a>>>1; //zero fill right shift
//            System.out.println("-7 >>> 1 = " + c);

            System.out.println("\n***** Assignment Operators *****");
            a=3.21;
            c=7.3211;
            System.out.println("7.3211 += 3.21 --> c = " + (c+=a));
            c=7.3211;

            System.out.println("7.3211 -= 3.21 --> c = " + (c-=a));
            c=7.3211;

            System.out.println("7.3211 *= 3.21 --> c = " + (c*=a));
            c=7.3211;

            System.out.println("7.3211 /= 3.21 --> c = " + (c/=a));
            c=7.3211;

            System.out.println("7.3211 %= 3.21 --> c = " + (c%=a));

            System.out.println("7.3211 %= 0. -->  " +(c %= 0.));
            c=7.3211;
            System.out.println("7.3211 /= 0 ---> " + (c /= 0));

            System.out.println("Bitwise operators can't apply to double");

//            c=7.211;
//            c|=a;
//            System.out.println("7.211 |= 3.21 --> "+c);
//
//            c=7.211;
//            c&=a;
//
//            System.out.println("7.211 &= 3.21 --> "+c);
//
//            c=7.211;
//            c^=a;
//
//            System.out.println("7.211 ^= 3.21 --> "+c);
//
//            c=7.211;
//            c>>=1;
//
//            System.out.println("7.211 >>= 1 --> "+c);
//
//            c=7.211;
//            c<<=1;
//
//            System.out.println("7.211 <<= 1 --> "+c);
//
//            c=7.211;
//            c>>>=1;
//
//            System.out.println("7.211 >>>= 1 --> "+c);

            System.out.println("\n***** Relational Operators *****");
            a=142.1231;
            b=123.2123;

            // greater than
            System.out.println("142.1231 > 123.2123 --> "+ (a>b));
            // greater than or equal to
            System.out.println("142.1231 >= 123.2123 --> "+ (a>=b));
            // less than
            System.out.println("142.1231 < 123.2123 --> "+(a<b));
            // less than or equal to
            System.out.println("142.1231 <= 123.2123 --> "+(a<=b));
            // equal to
            System.out.println("142.1231 == 123.2123 --> "+ (a==b));
            // not equal to
            System.out.println("142.1231 != 123.2123 --> "+ (a!=b));

            System.out.println("\n***** Logical Operations *****");

            // logical AND
            System.out.println("(142.123>123.2123) && (142.123>0) --> " +  ((a>b)&&(a>0)));
            System.out.println("(142.123>123.2123) & (142.123>0) --> " + ((a>b)&(a>0)));

            // logical OR
            System.out.println("(142.123>=123.2123) || (123.2123!=0) --> " + ((a>=b) || (b!=0) ));

            System.out.println("(142.123>=123.2123) | (123.2123=0) --> " + ((a>=b) | (b==0)));

            // logical XOR
            System.out.println("(142.123>=123.2123) ^ (123.2123!=0) --> "+ ((a >= b) ^ (b != 0)));

            //logical NOT
            System.out.println("!(142.123>=123.2123) --> "+ !(a >= b));

            System.out.println("\n***** Misc Operators *****");

            //conditional operator
            System.out.println("3 < 2 ? -- > " +( a < b ? true:false));

            System.out.println("\nType Cast Operator:");
            c=723122.211;
            byte bt = 1;
            short sh = -32000;
            char ch = '\u0002';
            long lt = 100000000000000000L;
            float ft = 2.9f;
            double dt = 123456789.625;
            boolean bool = true;
            int itype =27;

            System.out.println(" double = byte " + (c=bt));
            System.out.println(" double  = short " + (c=sh));
            System.out.println(" double = char " + (c=ch));
            System.out.println(" double = long " + (c=lt) ) ;
            System.out.println(" double = float " + (c=ft));
            System.out.println(" double = double " + (c=dt));
            System.out.println(" double = int " + (c=itype));
            //c=(double)bool;-->can not cast bool-double
            System.out.println("Can't cast double to bool");

        }

    public static void testShort(){


        short a=15223,b=11127;
        short c =0;

        c=(short)(a+b);

        System.out.println("a + b = "+ a+b); //addition

        c=(short)(a-b);
        System.out.println("a - b = "+c); //substraction

        c=(short)(a*b);
        System.out.println("a * b = "+c); //multiplication

        c=(short)(a/b);
        System.out.println("a / b = "+c);//division

        c=(short)(a%b);
        System.out.println("a % b = "+c);//modulus

        c=(short)(-a);
        System.out.println("-a = "+c);//unary minus

        c=(short)(+a);
        System.out.println("+a = "+c);//unary plus

        a=7211;

        System.out.println("++7211 = "+ ++a);//prefix increment

        a=7211;
        System.out.println("7211++ = " + a++);//postfix increment



        a=6251;
        System.out.println("--6251 = "+ --a);//prefix decrement

        a=5554;
        System.out.println("5554-- = "+ a--);//postfix decrement



        System.out.println("\n***** Bitwise Operators *****");

        a=26671;
        b=21232;
        //bitwise AND
        c = (short)(a & b);

        System.out.println("26671 & 21232 "+c);

        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise OR

        c=(short)(a | b);
        System.out.println("26671 | 21232 = "+c);
        System.out.println("in binary form:");
        System.out.println( Integer.toBinaryString(a) + " | "+
                Integer.toBinaryString(b) + " = "+ Integer.toBinaryString(c));

        //bitwise XoR

        c=(short)(a^b);
        System.out.println("26671 ^ 21232 = " + c);
        System.out.println("in binary form:");
        System.out.println( Integer.toBinaryString(a) + " ^ "+
                Integer.toBinaryString(b) + " = "+ Integer.toBinaryString(c));

        //NOT

        c=(short)(~a);
        System.out.println("~26671 =  " + c);
        System.out.println("in binary form:");
        System.out.println("~"+ Integer.toBinaryString(a) + " = " +
                Integer.toBinaryString(c)
        );

        //Left shift

        a=26671;
        c=(short)(a<<1);
        System.out.println("26671 << 21232 = " + c);
        System.out.println("in binary form:");
        System.out.println(Integer.toBinaryString(a) + " << " + 1 + " = " + Integer.toBinaryString(c));

        //Right shift

        c=(short)(a>>1);
        System.out.println("26671 >> 21232 = " + c);
        System.out.println("in binary form:");
        System.out.println(Integer.toBinaryString(a) + " >> " + 1 + " = " + Integer.toBinaryString(c));

        a=-26671;
        c=(short)(a>>1);//right shift
        System.out.println("-26671 >> 1 = " + c);

        System.out.println("in binary form:");
        System.out.println(Integer.toBinaryString(a) + " >> " + 1 + " = " + Integer.toBinaryString(c));

        a=23671;
        c=(short)(a>>>1); //zero fill right shift
        System.out.println("23671 >>> 1 = " + c);

        System.out.println("in binary form:");
        System.out.println(Integer.toBinaryString(a) + " >>> " + 1 + " = " + Integer.toBinaryString(c));

        a=-20671;
        c=(short)(a>>>1); //zero fill right shift
        System.out.println("-20671 >>> 1 = " + c);

        System.out.println("in binary form:");
        System.out.println(Integer.toBinaryString(a) + " >>> " + 1 + " = " + Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");

        a=9000;
        c=17000;

        System.out.println("17000 += 9000 --> c = " + (c+=a));
        c=17000;

        System.out.println("17000 -= 9000 --> c = " + (c-=a));
        c=17000;

        System.out.println("17000 *= 9000 --> c = " + (c*=a));
        c=17000;

        System.out.println("17000 /= 9000 --> c = " + (c/=a));
        c=17000;

        System.out.println("17000 %= 9000 --> c = " + (c%=a));

//        System.out.println(c %= 0);arithmetical esception
//        System.out.println(c /= 0);

        c=7000;
        c|=a;
        System.out.println("7000 |= 32000 --> "+c);

        c=7000;
        c&=a;

        System.out.println("7000 &= 32000 --> "+c);

        c=7000;
        c^=a;

        System.out.println("7000 ^= 32000 --> "+c);

        c=7000;
        c>>=1;

        System.out.println("7000 >>= 1 --> "+c);

        c=7000;
        c<<=1;

        System.out.println("7000 <<= 1 --> "+c);

        c=7000;
        c>>>=1;

        System.out.println("7000 >>>= 1 --> "+c);

        System.out.println("\n***** Relational Operators *****");

        a=25000;
        b=17000;

        // greater than
        System.out.println("25000 > 17000 --> "+ (a>b));
        // greater than or equal to
        System.out.println("25000 >= 17000 --> "+ (a>=b));
        // less than
        System.out.println("25000 < 17000 --> "+(a<b));
        // less than or equal to
        System.out.println("25000 <= 17000 --> "+(a<=b));
        // equal to
        System.out.println("25000 == 17000 --> "+ (a==b));
        // not equal to
        System.out.println("25000 != 17000 --> "+ (a!=b));

        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.println("(25000>17000) && (25000>0) --> " +  ((a>b)&&(a>0)));
        System.out.println("(25000>17000) & (25000>0) --> " + ((a>b)&(a>0)));

        // logical OR
        System.out.println("(25000>=17000) || (17000!=0) --> " + ((a>=b) || (b!=0) ));

        System.out.println("(25000>=17000) | (17000=0) --> " + ((a>=b) | (b==0)));

        // logical XOR
        System.out.println("(25000>=17000) ^ (17000!=0) --> "+ ((a >= b) ^ (b != 0)));

        //logical NOT
        System.out.println("!(25000>=17000) --> "+ !(a >= b));

        System.out.println("\n***** Misc Operators *****");

        //conditional operator
        System.out.println("25000 < 17000 ? -- > " +( a < b ? true:false));

        System.out.println("\nType Cast Operator:");

        c=14000;
        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long lt = 100000000000000000L;
        float ft = 2.9f;
        double dt = 123.625;
        boolean bool = true;
        int itype=25;

        System.out.println(" short = byte " + (c=bt));
        System.out.println(" short  = short " + (c=sh));
        System.out.println(" short = char " + (c=(short)ch));
        System.out.println(" short = long " + (c=(short)lt));
        System.out.println(" short = float " + (c=(short)ft));
        System.out.println(" short = double " + (c=(short)dt));
        System.out.println(" short = int " + (c=(short)itype));

        //c=(short)bool;-->can not compare bool-short
        System.out.println("Can't cast short to bool");
    }

    public static void testByte(){

        byte a=111,b=28,c=0;

        c=(byte)(a+b);
        System.out.println("a + b = "+ c); //addition

        c=(byte)(a-b);
        System.out.println("a - b = "+c); //substraction

        c=(byte)(a*b);
        System.out.println("a * b = "+c); //multiplication

        c=(byte)(a/b);
        System.out.println("a / b = "+c);//division

        c=(byte)(a%b);
        System.out.println("a % b = "+c);//modulus

        c=(byte)-a;
        System.out.println("-a = "+c);//unary minus

        c=(byte)+a;
        System.out.println("+a = "+c);//unary plus

        System.out.println("++111 = "+ ++a);//prefix increment

        a=111;
        System.out.println("111++ = " + a++);//postfix increment

        System.out.println("a = "+a);

        a=111;
        System.out.println("--111 = "+ --a);//prefix decrement

        a=111;
        System.out.println("111-- = "+ a--);//postfix decrement

        a=111;

        System.out.println("\n***** Bitwise Operators *****");


        //bitwise AND
        c=16;
        a=110;
        b=60;

        c = (byte)(a & b);

        System.out.println("110 & 60 "+c);

        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(b), Integer.toBinaryString(c));

        //bitwise OR

        c=(byte)(a | b);

        System.out.println("110 | 60 = "+c);

        System.out.println("in binary form:");

        System.out.println( Integer.toBinaryString(a) + " | "+
                Integer.toBinaryString(b) + " = "+ Integer.toBinaryString(c));


        //bitwise XoR

        c=(byte)(a^b);

        System.out.println("110 ^ 60 = " + c);

        System.out.println("in binary form:");
        System.out.println( Integer.toBinaryString(a) + " ^ "+
                Integer.toBinaryString(b) + " = "+ Integer.toBinaryString(c));

        //NOT

        c=(byte)~a;
        System.out.println("~110 =  " + c);

        System.out.println("in binary form:");

        System.out.println("~"+ Integer.toBinaryString(a) + " = " +
                Integer.toBinaryString(c)
        );

        //Left shift

        a=76;

        c=(byte)(a<<1);
        System.out.println("76 << 1 = " + c);

        System.out.println("in binary form:");
        System.out.println(Integer.toBinaryString(a) + " << " + 1 + " = " + Integer.toBinaryString(c));

        //Right shift

        c=(byte)(a>>1);
        System.out.println("76 >> 1 = " + c);

        System.out.println("in binary form:");
        System.out.println(Integer.toBinaryString(a) + " >> " + 1 + " = " + Integer.toBinaryString(c));

        a=-79;
        c=(byte)(a>>1);//right shift
        System.out.println("-79 >> 1 = " + c);

        System.out.println("in binary form:");
        System.out.println(Integer.toBinaryString(a) + " >> " + 1 + " = " + Integer.toBinaryString(c));

        a=85;
        c=(byte)(a>>>1); //zero fill right shift
        System.out.println("85 >>> 1 = " + c);

        System.out.println("in binary form:");
        System.out.println(Integer.toBinaryString(a) + " >>> " + 1 + " = " + Integer.toBinaryString(c));

        a=-73;
        c=(byte)(a>>>1); //zero fill right shift
        System.out.println("-73 >>> 1 = " + c);

        System.out.println("in binary form:");
        System.out.println(Integer.toBinaryString(a) + " >>> " + 1 + " = " + Integer.toBinaryString(c));


        System.out.println("\n***** Assignment Operators *****");

        a=32;
        c=71;

        System.out.println("71 += 32 --> c = " + (c+=a));
        c=71;

        System.out.println("71 -= 32 --> c = " + (c-=a));
        c=71;

        System.out.println("71 *= 32 --> c = " + (c*=a));
        c=71;

        System.out.println("71 /= 32 --> c = " + (c/=a));
        c=71;

        System.out.println("71 %= 32 --> c = " + (c%=a));

        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception


        c=73;
        a=31;
        c|=a;
        System.out.println("73 |= 31 --> "+c);

        c=73;
        c&=a;

        System.out.println("73 &= 31 --> "+c);

        c=73;
        c^=a;

        System.out.println("73 ^= 31 --> "+c);

        c=73;
        c>>=1;

        System.out.println("73 >>= 1 --> "+c);

        c=73;
        c<<=1;

        System.out.println("73 <<= 1 --> "+c);

        c=73;
        c>>>=1;

        System.out.println("73 >>>= 1 --> "+c);

        System.out.println("\n***** Relational Operators *****");

        a=65;
        b=75;
        // greater than
        System.out.println("65 > 75 --> "+ (a>b));
        // greater than or equal to
        System.out.println("65 >= 75 --> "+ (a>=b));
        // less than
        System.out.println("65 < 75 --> "+(a<b));
        // less than or equal to
        System.out.println("65 <= 75 --> "+(a<=b));
        // equal to
        System.out.println("65 == 75 --> "+ (a==b));
        // not equal to
        System.out.println("65 != 75 --> "+ (a!=b));

        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.println("(65>75) && (65>0) --> " +  ((a>b)&&(a>0)));
        System.out.println("(65>75) & (65>0) --> " + ((a>b)&(a>0)));

        // logical OR
        System.out.println("(65>=75) || (75!=0) --> " + ((a>=b) || (b!=0) ));

        System.out.println("(65>=75) | (75=0) --> " + ((a>=b) | (b==0)));

        // logical XOR
        System.out.println("(65>=75) ^ (75!=0) --> "+ ((a >= b) ^ (b != 0)));

        //logical NOT
        System.out.println("!(65>=75) --> "+ !(a >= b));

        System.out.println("\n***** Misc Operators *****");

        //conditional operator
        System.out.println("65 < 75 ? -- > " +( a < b ? true:false));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long lt = 1000000000000000L;
        float ft = 2.9f;
        double dt = 123456789.625;
        boolean bool = true;
        int itype = 25;

        System.out.println(" byte = byte " + (c=bt));
        System.out.println(" byte = short " + (c=(byte)sh));
        System.out.println(" byte = char " + (c=(byte)ch));
        System.out.println(" byte = long " + ( c=(byte)lt));
        System.out.println(" byte = float " + (c=(byte)ft));
        System.out.println(" byte = double " + (c=(byte)dt));
        System.out.println(" byte = int " + (c=(byte)itype));

        //c=(byte)bool;-->can not compare bool-byte
        System.out.println("Can't cast byte to bool");


    }

    public static void testFloat(){
        float a=9.23f ,b=3.123f,c;

        System.out.println("**************Test Float**************");
        System.out.println();

        c=a+b;
        System.out.println("9.23 + 3.123 = "+ c); //addition

        c=a-b;
        System.out.println("9.23 - 3.123 = "+c); //substraction

        c=a*b;
        System.out.println("9.23 * 3.123 = "+c); //multiplication

        c=a/b;
        System.out.println("9.23 / 3.123 = "+c);//division

        c=a%b;
        System.out.println("9.23 % 3.123 = "+c);//modulus

        c=-a;
        System.out.println("-9.23 = "+c);//unary minus

        c=+a;
        System.out.println("+9.23 = "+c);//unary plus

        System.out.println("++9.23 = "+ ++a);//prefix increment

        a=7.21f;
        System.out.println("7.21++ = " + a++);//postfix increment

        System.out.println("a = "+a);

        a=6.87f;
        System.out.println("--6.87 = "+ --a);//prefix decrement

        a=5.44f;
        System.out.println("5.44-- = "+ a--);//postfix decrement


        System.out.println("\n***** Bitwise Operators *****");
        System.out.println("Bitwise operators can't be applied to float type");

//        //bitwise AND
//        c = a & b;
//        System.out.println("7 & 2 = "+c);
//        //bitwise OR
//        c=a | b;
//        System.out.println("7 | 2 = "+c);
//        System.out.println("in binary form:");
//        //bitwise XoR
//        c=a^b;
//        System.out.println("7 ^ 2 = " + c);
//        //NOT
//        c=~a;
//        System.out.println("~7 =  " + c);
//        //Left shift
//        a=7;
//        c=a<<1;
//        System.out.println("7 << 1 = " + c);
//        System.out.println("in binary form:");
//        System.out.println(Integer.toBinaryString(a) + " << " + 1 + " = " + Integer.toBinaryString(c));
//        //Right shift
//        c=a>>1;
//        System.out.println("7 >> 1 = " + c);
//        a=-7;
//        c=a>>1;//right shift
//        System.out.println("-7 >> 1 = " + c);
//        a=8;
//        c=a>>>1; //zero fill right shift
//        System.out.println("8 >>> 1 = " + c);
//        a=-7;
//        c=a>>>1; //zero fill right shift
//        System.out.println("-7 >>> 1 = " + c);

        System.out.println("\n***** Assignment Operators *****");

        a=3.23f;
        c=7.22f;

        System.out.println("7.22 += 3.23 --> c = " + (c+=a));
        c=7.22f;

        System.out.println("7.22 -= 3.23 --> c = " + (c-=a));
        c=7.22f;

        System.out.println("7.22 *= 3.23 --> c = " + (c*=a));
        c=7.22f;

        System.out.println("7.22 /= 3.23 --> c = " + (c/=a));
        c=7.22f;

        System.out.println("7.22 %= 3.23 --> c = " + (c%=a));

        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.println("Bitwise operators can't be applied to float type");
//
//        c=7;
//        c|=a;
//        System.out.println("7 |= 3 --> "+c);
//        c=7;
//        c&=a;
//        System.out.println("7 &= 3 --> "+c);
//        c=7;
//        c^=a;
//        System.out.println("7 ^= 3 --> "+c);
//        c=7;
//        c>>=1;
//        System.out.println("7 >>= 1 --> "+c);
//        c=7;
//        c<<=1;
//        System.out.println("7 <<= 1 --> "+c);
//        c=7;
//        c>>>=1;
//        System.out.println("7 >>>= 1 --> "+c);

        System.out.println("\n***** Relational Operators *****");
        a=6.23f;
        b=2.2221f;

        // greater than
        System.out.println("6.23 > 2.2221 --> "+ (a>b));
        // greater than or equal to
        System.out.println("6.23 >= 2.2221 --> "+ (a>=b));
        // less than
        System.out.println("6.23 < 2.2221 --> "+(a<b));
        // less than or equal to
        System.out.println("6.23 <= 2.2221 --> "+(a<=b));
        // equal to
        System.out.println("6.23 == 2.2221 --> "+ (a==b));
        // not equal to
        System.out.println("6.23 != 2.2221 --> "+ (a!=b));

        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.println("(6.23>2.2221) && (6.23>0) --> " +  ((a>b)&&(a>0)));
        System.out.println("(6.23>2.2221) & (6.23>0) --> " + ((a>b)&(a>0)));

        // logical OR
        System.out.println("(6.23>=2.2221) || (2.2221!=0) --> " + ((a>=b) || (b!=0) ));

        System.out.println("(6.23>=2.2221) | (2.2221=0) --> " + ((a>=b) | (b==0)));

        // logical XOR
        System.out.println("(6.23>=2.2221) ^ (2.2221!=0) --> "+ ((a >= b) ^ (b != 0)));

        //logical NOT
        System.out.println("!(6.23>=2.2221) --> "+ !(a >= b));

        System.out.println("\n***** Misc Operators *****");

        //conditional operator
        System.out.println("6.23 > 2.2221 ? -- > " +( a > b ? true:false));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long lt = 100000000000000000L;
        float ft = 2.9f;
        double dt = 123456789.625;
        boolean bool = true;
        int itype = 27;

        System.out.println(" float = byte " + (c=bt));
        System.out.println(" float  = short " + (c=sh));
        System.out.println(" float = char " + (c=ch));
        System.out.println(" float = long " + ( c=lt));
        System.out.println(" float = float " + (c=ft));
        System.out.println(" float = double " + (c=(float)dt));
        System.out.println(" float = double " + (c=itype));

        //c=(float)bool;-->can not compare bool-float
        System.out.println("Can't cast float to bool");



    }

    public static void testLong(){

        System.out.println("*************************TestLong*************************");
        long a=745988887l,b=2112123l,c;

        c=a+b;
        System.out.println("a + b = "+ c); //addition

        c=a-b;
        System.out.println("a - b = "+c); //substraction

        c=a*b;
        System.out.println("a * b = "+c); //multiplication

        c=a/b;
        System.out.println("a / b = "+c);//division

        c=a%b;
        System.out.println("a % b = "+c);//modulus

        c=-a;
        System.out.println("-a = "+c);//unary minus

        c=+a;
        System.out.println("+a = "+c);//unary plus

        System.out.println("++7 = "+ ++a);//prefix increment

        a=7123123l;
        System.out.println("7123123l++ = " + a++);//postfix increment

        System.out.println("a = "+a);

        a=6121211l;
        System.out.println("--6121211l = "+ --a);//prefix decrement

        a=51231l;
        System.out.println("51231l-- = "+ a--);//postfix decrement



        System.out.println("\n***** Bitwise Operators *****");
        a=764432l;
        b=23111l;
        //bitwise AND

        c = a & b;

        System.out.println("764432l & 23111l = "+c);

        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Long.toBinaryString(a),
                Long.toBinaryString(b), Long.toBinaryString(c));

        //bitwise OR

        c=a | b;

        System.out.println("764432l | 23111l = "+c);

        System.out.println("in binary form:");

        System.out.println( Long.toBinaryString(a) + " | "+
                Long.toBinaryString(b) + " = "+ Long.toBinaryString(c));


        //bitwise XoR

        c=a^b;

        System.out.println("764432l ^ 23111l = " + c);

        System.out.println("in binary form:");
        System.out.println( Long.toBinaryString(a) + " ^ "+
                Long.toBinaryString(b) + " = "+ Long.toBinaryString(c));

        //NOT

        c=~a;
        System.out.println("~764432l =  " + c);

        System.out.println("in binary form:");

        System.out.println("~"+ Long.toBinaryString(a) + " = " +
                Long.toBinaryString(c)
        );

        //Left shift

        a=764432l;

        c=a<<1;
        System.out.println("764432l << 1 = " + c);

        System.out.println("in binary form:");
        System.out.println(Long.toBinaryString(a) + " << " + 1 + " = " + Long.toBinaryString(c));

        //Right shift

        c=a>>1;
        System.out.println("764432l >> 1 = " + c);

        System.out.println("in binary form:");
        System.out.println(Long.toBinaryString(a) + " >> " + 1 + " = " + Long.toBinaryString(c));

        a=-764432l;
        c=a>>1;//right shift
        System.out.println("-764432l >> 1 = " + c);

        System.out.println("in binary form:");
        System.out.println(Long.toBinaryString(a) + " >> " + 1 + " = " + Long.toBinaryString(c));

        a=82121l;
        c=a>>>1; //zero fill right shift
        System.out.println("82121l >>> 1 = " + c);

        System.out.println("in binary form:");
        System.out.println(Long.toBinaryString(a) + " >>> " + 1 + " = " + Long.toBinaryString(c));

        a=-71212222l;
        c=a>>>1; //zero fill right shift
        System.out.println("-71212222l >>> 1 = " + c);

        System.out.println("in binary form:");
        System.out.println(Long.toBinaryString(a) + " >>> " + 1 + " = " + Long.toBinaryString(c));


        System.out.println("\n***** Assignment Operators *****");

        a=32131231l;
        c=72123556l;

        System.out.println("72123556l += 32131231l --> c = " + (c+=a));
        c=72123556l;

        System.out.println("72123556l -= 32131231l --> c = " + (c-=a));
        c=72123556l;

        System.out.println("72123556l *= 32131231l --> c = " + (c*=a));
        c=72123556l;

        System.out.println("72123556l /= 32131231l --> c = " + (c/=a));
        c=72123556l;

        System.out.println("72123556l %= 32131231l --> c = " + (c%=a));

        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception


        c=72123556l;
        c|=a;
        System.out.println("72123556l |= 32131231l --> "+c);

        c=72123556l;
        c&=a;

        System.out.println("72123556l &= 32131231l --> "+c);

        c=72123556l;
        c^=a;

        System.out.println("72123556l ^= 32131231l --> "+c);

        c=72123556l;
        c>>=1;

        System.out.println("7 >>= 1 --> "+c);

        c=72123556l;
        c<<=1;

        System.out.println("72123556l <<= 1 --> "+c);

        c=72123556l;
        c>>>=1;

        System.out.println("72123556l >>>= 1 --> "+c);

        System.out.println("\n***** Relational Operators *****");

        a=82221l;
        b=21123l;

        // greater than
        System.out.println("82221l > 21123l --> "+ (a>b));
        // greater than or equal to
        System.out.println("82221l >= 21123l --> "+ (a>=b));
        // less than
        System.out.println("82221l < 21123l --> "+(a<b));
        // less than or equal to
        System.out.println("82221l <= 21123l --> "+(a<=b));
        // equal to
        System.out.println("82221l == 21123l --> "+ (a==b));
        // not equal to
        System.out.println("82221l != 21123l --> "+ (a!=b));

        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.println("(82221l>2) && (82221l>0) --> " +  ((a>b)&&(a>0)));
        System.out.println("(82221l>2) & (82221l>0) --> " + ((a>b)&(a>0)));

        // logical OR
        System.out.println("(82221l>=2) || (21123l!=0) --> " + ((a>=b) || (b!=0) ));

        System.out.println("(82221l>=2) | (21123l=0) --> " + ((a>=b) | (b==0)));

        // logical XOR
        System.out.println("(82221l>=2) ^ (21123l!=0) --> "+ ((a >= b) ^ (b != 0)));

        //logical NOT
        System.out.println("!(82221l>=21123l) --> "+ !(a >= b));

        System.out.println("\n***** Misc Operators *****");

        //conditional operator
        System.out.println("82221l < 21123l ? -- > " +( a < b ? true:false));

        System.out.println("\nType Cast Operator:");

        byte bt = 1;
        short sh = -32000;
        char ch = '\u0002';
        long lt = 100000000000000000L;
        float ft = 2.9f;
        double dt = 123456789.625;
        boolean bool = true;
        int itype= 12;

        System.out.println(" long = byte " + (c=bt));
        System.out.println(" long  = short " + (c=sh));
        System.out.println(" long = char " + (c=ch));
        System.out.println(" long = long " + ( c=lt));
        System.out.println(" long = float " + (c=(long)ft));
        System.out.println(" long = double " + (c=(long)dt));
        System.out.println(" long = int " + (c=itype));

        //c=(long)bool;-->can not compare bool-long
        System.out.println("Can't cast long to bool");


    }

    public static void testChar(){

        char a='2';
        char b='4';
        char c;

        System.out.println("*****************************TestChar*****************************");


        c=(char)(a+b);
        System.out.println("a + b = "+ c); //addition

        c=(char)(a-b);
        System.out.println("a - b = "+c); //substraction

        c=(char)(a*b);
        System.out.println("a * b = "+c); //multiplication

        c=(char)(b/a);
        System.out.println("b / a = "+c);//division

        c=(char)(a%b);
        System.out.println("a % b = "+c);//modulus

        c=(char)-a;
        System.out.println("-a = "+c);//unary minus

        c=(char)+a;
        System.out.println("+a = "+c);//unary plus

        c=(char)++a;
        System.out.println("++a = "+ c);//prefix increment

        a='r';
        c=a++;
        System.out.println("r++ = " + c);//postfix increment


        a='y';
        c=(char)--a;
        System.out.println("--y = "+ --a);//prefix decrement

        a='t';
        c=a--;
        System.out.println("t-- = "+ c);//postfix decrement


        System.out.println("\n***** Bitwise Operators *****");

        a='t';
        b='n';
        //bitwise AND
        c = (char)(a & b);

        System.out.println("'t' & 'n' = "+c);


        //bitwise OR

        c = (char)(a | b);;

        System.out.println("'t' | 'n' = "+c);

        //bitwise XoR

        c = (char)(a ^ b);

        System.out.println("'t' ^ 'n' = " + c);

        //NOT

        c=(char)~a;
        System.out.println("~t' =  " + c);

        //Left shift

        a='y';

        c=(char)(a<<1);
        System.out.println("'y' << 1 = " + c);

        //Right shift

        c=(char)(a>>1);
        System.out.println("'y' >> 1 = " + c);

        a=(char)-'t';
        c=(char)(a>>1);//right shift
        System.out.println("-'t' >> 1 = " + c);

        a='e';
        c=(char)(a>>>1); //zero fill right shift
        System.out.println("'e' >>> 1 = " + c);

        a=(char)-'b';
        c=(char)(a>>>1); //zero fill right shift
        System.out.println("-'b' >>> 1 = " + c);

        System.out.println("\n***** Assignment Operators *****");

        a='l';
        c='n';

        System.out.println("'n' += 'l' --> c = " + (c+=a));
        c='h';
        c-=a;
        System.out.println("'h' -= 'l' --> c = " + c);
        c='n';

        System.out.println("'n' *= 'l' --> c = " + (c*=a));
        c='n';

        System.out.println("'n' /= 'l' --> c = " + (c/=a));
        c='b';

        System.out.println("'b' %= 'l' --> c = " + (c%=a));

        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception

        c='n';
        c|=a;
        System.out.println("'n' |= 'l' --> "+c);

        c='n';
        c&=a;

        System.out.println("'n' &= 'l' --> "+c);

        c='0';
        c^=a;

        System.out.println("'0' ^= 'l' --> "+c);

        c='n';
        c>>=1;

        System.out.println("'n' >>= 1 --> "+c);

        c='n';
        c<<=1;

        System.out.println("'n' <<= 1 --> "+c);

        c='n';
        c>>>=1;

        System.out.println("'n' >>>= 1 --> "+c);

        System.out.println("\n***** Relational Operators *****");

        a='y';
        b='2';
        // greater than
        System.out.println("'y' > '2' --> "+ (a>b));
        // greater than or equal to
        System.out.println("'y' >= '2' --> "+ (a>=b));
        // less than
        System.out.println("'y' < '2' --> "+(a<b));
        // less than or equal to
        System.out.println("'y' <= '2' --> "+(a<=b));
        // equal to
        System.out.println("'y' == '2' --> "+ (a==b));
        // not equal to
        System.out.println("'y' != '2' --> "+ (a!=b));

        System.out.println("\n***** Logical Operations *****");

        a='H';
        b='h';
        // logical AND
        System.out.println("('H'>'h') && ('H'>0) --> " +  ((a>b)&&(a>0)));
        System.out.println("('H'>'h') & ('H'>0) --> " + ((a>b)&(a>0)));

        // logical OR
        System.out.println("('H'>='h') || ('h'!=0) --> " + ((a>=b) || (b!=0) ));

        System.out.println("('H'>='h') | ('h'=0) --> " + ((a>=b) | (b==0)));

        // logical XOR
        System.out.println("('H'>='h') ^ ('h'!=0) --> "+ ((a >= b) ^ (b != 0)));

        //logical NOT
        System.out.println("!('H'>='h') --> "+ !(a >= b));

        System.out.println("\n***** Misc Operators *****");

        a='K';
        b='h';

        //conditional operator
        System.out.println("'K' > 'h' ? -- > " +( a > b ? true:false));

        System.out.println("\nType Cast Operator:");

        byte bt =111;
        short sh = -32000;
        char ch = 'z';
        long lt = 100L;
        float ft = 132.0f;
        double dt = 123456789.625;
        boolean bool = true;
        int at=220;

        System.out.println(" char = byte: " + (c=(char)bt));
        System.out.println(" char  = short: " + (c=(char)sh));
        System.out.println(" char = char: " + (c=ch));
        System.out.println(" char = long: " + ( c=(char)lt));
        System.out.println(" char = float: " + (c=(char)ft));
        System.out.println(" char = double: " + (c=(char)dt));
        System.out.println(" char = int: " + (c=(char)at));

        //c=(char)bool;-->can not compare bool-char
        System.out.println("Can't cast char to bool");
    }

    public static void testStudent() {

        System.out.println("***************************TestStudent***************************");

        Student student1 = new Student("Andrei", 9);
        Student student2 = new Student("Alex", 8);
        Student student3 = new Student("Max", 9);
        Student student4 = student1;

        System.out.println("\n***** Relational Operators *****");

        System.out.println("student1 == student2 --> " + (student1==student2));//objects takes parts of different memory
        System.out.println("student1 == student3 --> " + (student1==student3));//objects takes parts of different memory
        System.out.println("student1 == student1 --> " + (student1==student1));//there is the same objects
        System.out.println("student1.equals(student4) --> " +student1.equals(student4));//there is the same objects
        System.out.println("student1 != student3 --> " + (student1!=student3));//not equals
        System.out.println("student1 != student4 --> " +(student1!=student4));//equals cause there are the same parts of memory
        System.out.println("student2 instanceof Student --> "+ ( student2 instanceof Student));
        System.out.println("!(student2 instanceof Object) --> " + !(student2 instanceof Object));

        System.out.println("\n***** Misc Operators *****");

        //condition operators
        System.out.println("Is student1 equals to student 4? --> "+ ( student1 == student4 ? true : false));

        System.out.println("\nType Cast Operator:");

        Object obj = student1;
        System.out.println(obj);

        Student testStudent=student2;
        System.out.println(testStudent);

        student2=student3;
        System.out.println(student2);





    }

    public static void testString(){

        System.out.println("***************************TestStudent***************************");

        String a="qwerty";
        String b="asdf";
        String c;

        System.out.println("\n***** Arithmetical Operators *****");

        System.out.println("qwerty + asdf = " + (a+b));

        System.out.println("\n***** Bitwise Operators *****");

        System.out.println("There are no one bitwise operator can be applied to String type");

        System.out.println("\n***** Assignment Operators *****");

        System.out.println("qwerty += asdf " + (a+=b));

        System.out.println("\n***** Relational Operators *****");

        System.out.println("qwerty == asdf --> "  + a==b);
        System.out.println("!qwerty.equals(b) --> "  + !a.equals(b));

        System.out.println("Is 'a' instance of Object --> " + ( a instanceof Object));

        a=null;

        System.out.println("Is 'a' which null equals to 'null' instanse of Object --> "  + (a instanceof Object));
        a="qwerq";
        System.out.println("\n***** Logical Operations *****");
        System.out.println("There are no one logical operaton can be applied to String type");

        //condition operators

        System.out.println("qwerq != asdf ? -- > " +( a != b ? true:false));

        System.out.println("\nType Cast Operator:");

        Object o= a+b;
        System.out.println(o);

        System.out.println(o=a);

        //test just for myself
        System.out.println(Integer.toString(5));
        System.out.println(Double.toString(1.223));
        System.out.println(Float.toString(1234.1111f));
    }
}
