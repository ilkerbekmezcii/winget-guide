🌍 [English](README.md) | [Türkçe](README.tr.md) | [Español](README.es.md)

# 📦 WinGet — Guía General de Usuario

> **La CLI del Administrador de Paquetes de Windows desarrollada por Microsoft para gestionar aplicaciones.**

<div align="center">

![Versión](https://img.shields.io/badge/version-latest-blue)
![Licencia](https://img.shields.io/badge/license-MIT-green)

</div>

---

## 📚 Tabla de Contenidos

- [¿Qué es WinGet?](#qué-es-winget)
- [Instalación](#instalación)
- [Inicio Rápido](#inicio-rápido)
- [Comandos Comunes](#comandos-comunes)
- [Configuración y Ajustes](#configuración-y-ajustes)
- [Configuración de Entorno (.winget)](#configuración-de-entorno-winget)
- [Consejos y Trucos](#consejos-y-trucos)
- [Recursos](#recursos)
- [Tarjeta de Referencia Rápida](#tarjeta-de-referencia-rápida)

---

## ¿Qué es WinGet?

**WinGet** (Windows Package Manager) es la solución de administración de paquetes oficial de Microsoft para Windows 10 y Windows 11, facilitando la instalación y actualización de software.

---

## Instalación

WinGet viene preinstalado en las versiones modernas de Windows 10 (1809 o posterior) y Windows 11 como parte de la aplicación **App Installer** de Microsoft.

---

## Tarjeta de Referencia Rápida

```
┌──────────────────────────────────────────────────────────┐
│               📦 Referencia Rápida WinGet                │
├──────────────────────────────────────────────────────────┤
│                                                          │
│  INSTALAR & ELIMINAR       GESTIONAR                     │
│  winget install  .......  Instalar paq.   /list          │
│  winget uninstall.......  Desinstalar     /upgrade --all │
│  winget upgrade  .......  Actualizar                     │
│                                                          │
│  BUSCAR & MOSTRAR          IMPORTAR & EXPORTAR           │
│  winget search   .......  Buscar paquetes winget import  │
│  winget show     .......  Mostrar info    winget export  │
│                                                          │
│  CONFIGURACIÓN                                           │
│  winget settings .......  Ajustes de CLI                 │
│  winget source   .......  Gestionar fuentes              │
│                                                          │
└──────────────────────────────────────────────────────────┘
```
