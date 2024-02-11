
public class duplicate
{
	public static void main(String[] args) {
		String str = "aman pratap singh";
		StringBuffer st=new StringBuffer();
		
		
		
		for(int i=0 ; i<str.length() ; i++){
		    char ch=str.charAt(i);
		    int index = str.indexOf(ch,i+1);
		    if(index==-1){
		        st.append(ch);
		    }
		}
		System.out.println(st);
		
		
	}
}
