class Q1Medical{
public static void main(String args[]){
	Medicine med1=new Medicine("Panadol","250mg",5);
	Medicine med2=new Medicine("Regix","500g",58);
	MedicalInventoryManager manager=new MedicalInventoryManager();
		med1.DisplayDetails();
		System.out.println();
		med2.DisplayDetails();
	manager.updateMedicineQuantity(med1,20);
	
}
}

class Medicine{
	String name;
	String st;
	int quant;
	
	Medicine(String name, String st,int quant){
		this.name=name;
		this.st=st;
		this.quant=quant;
	}
	void DisplayDetails(){
		System.out.print("Medicine Name : "+name+"\nStrength of Medicine : "+st+"\nMedicine Quantity : "+quant);
	}
}

class MedicalInventoryManager{
	void updateMedicineQuantity(Medicine medicine, int quantityToAdd){
		medicine.quant+=quantityToAdd;
		System.out.println("\nUpdated quantity of " + medicine.name + " by " + quantityToAdd + ". New quantity: " + medicine.quant);
	}

	
}