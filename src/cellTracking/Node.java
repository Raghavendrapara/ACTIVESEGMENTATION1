package cellTracking;

import java.util.ArrayList;
import java.util.HashMap;

import ij.gui.Roi;


public class Node {
	int index;
	ArrayList<Arc> forwardArc=new ArrayList<>();
	ArrayList<Arc> backwardArc=new ArrayList<>();
	HashMap<Integer,String> id1=new HashMap<>();              //FeatureNames
	HashMap<Integer,Double> id2=new HashMap<>();              //FeatureValues
	Roi roi;
	public boolean hasChildren;
	Node(int aIndex,Roi roi)
	{
		index=aIndex;
		this.roi=roi;
	}
	
	
	public Node(int aIndex) {
		// TODO Auto-generated constructor stub
		index=aIndex;
	}


	void addForwardArc(Arc aArc)
	{
		if(this== aArc.getStart())
			forwardArc.add(aArc);
		
		
	}
	void addBackwardArc(Arc aArc)
	{
		if(aArc!=null)
		{
			backwardArc.add(aArc);
		}	
	}
	int getNumOfBackArcs()
	{
		return backwardArc.size();
	}
	int getNumOfForArcs()
	{
		return forwardArc.size();
	}
	Arc getForwardArc(int indx)
	{
		return forwardArc.get(indx);
	}
	int getIndex()
	{
		return index;
	}
	
	Arc getBackwardArc(int indx)
	{
		return backwardArc.get(indx);
	}


	public Object getNextEvent() {
		// TODO Auto-generated method stub
		return null;
	}


	public Object getPrevCell() {
		// TODO Auto-generated method stub
		return null;
	}


	public Node getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean hasNextCell() {
		// TODO Auto-generated method stub
		return false;
	}



	public boolean hasChildren() {
		// TODO Auto-generated method stub
		return false;
	}


	public State getState() {
		// TODO Auto-generated method stub
		return null;
	}


	public Node getNextCell() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
/*	void getFeatureMap(int i,int j) throws IOException
	{
		GroundTruthExtractor ob=new GroundTruthExtractor();
		ob.getValues(i);
		id1=ob.FeatureSet.get(j).featureNames;
		id2=ob.FeatureSet.get(j).featureValues;
	}
	*/
}
