struct item {
  int Key, Priority;
  item *l, *r;
  item() { }
  item (int Key, int Priority) :
       Key(Key), Priority(Priority), l(NULL), r(NULL) { }
};

typedef item* pitem;

void split (pitem t, int Key, pitem &l, pitem &r) {
  if (!t) {
    l = r = NULL;
  } else if (Key <= t->Key) {
    split (t->l, Key, l, t->l);
    r = t;
  } else {
    split (t->r, Key, t->r, r);
    l = t;
  }
}

void merge (pitem l, pitem r, pitem &t) {
  if (!l || !r) {
    t = l ? l : r;
  } else if (l->Priority > r->Priority) {
    merge (l->r, r, l->r);
    t = l;
  } else {
    merge (l, r->l, r->l);
    t = r;
  }
}

int GetMin(pitem t) {
  if (t == NULL) return -1;
  if (t->l == NULL) return t->Key;
  return GetMin(t->l);
}

void add(int i) {
  split(Tree,i,L,R);
  if(GetMin(R) != i) {
    merge(L,new item(i,rand()),Tree);
    merge(Tree,R,Tree);
  } else {
    merge(L,R,Tree);
  }
}

void next(int i) {
  split(Tree,i,L,R);
  int y = GetMin(R);
  printf("%d\n",y);
  merge(L,R,Tree);
}

#define MINF -2000000000

int y = MINF;

int n;
char c;
int i;
scanf("%d",&n);
while(n--) {
  scanf(" %c %d",&c,&i);
  if (c == '+') {
    if (y > MINF) {
      i = (i + y) % 1000000000;
      y = MINF;
    }
    add(i);
  } else {
    next(i);
  }
}
