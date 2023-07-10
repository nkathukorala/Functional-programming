object tutorial5_2 extends App{
    
    def GCD(a:Int,b:Int):Int=b  match{
        case 0=>a
        case x if x>a => GCD(x,a)
        case x => GCD (x,a%x)
  
    }

     def prime(p:Int,n:Int=2):Boolean=n match{
        case x if(x==p)=>true
        case x if GCD(p,x)>1=> false
        case x => prime (p,x+1)
  
    }
     

    def primeSeq(n:Int):Unit=n match {
        case x if( x>1 && prime(x))=>{primeSeq(x-1);println(x)}
        case x if(x>1)=>primeSeq(x-1)
        case x if (x==1)=>return

    }

    primeSeq(10)
}