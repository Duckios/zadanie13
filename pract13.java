class Main {
  public static void main(String[] args) {
    System.out.print("Zadanie 1\n");
    int z1=10;
    int[][] a=new int[z1][z1];
    for (int i=0;i < a.length;i++)
    {
      for (int j=0;j < a[i].length;j++)
      {
       a[i][j]=(int)(Math.round(Math.random()*100) + 0);
      }
    }
    for (int i=0;i < a.length;i++,System.out.println())
    {
      for (int j=0;j < a[i].length;j++)
      {
        System.out.print(a[i][j]+"\t");
      }
    }
    System.out.print("Zadanie 2\n");
    
    for (int g=0; g<10; g++)
    {
      for (int i=0;i < a.length;i++)
      {
        for (int j=0;j < a[i].length-1;j++)
        {
          int prom=0;
          if (a[j][i]>a[j+1][i])
          {
            prom=a[j][i];
            a[j][i]=a[j+1][i];
            a[j+1][i]=prom;
          }
        }
      }
    }
    for (int i=0;i < a.length;i++,System.out.println())
    {
      for (int j=0;j < a[i].length;j++)
      {
        System.out.print(a[i][j]+"\t");
      }
    }
  }
}