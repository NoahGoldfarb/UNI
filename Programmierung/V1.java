static void main(){
    for (int i = 0; i<20; i++){

        System.out.println(f(i));
        System.out.println((double)f(i+1)/(double)f(i));
    }
}
static int f(int n){
    int lastfib = 0;
    int stlfib = 1;
    for (int i=2; i<=n; i++){
        int newfib = lastfib+stlfib;
        stlfib = lastfib;
        lastfib = newfib;
    }
    return lastfib;
}