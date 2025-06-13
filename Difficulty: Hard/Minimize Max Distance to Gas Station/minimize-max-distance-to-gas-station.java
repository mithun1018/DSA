// User function Template for Java

class Pair{
    double first;
    int second;
    Pair(double first,int second){
        this.first=first;
        this.second=second;
    }
}


class Solution {
    public static double findSmallestMaxDist(int stations[], int k) {
        // code here
        
        Comparator<Pair> com=new Comparator<>(){
            public int compare(Pair a1,Pair a2){
                return Double.compare(a2.first,a1.first);
            }
        };
        PriorityQueue<Pair> pq=new PriorityQueue<>(com);
        for(int i=0;i<stations.length-1;i++){
            pq.add(new Pair(stations[i+1]-stations[i],i));
        }
        
        int[] arr=new int[stations.length-1];
        for(int i=1;i<=k;i++)
        {
            Pair pair=pq.poll();
            int ind=pair.second;
            arr[ind]++;
            double dif=(double)stations[ind+1]-(double)stations[ind];
            double len=dif/(double)(arr[ind]+1);
            pq.add(new Pair(len,ind));
        }
        return pq.poll().first;
    }
}
