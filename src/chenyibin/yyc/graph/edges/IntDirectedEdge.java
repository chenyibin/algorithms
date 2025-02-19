package chenyibin.yyc.graph.edges;

public class IntDirectedEdge extends DirectedEdge
{
	int i;
	
	public static class IntegerDirectedEdgeFactory
	{
		int counter;
		
		public IntegerDirectedEdgeFactory(int start) {
			this.counter = start;
		}
		
		public IntDirectedEdge create() {
			return new IntDirectedEdge(counter);
		}
	}
	
	public IntDirectedEdge(int number) {
		i = number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IntDirectedEdge other = (IntDirectedEdge) obj;
		if (i != other.i)
			return false;
		return true;
	}
	
	
}
