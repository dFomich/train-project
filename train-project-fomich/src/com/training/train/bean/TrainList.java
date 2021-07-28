package com.training.train.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TrainList {
	public List<Train> trainList;

	public TrainList() {
		trainList = new ArrayList<Train>();
	}

	public List<Train> getTrainList() {
		return trainList;
	}

	public void setTrainList(List<Train> trainList) {
		this.trainList = trainList;
	}

	public void add(Train a) {
		trainList.add(a);
	}

	public List<Train> searchByNumber(int trainNum) {
		List<Train> result = new ArrayList<Train>();
		for (Train a : trainList) {
			if (a.getTrainNum() == (trainNum)) {
				result.add(a);
			}
		}
		return result;
	}
		 
}

