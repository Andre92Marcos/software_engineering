package om.andre.isidoro.sofware_engeeniring.design_patterns.composite;

public interface Employee {
	void add(Employee employee);

	void remove(Employee employee);

	Employee getChild(int i);

	String getName();

	double getSalary();

	void print();
}
