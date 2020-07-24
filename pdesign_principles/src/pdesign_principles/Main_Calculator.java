package pdesign_principles;

import java.util.*;
public class Main_Calculator {
   public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int x = sc.nextInt();int a = sc.nextInt(); int b = sc.nextInt();
          switch (x){
              case 1:
                  Add_Class add = new Add_Class();
                  add.addition(a,b);
                  break;
              case 2:
                  Sub_Class sub = new Sub_Class();
                  sub.subtraction(a,b);
                  break;
              case 3:
                  Mult_Class mul = new Mult_Class();
                  mul.multi(a,b);
                  break;
              case 4:
                  Div_Class div = new Div_Class();
                  div.division(a,b);
                  break;
          }
      }

  }