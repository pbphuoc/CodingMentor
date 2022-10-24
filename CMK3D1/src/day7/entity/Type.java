package day7.entity;

public class Type {
	private String typeID;
	private String typeName;

	public Type(String typeID, String typeName) {
		this.typeID = typeID;
		this.typeName = typeName;
	}

	public String getTypeID() {
		return typeID;
	}

	public String getTypeName() {
		return typeName;
	}
}
