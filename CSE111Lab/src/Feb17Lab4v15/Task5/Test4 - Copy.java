/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feb17Lab4v15.Task5;

/**
 *
 * @author Piplu
 */
public class Test4{
public int sum;
public int y;
public void methodA(){
int x=0;
int z = 0;
while (z < 5){
y = y + sum;
x = y + 1;
System.out.println(x + " " + y+ " " + sum);
sum = sum + methodB(x, y);
z++;
}
}
public int methodB(int m, int n){
int x = 0;
int sum = 0;
y = y + m;
x = n - 4;
sum = sum + y;
System.out.println(x + " " + y+ " " + sum);
return sum;
}
}