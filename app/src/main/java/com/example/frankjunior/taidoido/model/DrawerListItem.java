package com.example.frankjunior.taidoido.model;

/**
 * Created by frankjunior on 01/03/16.
 * Classe usada no @NavigationDrawerAdapter para preencher e formar o menu
 */
public class DrawerListItem {

    public  final boolean clickable;
    public final boolean selectable;
    public final int iconResource;
    public final String textTitle;
    public final String textLabel;

    // construtor padrão para adicionar o separador
    public DrawerListItem() {
        this.clickable = false;
        this.selectable = false;
        this.iconResource = 0;
        this.textTitle = null;
        this.textLabel = null;
    }

    // construtor padrão para adicionar Label na lista
    public DrawerListItem(String textLabel) {
        this.clickable = false;
        this.selectable = false;
        this.iconResource = 0;
        this.textTitle = null;
        this.textLabel = textLabel;
    }

    // construtor para adicionar um item no NavigationDrawer
    public DrawerListItem(boolean selectable, int iconResource, String textTitle) {
        this.clickable = true;
        this.selectable = selectable;
        this.iconResource = iconResource;
        this.textTitle = textTitle;
        this.textLabel = null;
    }
}
