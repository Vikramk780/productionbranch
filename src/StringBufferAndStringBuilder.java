
public class StringBufferAndStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		long start = System.currentTimeMillis();
		
		StringBuffer stringbuffer = new StringBuffer();
		
		
				
				for(int i=0; i<4111100; i++) {
					
					stringbuffer.append(": ").append(i);
				}
				
				long endtime=System.currentTimeMillis();
				
				System.out.println("Total time talken by stringbuffer-- "+(start-endtime));
				
				long startt = System.currentTimeMillis();
				
				//StringBuffer stringbuffer = new StringBuffer();
				
				StringBuilder sb = new StringBuilder();
						
						for(int i=0; i<4111100; i++) {
							
							sb.append(": ").append(i);
						}
						
						long endtimee=System.currentTimeMillis();
						
						System.out.println("Total time talken by stringbuilder-- "+(startt-endtimee));
	}

}
