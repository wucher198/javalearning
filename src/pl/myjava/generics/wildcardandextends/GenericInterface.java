package pl.myjava.generics.wildcardandextends;

public interface GenericInterface<T extends InterfaceA> {
	T method(T input);
}
