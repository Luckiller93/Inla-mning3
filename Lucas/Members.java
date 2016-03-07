public class Members {
	

	
	int id;
	String givenName;
	String familiyName;
	String birth;
	String membersSince;
	int role;
	String team;
	int gender;
	String role2;
	String gender2;
	//boolean isActive;

	public Members () {

		
		id =0;
		givenName="Unknown";
		familiyName="Unknown";
		birth= "Unknown";
		membersSince = "Unknown";
		role=3;
		team="Unknown";
		gender=2;
		//isActive=true;

	}

	public Members(int theId, String theGivenName, String theFamilyName, String theBirth, String theMemberSince, int theRole, String theTeam, int theGender) {

		id = theId;
		givenName = theGivenName;
		familiyName=theFamilyName;
		birth = theBirth;
		membersSince = theMemberSince;
		role = theRole;
		team = theTeam;
		gender = theGender;
		
		// isActive = theIsActive;


			if (role == 0) {
				role2 = "player";
			}

			else if(role == 1) {
				role2 = "coach";
			}	

			else if(role == 2) {
				role2 = "parent";
			}

			else {
				role2 = "Unknown";
			}

			if (gender == 0) {
				gender2 = "Kvinna";
			}

			else if (gender == 1) {
				gender2 = "Man";
			}
			
			else {
				gender2 = "Unknown";
			}
	}




	public String toString (){

		return ("Id: " + id + "\n" + "Given name: " + givenName + "\n" + "Familyname: " + familiyName  + "\n" + "Birth: " + birth  + "\n" + "Member Since: " + membersSince + "\n" + "Role: " + role2  + "\n" + "Team: " + team  + "\n" + "Gender: " + gender2);
	}
	}