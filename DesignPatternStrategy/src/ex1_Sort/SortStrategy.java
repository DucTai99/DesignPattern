package ex1_Sort;

import java.util.List;

public interface SortStrategy {
	public <T> void sort(List<T> items);
}
