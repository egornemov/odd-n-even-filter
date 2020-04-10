public class OneWayArrayList<T> {

    private final T[] data;

    OneWayArrayList(T[] args) {
        data = args;
    }

    public OneWayArrayListNode head() {
        if (data.length == 0) {
            return null;
        }
        return new OneWayArrayListNode(0);
    }

    class OneWayArrayListNode implements OneWayListNode<T> {

        private final int position;

        OneWayArrayListNode(int position) {
            this.position = position;
        }

        @Override
        public T get() {
            return (T) data[position];
        }

        @Override
        public OneWayListNode<T> next() {
            int nextPosition = position + 1;
            if (nextPosition >= data.length) {
                return null;
            }
            return new OneWayArrayListNode(nextPosition);
        }
    }
}
