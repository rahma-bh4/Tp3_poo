public class MaDate{
private int j;
private int m;
private int a;
public String toString()
{
 String ch=j+"/"+m+"/"+a;
return ch;

}
public int getJour()
{return j;}
public int getMois()
{return m;}
public int getAnnee()
{return a;}
public void setJour(int jour)
{
 j=jour;
}
public void setMois(int mois)
{
 m=mois;
}
public void setAnne(int annee)
{
 a=annee;
}
public MaDate(int jour,int mois,int annee)
{
  j=jour;
  m=mois;
  a=annee;
}
public MaDate(int annee)
{
  a=annee;
  m=0;
  j=0;
}
public void ajouterUnJour()
{
 if( m==1 || m==3 || m==5 || m==7 || m==8 || m==10|| m==12 )
{
   if(j==31)
{  if(m==12){
    j=1;
    m=1;
    a++;}
    else { j=1;
    m++;}

  }  else 
{  j++;}
}else{
if(m==2){
  if(a%4==0)
{ if(j==29){
  j=1;
  m=3;}
   else{ j++;}

}
else{
 if(j==28){ j=1;
m=3;}
} }
else {
if(j==30)
{
  j=1;
  m++;
}

}

}
}
public void ajouterPlusieursJours(int n)
{
  for(int i=0;i<n;i++)
  {
    this.ajouterUnJour();
  }
}
public void ajouterUnMois()
{
  if(m==12)
  {
    m=1;
    a++;
  }
  else{
    m++;
  }

}
public void ajouterUnAn()
{
  a++;
}
}