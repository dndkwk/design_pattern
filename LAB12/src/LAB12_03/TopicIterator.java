package LAB12_03;

public class TopicIterator implements Iterator<Topic> {
	
	private Topic[] topic;
	private int pos=0;
	
	TopicIterator(Topic[] topic){
		this.topic=topic;
		pos=0;
	}
	
	@Override
	public void reset() {
		pos=0;
	}

	@Override
	public Topic next() {
		return topic[pos++];
	}

	@Override
	public Topic currentItem() {
		return topic[pos];
	}

	@Override
	public boolean hasNext() {
		if(pos+1<=topic.length) {
			return true;
		}
		return false;
	}

}
