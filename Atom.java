
public class Atom {
	private int protons;
	private int neutrons;
	private int electrons;
	private int spin;
	
	private float atomicNum;
	private String symbol;
	private int groupNum;
	private String groupRoman;
	private int period;
	private String nameEnglish;
	private String nameGerman;
	private String nameFrench;
	private String nameSpanish;
	private String nameItalian;
	private float aMassR;
	private float aMassX;
	private int meltingPoint; // Celcius
	private int boilingPoint; // Celcius
	private int roomTempState; // -1 = solid, 0 = liquid, 1 = gas
	private float density; // g/mL
	private float electroneg;
	
	public Atom() {
		protons = 0;
		neutrons = 0;
		electrons = 0;
		spin = 0;
	}
	
	public float getAtomicNum() {
		return atomicNum;
	}

	public void setAtomicNum(float atomicNum) {
		this.atomicNum = atomicNum;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public int getGroupNum() {
		return groupNum;
	}

	public void setGroupNum(int groupNum) {
		this.groupNum = groupNum;
	}

	public String getGroupRoman() {
		return groupRoman;
	}

	public void setGroupRoman(String groupRoman) {
		this.groupRoman = groupRoman;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public String getNameEnglish() {
		return nameEnglish;
	}

	public void setNameEnglish(String nameEnglish) {
		this.nameEnglish = nameEnglish;
	}

	public String getNameGerman() {
		return nameGerman;
	}

	public void setNameGerman(String nameGerman) {
		this.nameGerman = nameGerman;
	}

	public String getNameFrench() {
		return nameFrench;
	}

	public void setNameFrench(String nameFrench) {
		this.nameFrench = nameFrench;
	}

	public String getNameSpanish() {
		return nameSpanish;
	}

	public void setNameSpanish(String nameSpanish) {
		this.nameSpanish = nameSpanish;
	}

	public String getNameItalian() {
		return nameItalian;
	}

	public void setNameItalian(String nameItalian) {
		this.nameItalian = nameItalian;
	}

	public float getaMassR() {
		return aMassR;
	}

	public void setaMassR(float aMassR) {
		this.aMassR = aMassR;
	}

	public float getaMassX() {
		return aMassX;
	}

	public void setaMassX(float aMassX) {
		this.aMassX = aMassX;
	}

	public int getMeltingPoint() {
		return meltingPoint;
	}

	public void setMeltingPoint(int meltingPoint) {
		this.meltingPoint = meltingPoint;
	}

	public int getBoilingPoint() {
		return boilingPoint;
	}

	public void setBoilingPoint(int boilingPoint) {
		this.boilingPoint = boilingPoint;
	}

	public int getRoomTempState() {
		return roomTempState;
	}

	public void setRoomTempState(int roomTempState) {
		this.roomTempState = roomTempState;
	}

	public float getDensity() {
		return density;
	}

	public void setDensity(float density) {
		this.density = density;
	}

	public float getElectroneg() {
		return electroneg;
	}

	public void setElectroneg(float electroneg) {
		this.electroneg = electroneg;
	}

	public void setProtons(int protons) {
		this.protons = protons;
	}

	public void setNeutrons(int neutrons) {
		this.neutrons = neutrons;
	}

	public void setElectrons(int electrons) {
		this.electrons = electrons;
	}

	public void setSpin(int spin) {
		this.spin = spin;
	}

	public Atom(short p, short n, short e) {
		protons = p;
		neutrons = n;
		electrons = e;
		spin = 0;
	}

	
	
	@Override
	public String toString(){
		return protons + " " + neutrons + " " + electrons;
	}
}
