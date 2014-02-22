package biz.osvit.testiranje.models;

import android.os.Parcel;
import android.os.Parcelable;

public class UserModel implements Parcelable {

	private String firstName;
	private String lastName;
	private String address;

	public UserModel(String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;

	}

	public UserModel() {
	}

	public static final Parcelable.Creator<UserModel> CREATOR = new Creator<UserModel>() {

		@Override
		public UserModel[] newArray(int size) {
			// TODO Auto-generated method stub
			return new UserModel[size];
		}

		@Override
		public UserModel createFromParcel(Parcel source) {
			// TODO Auto-generated method stub
			return new UserModel(source);
		}

	};

	private UserModel (Parcel in) {
		firstName=in.readString();
		lastName=in.readString();
		address=in.readString();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(firstName);
		dest.writeString(lastName);
		dest.writeString(address);

	}

}
