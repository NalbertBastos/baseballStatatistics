package baseball.entities;

public class Statistics {
	private int hits;
	private int atbat;
	private int doubles;
	private int triples;
	private int hr;
	private int rbi;
	
	public Statistics() {
		super();
	}

	public Statistics(int hits, int atbat, int doubles, int triples, int hr, int rbi) {
		super();
		this.hits = hits;
		this.atbat = atbat;
		this.doubles = doubles;
		this.triples = triples;
		this.hr = hr;
		this.rbi = rbi;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public int getAtbat() {
		return atbat;
	}

	public void setAtbat(int atbat) {
		this.atbat = atbat;
	}

	public int getDoubles() {
		return doubles;
	}

	public void setDoubles(int doubles) {
		this.doubles = doubles;
	}

	public int getTriples() {
		return triples;
	}

	public void setTriples(int triples) {
		this.triples = triples;
	}

	public int getHr() {
		return hr;
	}


	public void setHr(int hr) {
		this.hr = hr;
	}

	

	public int getRbi() {
		return rbi;
	}

	public void setRbi(int rbi) {
		this.rbi = rbi;
	}

	@Override
	public String toString() {
		return "Statistics [HITS=" + hits + ", AT BAT=" + atbat + ", DOUBLES=" + doubles + ", TRIPLES=" + triples
				+ ", HOME RUNS=" + hr + ", RBI=" + rbi + "]";
	}
	
	

	
	
	

	

	
	
	
	
	

}
