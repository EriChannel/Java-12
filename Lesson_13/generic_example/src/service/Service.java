package service;

public interface Service <E>{
    public E add();

    public void updateName(E e);

    public boolean delete(E e);
}
