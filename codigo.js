function fibonnaci(n) {
    if (n == 1 || n == 2) return 1;


    if (n > 2) return fibonnaci(n - 1) + fibonnaci(n - 2);

}

function hanoi(n, o, d, t) {
    if (n == 1) {
        console.log('movendo disco ' + n + ' da torre ' + o + ' para torre ' + d);
    }
    else {
        hanoi(n - 1, o, d, t);
        console.log('Mover disco ' + n + ' da torre ' + o + ' para torre ' + d);
        hanoi(n - 1, t, d, o);
    }

}

//1
function cubo(n) {
    if (n == 0 || n == 1) return 1;

    return cubo(n - 1) + (n * n * n);
}

//2
var v = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18];

function vetor(v, c, f) {
    if (c == f) return v[c];
    return v[c] + vetor(v, c + 1, f);
}


