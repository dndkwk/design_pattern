package LAB12_03;

public class TopicList implements List<Topic>{

	private Topic[] topic;
	
	TopicList(Topic[] topic){
		this.topic=topic;
	}
	
	public Iterator<Topic> iterator() {
		return new TopicIterator(topic);
	}
	
}
