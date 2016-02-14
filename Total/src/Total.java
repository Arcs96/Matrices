
import java.util.Scanner;

public class Total {
	Scanner sc;
	public int[][] mat;
	int Filas=0;
	int Columnas=0;
	
	public Total(){
		sc = new Scanner(System.in);
	    mat=new int[4][5];
	    plenarMat();
	}
	
    public void plenarMat(){
   	 for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
           	 System.out.println("matriu["+f+"]["+c+"]: "); 
                System.out.print("Ingrese un numero:");
                mat[f][c]=sc.nextInt();
            }
            System.out.println("");
   	 }
     System.out.println("");
     System.out.println(" "+" "+"\t"+"Suma filas/columnas/total matriz:");
     System.out.println("");
   }
    
   public void sumafilas(int a[][]){
	   int suma1=0;
	   int suma2=0;
	   int suma3=0;
	   int suma4=0;
	   int sumatorioFil=0;
	
  			 for(int j=0;j<mat[0].length;j++){ 
  				 suma1 += mat[0][j];
  				 System.out.print("\t"+"["+a[0][j]+"]");
  			 }
  			 System.out.println("\t"+ suma1);
  			 
  			 for(int j=0;j<mat[1].length;j++){   
  				 suma2 += mat[1][j];
  				 System.out.print("\t"+"["+a[1][j]+"]");
  			 }
  			 System.out.println("\t"+ suma2);
  			
  			 for(int j=0;j<mat[2].length;j++){ 
  				 suma3 += mat[2][j];
 				 System.out.print("\t"+"["+a[2][j]+"]");
 			 }
  			 System.out.println("\t"+ suma3);
  			
  			 for(int j=0;j<mat[3].length;j++){  
  				 suma4 += mat[3][j];
 				 System.out.print("\t"+"["+a[3][j]+"]");
 			 }
  			 System.out.println("\t"+ suma4);
  			 
  			 System.out.println("");
  			 
  			sumatorioFil=suma1+suma2+suma3+suma4;
  			setFilas( sumatorioFil );
  	   }
   
   public void sumacolumnas(){
	   int suma1=0;
	   int suma2=0;
	   int suma3=0;
	   int suma4=0;
	   int suma5=0;
	   int sumatorioColum=0;
	   
	         for(int j=0;j<mat.length;j++){ 
			     suma1 += mat[j][0];
		     }
	         System.out.print(" "+" "+"\t"+suma1+"");
	         
	         for(int j=0;j<mat.length;j++){ 
			     suma2 += mat[j][1];
		     }
	         System.out.print(" "+" "+"\t"+suma2+"");
	         
	         for(int j=0;j<mat.length;j++){ 
			     suma3 += mat[j][2];
		     }
	         System.out.print(" "+" "+"\t"+suma3+"");
	         
	         for(int j=0;j<mat.length;j++){ 
			     suma4 += mat[j][3];
		     }
	         System.out.print(" "+" "+"\t"+suma4+"");
	         
	         for(int j=0;j<mat.length;j++){ 
			     suma5 += mat[j][4];
		     }
	         System.out.print(" "+" "+"\t"+suma5+"");
	         
	         sumatorioColum=suma1+suma1+suma2+suma3+suma4;
	         setColumnas( sumatorioColum );
   }
   
   public int sumatoriTotal(){
	   int sumaTotal=0;
	   sumaTotal=Filas+Columnas;
	   return sumaTotal;
   }

   public int getFilas() {
	return Filas;
   }

   public int getColumnas() {
	return Columnas;
   }
   
	public static void main(String[] args) {
		Total tot = new Total();
		tot.sumafilas(tot.mat);
		tot.sumacolumnas();
		System.out.println("\t"+tot.sumatoriTotal());

	}
}
