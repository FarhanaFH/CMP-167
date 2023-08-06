import java.util.Arrays;

public class Farm {
    private Animal[] animals;   // Array to store animals
    private String farmName;    // Name of farm
    private int numAnimals;     // Number of animals currently

    public Farm() {
        animals = new Animal[10];   // Initialize animal array with size 10
        this.numAnimals = 0;        // Set initial number to 0
        this.farmName = "";         // Set farm name to an empty string
    }

    public Farm(int maxAnimals) {
        if (maxAnimals < 0)
            maxAnimals = 0;          // Ensure maximum number of animals

        animals = new Animal[maxAnimals];  // Initialize the animal array with maximum size
        this.numAnimals = 0;                // Set initial number to 0
        this.farmName = "";                 // Setfarm name to an empty string
    }

    public Farm(String farmName) {
        animals = new Animal[10];   // Initialize the animal array with size 10
        this.farmName = farmName;   // Set farm name 
        this.numAnimals = 0;        // Set initial number to 0
    }
   
   public Farm(String farmName, int maxAnimals) {
      if (maxAnimals < 0) maxAnimals = 0;
      this.farmName = farmName;
      this.numAnimals = 0;
      animals = new Animal[maxAnimals];
   }
   
   public String getFarmName() {
      return farmName;
   }
   
// Set the name of the farm
public void setFarmName(String farmName) {
this.farmName = farmName;
}

public void addAnimal(Animal a) {
// If animal array is full, resize it
if (this.numAnimals >= animals.length) {
resizeAnimalArray();
}
// Add animal to array & increment count
animals[numAnimals++] = a;
}

// Get animal at specified index
public Animal getAnimal(int index) 
{
if (index < 0 || index >= numAnimals) 
{
return null;
}
// Return animal at specified index
return animals[index];
}

// Get total number of animals 
public int getNumAnimals() {
return this.numAnimals;
}

// Get the first animal 
public Animal getFirstAnimal() {
return animals[0];
}
   
   public Animal getLastAnimal() {
      return animals[numAnimals-1];
   }
   
   public Animal[] getAnimals() {
      return this.animals;
   }
   
   public Animal removeAnimal(int index) {
      if(index<0 || index >= numAnimals) return null;
      Animal[] temp = new Animal[animals.length];
      int j=0;
      Animal a = animals[index];
      for(int i = 0; i<numAnimals; i++) {
         if(i != index)
         {
            temp[j] = animals[i];
            j++;
         }
      }
      temp[animals.length-1] = null;
      animals = temp;
      numAnimals -= 1;
      return a;
   }
   
   public void removeAllAnimals() {
      this.numAnimals = 0;
   }
   
   public double getTotalWeightOfAllAnimals() {
      double sum = 0;
      for(int i0=0;i0<numAnimals;i0++)
         sum += animals[i0].getWeight();
      return sum;
   }
   
   public double getAverageWeightOfAllAnimals() {
      return getTotalWeightOfAllAnimals() / (numAnimals);
   }
   
   public int getNumberOfAnimalsAboveWeight(double weight) {
      int i = 0;
      for(int i0=0;i0<numAnimals;i0++)
         if (animals[i0].getWeight() > weight)
            i++;
      return i;
   }
   
   public int getNumberOfAnimalsBelowWeight(double weight) {
      
      int i = 0;
      for(int i0=0;i0<numAnimals;i0++)
         if (animals[i0].getWeight() < weight)
            i++;
      return i;
   }
// Increase weight of all animals 
public void increaseWeightOfAllAnimals() {
    for (int i = 0; i < numAnimals; i++) {
        animals[i].gainWeight();
    }
}
// Increase weight of all animals by a specified amount
public void increaseWeightOfAllAnimals(double weight) {
    for (int i = 0; i < numAnimals; i++) {
        animals[i].gainWeight(weight);
    }
}

// Print details of farm, including farm name, number of animals, and farm size
public void printAllDetails() {
    System.out.printf("Farm Name: %20s | Number of Animals: %4d | Farm Size: %4d\n",
            this.farmName, this.numAnimals, animals.length);
    for (int i = 0; i < numAnimals; i++) {
        animals[i].printDetails();
    }
}

// Resize animal array to accommodate more animals
public void resizeAnimalArray() {
    if (animals.length == 0) {
        animals = Arrays.copyOf(animals, 2);
    } else {
        animals = Arrays.copyOf(animals, animals.length * 2);
    }
}
}
