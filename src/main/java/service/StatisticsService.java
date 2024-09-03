package service;

import baseball.entities.Statistics;

public class StatisticsService {

	
	public double battingAverage(int hits, int atbat) {
		double avg;
		if (atbat == 0) {
            return 0.0; 
        }
        return avg = (double) hits / atbat;
        
	}
	
	public double onBasePercentage(int hits, int atbat,int walk, int hbp) {
		
		double obp;
		
		if (atbat == 0) {
            return 0.0; 
        }
		
		double totalBases = hits+walk+hbp;
		
		return totalBases/atbat;
		
		
	}
	
	public double sluggin(int hits, int atbat,int triple, int doubles,int hr) {
		double slg;
		
		if (atbat == 0) {
            return 0.0; 
        }
		
		double totalBases = hits + doubles + (triple * 2) + (hr * 3);
        
        // Calcula o slugging percentage
        return totalBases / atbat;
		
	}
	
	
	public double onBasePlusSlugging(double slg, double obp) {
		return slg+obp;
	}

}
