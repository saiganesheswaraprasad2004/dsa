#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* left;
    struct Node* right;
};

struct Node* createNode(int data){
    struct Node* newNode=(struct Node*) malloc (sizeof(struct Node));
    newNode->data=data;
    newNode->left=newNode->right=NULL;
    return newNode;
}

int height(struct Node* root){
    if(root==NULL)
        return -1;
    int leftHeight=height(root->left);

}

int countNonleafNodes(struct Node* root){
    if (root == NULL)
        return 0;

    if(root->left==NULL && root->right==NULL)
        return 0;

    return 1+countNonleafNodes(root->left) + countNonleafNodes(root->right);
}

// Function to insert nodes in BST
struct Node* insert(struct Node* node, int data){
    
    if (node == NULL) return createNode(data);;;.

    if(data < node->data)
        node->left=insert(node->left,data);
    else if (data>node->data)
        node->right=insert(node->right, data);
    return node;
}

// iterative fureturn root;\]
    }
}

