🌍 [English](README.md) | [Türkçe](README.tr.md) | [Español](README.es.md)

# 📦 WinGet — Genel Kullanım Kılavuzu

> **Microsoft tarafından uygulamaları yönetmek için geliştirilen Windows Paket Yöneticisi.**

<div align="center">

![Sürüm](https://img.shields.io/badge/version-latest-blue)
![Lisans](https://img.shields.io/badge/license-MIT-green)

</div>

---

## 📚 İçindekiler

- [WinGet Nedir?](#winget-nedir)
- [Kurulum](#kurulum)
- [Hızlı Başlangıç](#hızlı-başlangıç)
- [Sık Kullanılan Komutlar](#sık-kullanılan-komutlar)
- [Yapılandırma ve Ayarlar](#yapılandırma-ve-ayarlar)
- [Ortam Yapılandırması (.winget)](#ortam-yapılandırması-winget)
- [İpuçları ve Hileler](#ipuçları-ve-hileler)
- [Kaynaklar](#kaynaklar)
- [Hızlı Başvuru Kartı](#hızlı-başvuru-kartı)

---

## WinGet Nedir?

**WinGet**, Windows 10 ve Windows 11 için Microsoft tarafından sunulan kapsamlı bir paket yöneticisidir. Komut satırından uygulamaları yükleme, güncelleme ve kaldırma süreçlerini otomatikleştirmenizi sağlar.

---

## Kurulum

WinGet, modern Windows 10 (1809 veya daha yeni) ve Windows 11 sürümlerinde varsayılan olarak **Uygulama Yükleyicisi** ile birlikte kurulu gelir. Microsoft Store üzerinden Uygulama Yükleyicisini güncelleyerek en son sürüme erişebilirsiniz.

---

## Hızlı Başvuru Kartı

```
┌──────────────────────────────────────────────────────────┐
│                 📦 WinGet Hızlı Başvuru                  │
├──────────────────────────────────────────────────────────┤
│                                                          │
│  YÜKLE & KALDIR            YÖNET                         │
│  winget install  .......  Uygulama yükle  /list          │
│  winget uninstall.......  Uygulama kaldır /upgrade --all │
│  winget upgrade  .......  Güncelle                       │
│                                                          │
│  ARA & GÖSTER              İTHALAT & İHRACAT             │
│  winget search   .......  Uygulama ara    winget import  │
│  winget show     .......  Detay göster    winget export  │
│                                                          │
│  AYARLAR                                                 │
│  winget settings .......  Ayarlar Paneli                 │
│  winget source   .......  Kaynakları yönet               │
│                                                          │
└──────────────────────────────────────────────────────────┘
```
