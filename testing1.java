int count[]= new int[6];
int max =0;

for(int i=0; i<arr.size(); i++){
    count[arr.get(i)]++;
    
    if(count[arr.get(i)]>max){
        max=count[arr.get(i)];
    }
}

for(int i=0;i<count.length-1;i++){
    for(int j=i+1; j<count.length;j++){
        if(count[i]==count[j]&&max==count[i]&&count[j]==max){
            if(i<j){
                return max;
            }
        }
    }
}


for(int i=0;i<count.length;i++){
    if(max==count[i]){
            max=i;
    }
}

return max;
