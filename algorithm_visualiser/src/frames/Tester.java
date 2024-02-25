package frames;

import sortingAlgorithms.BubbleSort;
import sortingAlgorithms.Sorting;

import javax.swing.*;
import java.awt.*;

public class Tester {
	JFrame frame;
	Tester()
	{
		frame = new JFrame();
		MyDashboard p = new MyDashboard();
		Sorting.values = Sorting.returnArray();
		BubbleSort sorter = new BubbleSort(Sorting.values);
		p.setSorter(sorter);
		frame.setLayout(new BorderLayout());
		frame.add(p);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sorter.sort();
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Tester();
	}
}
