bool canEatAll(int* piles, int pilesSize, int h, int k) {
    long long hoursSpent = 0;
    for (int i = 0; i < pilesSize; i++) {
        hoursSpent += (piles[i] + k - 1) / k;
    }
    return hoursSpent <= h;
}

int minEatingSpeed(int* piles, int pilesSize, int h) {
    int left = 1;
    int right = 0;
    for (int i = 0; i < pilesSize; i++) {
        if (piles[i] > right) {
            right = piles[i];
        }
    }
    
    int result = right;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        
        if (canEatAll(piles, pilesSize, h, mid)) {
            result = mid;       
            right = mid - 1;    
        } else {
            left = mid + 1;     
        }
    }
    
    return result;
}
