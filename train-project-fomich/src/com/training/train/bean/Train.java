package com.training.train.bean;

import java.util.Comparator;

public class Train {
	
	private String destination;
	private int trainNum;
	private String depTime;
	
	public Train() {
	}
		
	public Train (String destination, int trainNum, String depTime) {
		super();
		this.destination = destination;
		this.trainNum = trainNum;
		this.depTime = depTime;		
	}


	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTrainNum() {
		return trainNum;
	}

	public void setTrainNum(int trainNum) {
		this.trainNum = trainNum;
	}

	public String getDepTime() {
		return depTime;
	}

	public void setDepTime(String depTime) {
		this.depTime = depTime;
	}
		
	  @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((depTime == null) ? 0 : depTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + trainNum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (depTime == null) {
			if (other.depTime != null)
				return false;
		} else if (!depTime.equals(other.depTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (trainNum != other.trainNum)
			return false;
		return true;
	}

	public static class ByNumberComparator implements Comparator <Train> {
	  
	  @Override
	  	public int compare(Train left, Train right) {
		  return left.getTrainNum() - right.getTrainNum();
		  
	  	}  	  
	 }
	 
	public static class ByDestinationAndTimeComparator implements Comparator <Train> {
        @Override
        public int compare(Train left, Train right) {
            if (left.getDestination() == right.getDestination()) {
                return left.depTime.compareTo(right.depTime);
            } else {

                return left.getDestination().compareTo(right.getDestination());
            }
        }
    }

	
	  @Override 
	  public String toString() { 
		  return "Пункт назначения: " + destination + " | Номер поезда: " + trainNum + " | Время отправления: " + depTime + " | "; 
	  }
	 
	public void print() {
		System.out.println(getTrainNum() + " | " + getDestination() + " | " + getDepTime());
	}

	
	
}
