
public class GameCharacter {

	//접근점이 된다.
	private Weapon weapon;
	
	//교환이 가능하도록 
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		
		if (weapon == null) {
			System.out.println("맨손 공격");
		} else {
			//델리게이트
			weapon.attack();
		}
	}
}
