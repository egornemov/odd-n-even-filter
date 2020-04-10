public interface OneWayListNode<T> {
    // return node value
    T get();

    // return next node or null in case of absence
    OneWayListNode<T> next();
}
