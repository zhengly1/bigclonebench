public class BigbenchClone{    
		void rollFw(String aLine, int aNewPosition) {
			synchronized(this) {
				for (int i=0; i<content.length-1; i++) {
					content[i] = content[i + 1];
					positions[i] = positions[i + 1];
				}
				positions[content.length - 1] = positions[content.length];
				content[content.length - 1] = aLine;
				positions[positions.length - 1] = aNewPosition;
			}
		}
}