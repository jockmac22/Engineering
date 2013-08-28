package engineering.quicksort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

class QuickSortExample {
	
	public QuickSortExample() {}
	
        private Integer iterations = 0;
        
	public void run() {
		ArrayList<Integer> dataSet = new ArrayList<Integer>();
                
                Random generator = new Random();
                int idx = 0;
                while (idx < 100) {
                    Integer rval = (Integer)generator.nextInt(500);
                    if (!dataSet.contains(rval)) {
                        dataSet.add(rval);
                        idx++;
                    }
                }
            
		System.out.println("Randomized values:");
		Iterator<Integer> ritr = dataSet.iterator();
		while(ritr.hasNext()) {
			Integer value = ritr.next();
			System.out.print(value.toString() + ",");
		}
                System.out.println("");
                
            
		ArrayList<Integer> sortedDataset = sort(dataSet);
		
		System.out.println("Sorted values:");
		Iterator<Integer> itr = sortedDataset.iterator();
		while(itr.hasNext()) {
			Integer value = itr.next();
			System.out.print(value.toString() + ",");
		}
                
                System.out.println("");
                System.out.println("Sorted " + ((Integer)dataSet.size()).toString() + " elements in " + iterations + " iterations.");
	}
	
	public ArrayList<Integer> sort(ArrayList<Integer> dataSet) {
                iterations++;
                Integer size = dataSet.size();
		
		if (size <= 1)
			return dataSet;
		
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
                int pivotIndex = (int)Math.ceil(size/2);
		Integer pivot = dataSet.get(pivotIndex);
		dataSet.remove(pivotIndex);
                
		Iterator<Integer> itr = dataSet.iterator();
		while(itr.hasNext()) {
			Integer value = itr.next();
			if (value <= pivot)
				left.add(value);
			else
				right.add(value);
		}
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.addAll(sort(left));
		result.add(pivot);
		result.addAll(sort(right));
		
		return result;
	}
	
	public static void main(String[] args) {
		QuickSortExample qse = new QuickSortExample();
		qse.run();
	}
}