/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.robo;

/**
 *
 * @author ameri
 */
public class Caixa {
    String nomeItem;
    int qtdItem;
    int posX;
    int posY;
    float peso;
    final float comprimento;
    final float largura;
    final float altura;
    public Caixa(String nomeItem, int qtdItem, int posX, int posY,
        float peso, float comprimento, float largura, 
        float altura) {
        this.nomeItem = nomeItem;
        this.qtdItem = qtdItem;
        this.posX = posX;
        this.posY = posY;
        this.peso = peso;
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }
}
