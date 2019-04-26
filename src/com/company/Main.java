
        package com.company;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;

        public class Main {
            public static void main(String[] args) {



                ArrayList<String> Rice = new ArrayList<String>();
                Random R = new Random();
                Rice.add("white rice");
                Rice.add("brown rice");
                Rice.add("no rice");

                ArrayList<String> Meat = new ArrayList<String>();
                Random M = new Random();
                Meat.add("chicken meat");
                Meat.add("steak meat");
                Meat.add("carnidas meat");
                Meat.add("chorizo meat");
                Meat.add("sofritas meat");
                Meat.add("veggies meat");



                ArrayList<String> Beans = new ArrayList<String>();
                Random B = new Random();
                Beans.add("pinto beans");
                Beans.add("black beans");
                Beans.add("no beans");

                ArrayList<String> Salsa = new ArrayList<String>();
                Random S = new Random();
                Salsa.add("mild salsa");
                Salsa.add("medium salsa");
                Salsa.add("hot salsa");
                Salsa.add("no salsa");

                ArrayList<String> Veggies = new ArrayList<String>();
                Random V= new Random();
                Veggies.add("lettuce");
                Veggies.add("fajita veggies");
                Veggies.add("no veggies");


                int randomIndex = R.nextInt(Rice.size());
                int random1 = M.nextInt(Meat.size());
                int random2 = B.nextInt(Beans.size());
                int random3 = S.nextInt(Salsa.size());
                int random4 = V.nextInt(Veggies.size());
                System.out.println("Burrito 1 :"+Rice.get(randomIndex)+" , " +Meat.get(random1)+" , " +Beans.get(random2)+" , "+Salsa.get(random3)+" , "+Veggies.get(random4));

                int x2a = R.nextInt(Rice.size());
                int x2b = M.nextInt(Meat.size());
                int x2c = B.nextInt(Beans.size());
                int x2d = S.nextInt(Salsa.size());
                int x2e = V.nextInt(Veggies.size());
                System.out.println("Burrito 2 :"+Rice.get(x2a)+" , " +Meat.get(x2b)+" , " +Beans.get(x2c)+" , "+Salsa.get(x2d)+" , "+Veggies.get(x2e));

                int x3a = R.nextInt(Rice.size());
                int x3b = M.nextInt(Meat.size());
                int x3c = B.nextInt(Beans.size());
                int x3d = S.nextInt(Salsa.size());
                int x3e = V.nextInt(Veggies.size());
                System.out.println("Burrito 3 :"+Rice.get(x3a)+" , " +Meat.get(x3b)+" , " +Beans.get(x3c)+" , "+Salsa.get(x3d)+" , "+Veggies.get(x3e));

                int x4a = R.nextInt(Rice.size());
                int x4b = M.nextInt(Meat.size());
                int x4c = B.nextInt(Beans.size());
                int x4d = S.nextInt(Salsa.size());
                int x4e = V.nextInt(Veggies.size());
                System.out.println("Burrito 4 :"+Rice.get(x4a)+" , " +Meat.get(x4b)+" , " +Beans.get(x4c)+" , "+Salsa.get(x4d)+" , "+Veggies.get(x4e));

                int x5a = R.nextInt(Rice.size());
                int x5b = M.nextInt(Meat.size());
                int x5c = B.nextInt(Beans.size());
                int x5d = S.nextInt(Salsa.size());
                int x5e = V.nextInt(Veggies.size());
                System.out.println("Burrito 5 :"+Rice.get(x5a)+" , " +Meat.get(x5b)+" , " +Beans.get(x5c)+" , "+Salsa.get(x5d)+" , "+Veggies.get(x5e));

                int x6a = R.nextInt(Rice.size());
                int x6b = M.nextInt(Meat.size());
                int x6c = B.nextInt(Beans.size());
                int x6d = S.nextInt(Salsa.size());
                int x6e = V.nextInt(Veggies.size());
                System.out.println("Burrito 6 :"+Rice.get(x6a)+" , " +Meat.get(x6b)+" , " +Beans.get(x6c)+" , "+Salsa.get(x6d)+" , "+Veggies.get(x6e));

                int x7a = R.nextInt(Rice.size());
                int x7b = M.nextInt(Meat.size());
                int x7c = B.nextInt(Beans.size());
                int x7d = S.nextInt(Salsa.size());
                int x7e = V.nextInt(Veggies.size());
                System.out.println("Burrito 7 :"+Rice.get(x7a)+" , " +Meat.get(x7b)+" , " +Beans.get(x7c)+" , "+Salsa.get(x7d)+" , "+Veggies.get(x7e));

                int x8a = R.nextInt(Rice.size());
                int x8b = M.nextInt(Meat.size());
                int x8c = B.nextInt(Beans.size());
                int x8d = S.nextInt(Salsa.size());
                int x8e = V.nextInt(Veggies.size());
                System.out.println("Burrito 8 :"+Rice.get(x8a)+" , " +Meat.get(x8b)+" , " +Beans.get(x8c)+" , "+Salsa.get(x8d)+" , "+Veggies.get(x8e));

                int x9a = R.nextInt(Rice.size());
                int x9b = M.nextInt(Meat.size());
                int x9c = B.nextInt(Beans.size());
                int x9d = S.nextInt(Salsa.size());
                int x9e = V.nextInt(Veggies.size());
                System.out.println("Burrito 9 :"+Rice.get(x9a)+" , " +Meat.get(x9b)+" , " +Beans.get(x9c)+" , "+Salsa.get(x9d)+" , "+Veggies.get(x9e));

                int x10a = R.nextInt(Rice.size());
                int x10b = M.nextInt(Meat.size());
                int x10c = B.nextInt(Beans.size());
                int x10d = S.nextInt(Salsa.size());
                int x10e = V.nextInt(Veggies.size());
                System.out.println("Burrito 10 :"+Rice.get(x10a)+" , " +Meat.get(x10b)+" , " +Beans.get(x10c)+" , "+Salsa.get(x10d)+" , "+Veggies.get(x10e));
            }
}

