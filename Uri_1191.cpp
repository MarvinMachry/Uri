
#include <iostream>
#include <cstdio>
#include <cstdlib>
#include <cstring>

using namespace std;


typedef struct arv {
    char info;
    arv *sae;
    arv *sad;

} arvore;

arvore* cria_arvore() {
    return NULL;
}

int testa_vazia(arvore *t) {
    return t == NULL;
}

void mostra_posordem(arvore *t) {
    if(!testa_vazia(t)) {
        mostra_posordem(t->sae);
        mostra_posordem(t->sad);
        cout << t->info;
    }
}

void inserir(arvore **t, int v) {
    //arvore esta vazia
    if(*t == NULL) {
        *t = new arvore;
        (*t)->sae = NULL;
        (*t)->sad = NULL;
        (*t)->info = v;
    } else {
        if(v < (*t)->info)
            inserir(&(*t)->sae, v);
        else
            inserir(&(*t)->sad, v);
    }
}

void limpar(arvore *t) {
    if(t->sae != NULL)
        limpar(t->sae);
    if(t->sad != NULL)
        limpar(t->sad);
    delete(t);
}

main() {
    int menu = -1;
    char txt[26];
    char txt2[26];
    char num;
    arvore *a = cria_arvore();

    cin>> txt;
    for(int i = 0; i < strlen(txt); i++)
        inserir(&a, txt[i]);
    cin>>   txt2;
    fflush(stdin);
    mostra_posordem(a);
    limpar(a);
    mostra_posordem(a);




}
