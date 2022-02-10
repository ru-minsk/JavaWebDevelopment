package task01;

public class Main {

	public static void main(String[] args) {
	// Task 01
	{	
		System.out.println("Task01_01 Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр");
		int x=9999;
		System.out.println("Исходное число = "+x);
		if(x>999&&x<10000)
		{
			int x1=x/1000; 		// первая цифра
			int x2=(x-x1*1000)/100;	// вторая цифра
			int x3=(x-x1*1000-x2*100)/10;
			int x4=(x-x1*1000-x2*100-x3*10);
			System.out.println("Первая цифра ="+x1);
			System.out.println("Вторая цифра ="+x2);
			System.out.println("Третья цифра ="+x3);
			System.out.println("Четверта цифра ="+x4);		
			if(x1+x2==x3+x4)
				System.out.println("true");
			else
				System.out.println("false");
			}
			else
				System.out.println("Число не четырехзначное!");
	}	
	// Task 02
	{
		System.out.println();
		System.out.println("Task01_02 Вычислить значение выражения по формуле");
		double a=4.3, b=3.56, c=6;
		double rez;
		rez=(b+Math.sqrt(Math.pow(b, 2)+4*a*c))/(2*a)-Math.pow(a, 3)*c+Math.pow(b, -2);
		System.out.println("При a ="+a+" b ="+b+" c ="+c+" Результат = "+rez);
	}	
	// Task 03
	{
		System.out.println();
		System.out.println("Task01_03 Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов");	
		double a=4.7, b=6.8;
		double p = a + b + Math.sqrt(a * a + b * b);
        double s = a * b / 2.0;
        System.out.println("При a ="+a+" b ="+b+" Периметр = "+p+" Площадь = "+s);
		
	}
	// Task 04
	{
		System.out.println();
		System.out.println("Task01_04 Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае");	
		double x=4.0, y=6.8;
		System.out.println("При x ="+x+" y = "+y);
		if(Math.abs(x)<=4 && y<=4 && y>=-3)
			System.out.println("true");
		else
			System.out.println("false");
	}
	// Task 05
	{
		System.out.println();
		System.out.println("Task01_05 Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные");	
		double[] numbers= {3,-5,7};
		for(int i=0;i<numbers.length;i++)
		{
			int pow;
			if(numbers[i]<0)
				pow=4;
			else
				pow=2;
			System.out.println(numbers[i]+" в степени "+pow+" = "+Math.pow(numbers[i], pow));
			
		}
	}
	// Task 06
	{
		System.out.println();
		System.out.println("Task01_06 Написать программу нахождения суммы большего и меньшего из трех чисел");	
		double[] numbers= {3,-5,7};	
		double min=numbers[0], max=numbers[0];
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]<min)
				min=numbers[i];
			if(numbers[i]>max)
				max=numbers[i];
		}
		System.out.println("Минимальное число = "+min+" максимальное число "+max);
	
	}
	// Task 07
	{
		System.out.println();
		System.out.println("Task01_07 Составить программу вычисления значений функции  F(x) на отрезке [а, b] с шагом h");	
		double a=4.5, b=8.5, h=0.5;
		double x=a,fx;
		System.out.println("При a = "+a+" b = "+b+" h = "+h);
		System.out.println("x    fx");
		if(a<=b)
		{
			while(x<=b)
			{
				fx=Math.pow(Math.sin(x),2)-Math.cos(2*x);
				System.out.println(String.format("%s  %-10s",x, fx));
				x=x+h;		
			}
		}
		else
		System.out.println("a должно быть меньше b!");	
	}
	// Task 08
	{
		System.out.println();
		System.out.println("Task01_08 В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К");	
		int[] numbers= {3,8,7,9};
		double k=3.0;
		long sum=0;
		System.out.println("При k = "+k);
		for(int i=0;i<numbers.length;i++)
		{
			if((int)(numbers[i]/k)==(numbers[i]/k))
				sum=sum+numbers[i];
		}
		System.out.println("Сумма чисел кратных "+k+" = "+sum);
	}
	// Task 09
	{
		System.out.println();
		System.out.println("Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого");	
		int[] numbers1= {3,8,7,9,4,0,3};
		int[] numbers2= {31,81,71,91,41,47};
		
		int[] numbers3=new int[numbers1.length+numbers2.length];
		int k=3;
		System.out.println("При k = "+k);
		int i3=0;
		for(int i1=0;i1<numbers1.length;i1++)
		{
			
			numbers3[i3]=numbers1[i1];
			i3++;
			if(i1==k)
			{
				for(int i2=0;i2<numbers2.length;i2++)
				{
					numbers3[i3]=numbers2[i2];
					i3++;
				}
			}
		}
		System.out.println("Итоговый массив:");
		for(int ii3=0;ii3<numbers3.length;ii3++)
		{
			System.out.println(numbers3[ii3]);
		}
	}	
	
	// Task 10
	{
		System.out.println();
		System.out.println("Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)");	
		int n=6;
		String line1="";
		String line2="";
		for(int i=0;i<n;i++)
		{
			int s1=(i+1);
			int s2=(n-i);
			line1=line1+s1+" ";
			line2=line2+s2+" ";

		}
		for(int i=0;i<n;i=i+2)
		{	
		System.out.println(line1);
		System.out.println(line2);
		}
	}
	} // end main

}
