
public class exc {

	//an exception example
		public static void main(String args[])
		{
			//BufferReader br=new BufferReader(newInputStreamReader(System.in));
			System.out.println("enter num: ");
			//name=br.readLine();
			try
			{
				//open the file
			
			System.out.println("open files");
			//do some processing
			int n=args.length;
			System.out.println("n="+n);
			int a=45/n;
			System.out.println("a="+a);
			int b[]={10,20,30};
			b[50]=100;
			
			}
			catch(ArithmeticException ae)
			{
				//display the exception details
				System.out.println(ae);
				//display any message to the user
				System.out.println("please pass data whie processing this program");	
				
			}
			catch(ArrayIndexOutOfBoundsException aie)
			{
				//display the exception details
				//System.out.println(aie);
				//display any message to the user
				aie.printStackTrace();
				System.out.println("please see  that array index  is withn the range");
			}
			finally
			{
				//close the files
				System.out.println("close files");
				
			}
			
			
			
		}
		
		

	}


