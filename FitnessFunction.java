package aSan;

public interface FitnessFunction {
	int getArity(); //количество битов в геном
	long run(long[] genom); // фитнесс функция от генома
}