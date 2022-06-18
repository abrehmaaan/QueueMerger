// Name:
// ID:
//=============================
public class QueueMerger {

	public static Queue merge(Queue q[]) {
		LinkedQueue result = new LinkedQueue();
		boolean flag = true;
		while(flag) {
			flag = false;
			for(Queue queue: q) {
				if(!queue.isEmpty()) {
					result.enqueue(queue.dequeue());
				}
				if(!queue.isEmpty()) {
					flag = true;
				}
			}
		}
		
		return result;
	}
}