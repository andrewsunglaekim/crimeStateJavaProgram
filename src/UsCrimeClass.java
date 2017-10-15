/**
 * Created by andrewkim on 10/15/17.
 */
public class UsCrimeClass {
  private double year;
  private double population;
  private double violentCrime;
  private double violentCrimeRate;
  private double murderManslaughter;
  private double murderManslaughterRate;
  private double rape;
  private double rapeRate;
  private double robbery;
  private double robberyRate;
  private double aggravatedAssault;
  private double aggravatedAssaultRate;
  private double propCrime;
  private double propCrimeRate;

  public UsCrimeClass(double year, double population, double violentCrime, double violentCrimeRate, double murderManslaughter, double murderManslaughterRate, double rape, double rapeRate, double robbery, double robberyRate, double aggravatedAssault, double aggravatedAssaultRate, double propCrime, double propCrimeRate, double burglary, double burglaryRate, double larcenyTheft, double larcenyTheftRate, double motorTheft, double motorTheftRate) {
    this.year = year;
    this.population = population;
    this.violentCrime = violentCrime;
    this.violentCrimeRate = violentCrimeRate;
    this.murderManslaughter = murderManslaughter;
    this.murderManslaughterRate = murderManslaughterRate;
    this.rape = rape;
    this.rapeRate = rapeRate;
    this.robbery = robbery;
    this.robberyRate = robberyRate;
    this.aggravatedAssault = aggravatedAssault;
    this.aggravatedAssaultRate = aggravatedAssaultRate;
    this.propCrime = propCrime;
    this.propCrimeRate = propCrimeRate;
    this.burglary = burglary;
    this.burglaryRate = burglaryRate;
    this.larcenyTheft = larcenyTheft;
    this.larcenyTheftRate = larcenyTheftRate;
    this.motorTheft = motorTheft;
    this.motorTheftRate = motorTheftRate;
  }

  public String toString(){
    String burglary = "Burglary is: ";
    burglary += this.burglary;
    return burglary;
  }

  public double getYear() {
    return year;
  }

  public void setYear(double year) {
    this.year = year;
  }

  public double getPopulation() {
    return population;
  }

  public void setPopulation(double population) {
    this.population = population;
  }

  public double getViolentCrime() {
    return violentCrime;
  }

  public void setViolentCrime(double violentCrime) {
    this.violentCrime = violentCrime;
  }

  public double getViolentCrimeRate() {
    return violentCrimeRate;
  }

  public void setViolentCrimeRate(double violentCrimeRate) {
    this.violentCrimeRate = violentCrimeRate;
  }

  public double getMurderManslaughter() {
    return murderManslaughter;
  }

  public void setMurderManslaughter(double murderManslaughter) {
    this.murderManslaughter = murderManslaughter;
  }

  public double getMurderManslaughterRate() {
    return murderManslaughterRate;
  }

  public void setMurderManslaughterRate(double murderManslaughterRate) {
    this.murderManslaughterRate = murderManslaughterRate;
  }

  public double getRape() {
    return rape;
  }

  public void setRape(double rape) {
    this.rape = rape;
  }

  public double getRapeRate() {
    return rapeRate;
  }

  public void setRapeRate(double rapeRate) {
    this.rapeRate = rapeRate;
  }

  public double getRobbery() {
    return robbery;
  }

  public void setRobbery(double robbery) {
    this.robbery = robbery;
  }

  public double getRobberyRate() {
    return robberyRate;
  }

  public void setRobberyRate(double robberyRate) {
    this.robberyRate = robberyRate;
  }

  public double getAggravatedAssault() {
    return aggravatedAssault;
  }

  public void setAggravatedAssault(double aggravatedAssault) {
    this.aggravatedAssault = aggravatedAssault;
  }

  public double getAggravatedAssaultRate() {
    return aggravatedAssaultRate;
  }

  public void setAggravatedAssaultRate(double aggravatedAssaultRate) {
    this.aggravatedAssaultRate = aggravatedAssaultRate;
  }

  public double getPropCrime() {
    return propCrime;
  }

  public void setPropCrime(double propCrime) {
    this.propCrime = propCrime;
  }

  public double getPropCrimeRate() {
    return propCrimeRate;
  }

  public void setPropCrimeRate(double propCrimeRate) {
    this.propCrimeRate = propCrimeRate;
  }

  public double getBurglary() {
    return burglary;
  }

  public void setBurglary(double burglary) {
    this.burglary = burglary;
  }

  public double getBurglaryRate() {
    return burglaryRate;
  }

  public void setBurglaryRate(double burglaryRate) {
    this.burglaryRate = burglaryRate;
  }

  public double getLarcenyTheft() {
    return larcenyTheft;
  }

  public void setLarcenyTheft(double larcenyTheft) {
    this.larcenyTheft = larcenyTheft;
  }

  public double getLarcenyTheftRate() {
    return larcenyTheftRate;
  }

  public void setLarcenyTheftRate(double larcenyTheftRate) {
    this.larcenyTheftRate = larcenyTheftRate;
  }

  public double getMotorTheft() {
    return motorTheft;
  }

  public void setMotorTheft(double motorTheft) {
    this.motorTheft = motorTheft;
  }

  public double getMotorTheftRate() {
    return motorTheftRate;
  }

  public void setMotorTheftRate(double motorTheftRate) {
    this.motorTheftRate = motorTheftRate;
  }

  private double burglary;
  private double burglaryRate;
  private double larcenyTheft;
  private double larcenyTheftRate;
  private double motorTheft;
  private double motorTheftRate;


}
