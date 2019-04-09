
package aplicaçãohash;
import java.util.*;


public class SeparateChainingHashTable {
    private LinkedList[ ] theLists;
    private static final int DEFAULT_TABLE_SIZE = 101;
    public SeparateChainingHashTable( ) {
        this( DEFAULT_TABLE_SIZE );
    }
    public SeparateChainingHashTable( int size ) {
        theLists = new LinkedList[nextPrime(size)]; // Garante que o tamanho é primo
        for( int i = 0; i < theLists.length; i++ )
            theLists[ i ] = new LinkedList( );
    }
    public void makeEmpty( ) {
    for( int i = 0; i < theLists.length; i++ )
        theLists[ i ].clear( );
    }
    private static int nextPrime( int n ) {
    if( n % 2 == 0 )
        n++;
    for( ; !isPrime(n); n+=2)
    ;
    return n;
    }
    private static boolean isPrime( int n ) {
    if( n == 2 || n == 3 )
        return true;
    if( n == 1 || n % 2 == 0 )
        return false;
    for( int i = 3; i * i <= n; i+=2)
        if( n % i == 0 )
        return false;
    return true;
    }
    public void insert( Hashable x ) {
    LinkedList whichList = theLists[ x.hash(theLists.length ) ];
    if (whichList.indexOf(x)==-1) // equals será usado aqui
        whichList.add(0,x);
    }
    public void remove( Hashable x ) {
    theLists[ x.hash( theLists.length )].remove(x);
    }
    public Hashable find( Hashable x ) {
        int Position;
        Position = theLists[ x.hash(theLists.length)].indexOf(x);
    return (Hashable)theLists[ x.hash(theLists.length)].get(Position); // equals será usado aqui
    }
    
    public void size() {
        int i;
        for (i=0; i<theLists.length; i++) {
            System.out.println("Posição "+i+"=> "+theLists[i].size());
        }
    }
    
    public void test() {
        int zero,a,b,c,d,e,f,g,h,i,j,l,m,n,o,p,q,r,s,cont;
        zero=a=b=c=d=e=f=g=h=i=j=l=m=n=o=p=0;
        for (cont=0; cont<theLists.length; cont++) {
            if (theLists[cont].size() == 0) {
                zero++;
            }
            
            if (theLists[cont].size() == 1) {
                a++;
            }
            
            if (theLists[cont].size() == 2) {
                b++;
            }
            
            if (theLists[cont].size() == 3) {
                c++;
            }
            
            if (theLists[cont].size() == 4) {
                d++;
            }
            
            if (theLists[cont].size() == 5) {
                e++;
            }
            
            if (theLists[cont].size() == 6) {
                f++;
            }
            
            if (theLists[cont].size() == 7) {
                g++;
            }
            
            if (theLists[cont].size() == 8) {
                h++;
            }
            
            if (theLists[cont].size() == 9) {
                i++;
            }
            
            if (theLists[cont].size() == 10) {
                j++;
            }
            
            if (theLists[cont].size() == 11) {
                l++;
            }
            
            if (theLists[cont].size() == 12) {
                m++;
            }
            
            if (theLists[cont].size() == 13) {
                n++;
            }
            
            if (theLists[cont].size() == 14) {
                o++;
            }
            
            if (theLists[cont].size() == 15) {
                p++;
            }
        }
        
        System.out.println("Zero elemento ocupa "+zero+" posições"+
                                "\nUm elemento ocupa "+a+" posições"+
                                "\nDois elementos ocupam "+b+" posições"+            
                                "\nTres elemento ocupa "+c+" posições"+
                                "\nQuatro elemento ocupa "+d+" posições"+
                                "\nCinco elemento ocupa "+e+" posições"+
                                "\nSeis elemento ocupa "+f+" posições"+
                                "\nSete elemento ocupa "+g+" posições"+
                                "\nOito elemento ocupa "+h+" posições"+
                                "\nNove elemento ocupa "+i+" posições"+
                                "\nDez elemento ocupa "+j+" posições"+
                                "\nOnze elemento ocupa "+l+" posições"+
                                "\nDoze elemento ocupa "+m+" posições"+
                                "\nTreze elemento ocupa "+n+" posições"+
                                "\nQuartoze elemento ocupa "+o+" posições"+
                                "\nQuinze elemento ocupa "+p+" posições");
    }

    public void printTable(){
        System.out.println("Já chamou");
        int colidiram;
        for(int i=0; i<theLists.length; i++){
                if(theLists[i].size()>=2){
                    System.out.println("================COLIDIRU=====================");
                    for (int j = 0; j < theLists[i].size(); j++) {
                        System.out.println(theLists[i].get(j));   
                    }
                    System.out.println("=============================================");
                    colidiram=theLists[i].size();
                }else{
                System.out.println(theLists[i].toString());   
                System.out.println("");
                } 
            
            }
        }
    }

    

