package ex1_Sort;

public class TestEx1 {
	public static void main(String[] args) {
		SortedList sl = new SortedList();
		sl.add("Java Core");
		sl.add("Front-end");
		sl.add("PHP");
		sl.add("SQL");
		
		sl.setSortStrategy(new QuickSort());
		sl.sort();
		
		sl.setSortStrategy(new SelectionSort());
		sl.sort();
		
		sl.setSortStrategy(new MergeSort());
		sl.sort();
	}
}
