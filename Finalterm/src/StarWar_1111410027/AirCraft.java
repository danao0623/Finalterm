package StarWar_1111410027;

public class AirCraft {
	
	private String Msnufacturcr;
	private String Model;
	private double Length;
	private double Airspeed;
	private String SpaceSpeed;
	private String StdardEngine;
	private String HyperSpaceEngine;
	private String [] Weapon;
	private double Weapon_power;
	private int Passenger;
	private String []Shield;
	private double[]ShieldPower;
	

	class XWing extends AirCraft{
		
	}
	
	class TieFighter extends AirCraft{
		
	}
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub

	}
	public String getMsnufacturcr() {
		return Msnufacturcr;
	}
	public void setMsnufacturcr(String msnufacturcr) {
		Msnufacturcr = msnufacturcr;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public double getLength() {
		return Length;
	}
	public void setLength(double length) {
		Length = length;
	}
	public double getAirspeed() {
		return Airspeed;
	}
	public void setAirspeed(double airspeed) {
		Airspeed = airspeed;
	}
	public String getSpaceSpeed() {
		return SpaceSpeed;
	}
	public void setSpaceSpeed(String spaceSpeed) {
		SpaceSpeed = spaceSpeed;
	}
	public String getStdardEngine() {
		return StdardEngine;
	}
	public void setStdardEngine(String stdardEngine) {
		StdardEngine = stdardEngine;
	}
	public String getHyperSpaceEngine() {
		return HyperSpaceEngine;
	}
	public void setHyperSpaceEngine(String hyperSpaceEngine) {
		HyperSpaceEngine = hyperSpaceEngine;
	}
	public String[] getWeapon() {
		return Weapon;
	}
	public void setWeapon(String[] weapon) {
		Weapon = weapon;
	}
	public double getWeapon_power() {
		return Weapon_power;
	}
	public void setWeapon_power(double weapon_power) {
		Weapon_power = weapon_power;
	}
	public int getPassenger() {
		return Passenger;
	}
	public void setPassenger(int passenger) {
		Passenger = passenger;
	}
	public String[] getShield() {
		return Shield;
	}
	public void setShield(String[] shield) {
		Shield = shield;
	}
	public double[] getShieldPower() {
		return ShieldPower;
	}
	public void setShieldPower(double[] shieldPower) {
		ShieldPower = shieldPower;
	}
	

}
