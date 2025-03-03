package Lab03C.main.java.counter;

public class CounterService extends FrameSubject{
	
	private int count=0;
	//private TextFrame textframe ;
	//private RectFrame rectframe ;
	//private OvalFrame ovalframe ;


	
	public void increment(){
		count++;
		notify(count);

    	//textframe.setCount(count);
    	//rectframe.setCount(count);
    	//ovalframe.setCount(count);
	}
	
	public void decrement(){
		count--;
		notify(count);

		//textframe.setCount(count);
    	//rectframe.setCount(count);
    	//ovalframe.setCount(count);
	}



	//public void setRectframe(RectFrame rectframe) {
	//	this.rectframe = rectframe;
	//}

	//public void setOvalframe(OvalFrame ovalframe) {
	//	this.ovalframe = ovalframe;
	//}

}
