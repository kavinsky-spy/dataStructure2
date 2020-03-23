



var NoArvore = new Object(e, i, d){
    NoArvore.info = i;
esq = e;
dir = d;
}

function Prefixo(raiz) {
    if (raiz == null) return;
    console.log(raiz.info);

    Prefixo(raiz.esq);
    Prefixo(raiz.dir);
};


var n1 = NoArvore(null, 'A', null);
var n2 = NoArvore(null, 'C', null);
var n3 = NoArvore(null, 'F', null);
var n4 = NoArvore(n1, 'E', n2);
var n5 = NoArvore(null, 'D', n3);
var raiz = NoArvore(n4, 'B', n5);


prefixo.Prefixo(raiz);



