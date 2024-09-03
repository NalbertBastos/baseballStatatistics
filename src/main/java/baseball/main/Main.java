package baseball.main;

import baseball.entities.BaseballPlayer;
import baseball.entities.Statistics;
import baseball.entities.enums.Position;
import service.StatisticsService;

public class Main {

	public static void main(String[] args) {
		int hits = 39;
		int atbat = 189;
		int doubles = 6;
		int triples = 1;
		int hr = 9;
		int rbi = 21;
		int walk = 35;
		int hbp = 3;
		
		Statistics statistics = new Statistics(hits,  atbat,  doubles,  triples,  hr,  rbi);
		StatisticsService service = new StatisticsService();
		
		
		
        double avg = service.battingAverage(hits, atbat);
        double obp = service.onBasePercentage(hits, atbat, walk, hbp);
        double slg = service.sluggin(hits, atbat, triples, doubles, hr);
        double ops = service.onBasePlusSlugging(slg, obp);
        
        System.out.println(statistics.toString());
		System.out.printf("Batting Average: %.3f\n", avg);
		System.out.printf("OBP: %.3f\n",  obp);
		System.out.printf("SLG: %.3f\n",  slg);
		System.out.printf("OPS: %.3f\n",  ops);
		
		//System.out.println(statistics.toString());
		//int hits, int atbat, int doubles, int triples, int hr, int rbi
		
		

	}

}
