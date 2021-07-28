package com.training.train.main;

import java.util.Collections;
import java.util.Scanner;

import com.training.train.bean.Train;
import com.training.train.bean.TrainList;
import com.training.train.bean.Train.ByDestinationAndTimeComparator;
import com.training.train.bean.Train.ByNumberComparator;

public class Main {
	
	
	public static void main(String[] args) {
		
		TrainList trainList = new TrainList();
		trainList.add(new Train("Adler", 44, "6:15"));
		trainList.add(new Train("Vilnus", 88, "7:00"));
		trainList.add(new Train("Grodno", 13, "13:30"));
		trainList.add(new Train("Moscow", 65, "12:55"));
		trainList.add(new Train("Brest", 12, "18:45"));
		trainList.add(new Train("Brest", 14, "16:25"));
		trainList.add(new Train("Moscow", 33, "15:30"));
		
		
		Scanner sc = new Scanner(System.in);
		while (true) {
            System.out.println(
                    "Выберете необходимую операцию:" + "\n" +
                            "1. Отсортировать поезда по номерам" + "\n" +
                            "2. Вывести информацию о поезде" + "\n" +
                            "3. Отсортировать поезда по пункту назначения" + "\n" +
                            "4. Вывести информацию о всех рейсах" + "\n" +
                            "5. Завершить работу" + "\n");
            int choice = sc.nextInt();
            if (choice == 5) {
                break;
            }
            if (choice < 1 || choice > 5) {
                System.out.println("Некорректный выбор, повторите ввод");
                continue;
            }
            switch(choice) {
            case 1:
            	Collections.sort(trainList.trainList, new Train.ByNumberComparator());
            	break;
            case 2:
            	System.out.println("Введите номер поезда: ");
            	int num = sc.nextInt();
            	System.out.println(trainList.searchByNumber(num));
            	break;
            case 3:
            	Collections.sort(trainList.trainList, new Train.ByDestinationAndTimeComparator());
            	break;
            case 4:
            	for (int i = 0; i < trainList.trainList.size(); i++) {
            		System.out.print(i+1 + " ");
            		trainList.trainList.get(i).print();
            	
            	}
            	break;
            }
            
		}
	
	}
	
}
