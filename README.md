🌍 [English](README.md) | [Türkçe](README.tr.md) | [Español](README.es.md)

# 📦 WinGet — General User Guide

> **The Windows Package Manager CLI developed by Microsoft for managing applications.**

<div align="center">

![Version](https://img.shields.io/badge/version-latest-blue)
![License](https://img.shields.io/badge/license-MIT-green)
![Platform](https://img.shields.io/badge/platform-Windows%2010%2F11-darkgreen)

**⭐ Install, update, and manage your Windows applications directly from the command line.**

</div>

---

## 📚 Table of Contents

- [What is WinGet?](#what-is-winget)
- [Installation](#installation)
- [Getting Started](#getting-started)
- [Common Commands](#common-commands)
- [Configuration & Settings](#configuration--settings)
- [Environment Configuration (.winget)](#environment-configuration-winget)
- [Tips & Tricks](#tips--tricks)
- [Resources](#resources)
- [Quick Reference Card](#quick-reference-card)

---

## What is WinGet?

**WinGet** (Windows Package Manager) is a comprehensive package manager solution designed by Microsoft for Windows 10 and Windows 11. It allows developers and administrators to discover, install, upgrade, configure, and remove applications using a simple command-line interface.

WinGet helps automate application management, making setting up new developer environments fast and reproducible.

---

## Installation

WinGet comes pre-installed on modern versions of Windows 10 (1809 or later) and Windows 11 as part of the **App Installer** package.

If it is not available on your system, you can obtain it by:
1. Updating the **App Installer** application from the **Microsoft Store**.
2. Or downloading the latest bundle directly from the [official GitHub releases page](https://github.com/microsoft/winget-cli/releases).

---

## Getting Started

### 1. Open Your Terminal

Launch **PowerShell** or **Command Prompt** (CMD).

### 2. Search for a Package

To search for a package (e.g. Git):

```powershell
winget search git
```

### 3. Install the Package

Install the application using its unique Package ID:

```powershell
winget install Git.Git
```

---

## Common Commands

Run these commands in your shell to manage packages:

| Command | Description |
|---------|-------------|
| `winget search <query>` | Search for a package by name or ID |
| `winget install <id>` | Install the specified package |
| `winget uninstall <id>`| Uninstall the specified package |
| `winget upgrade <id>` | Upgrade the specified package |
| `winget upgrade --all` | Upgrade all outdated packages to their latest versions |
| `winget list` | Display all installed packages on your system |
| `winget show <id>` | Show detailed metadata for a specific package |
| `winget source <action>`| Manage package sources (list, add, remove, update) |

---

## Configuration & Settings

You can customize the behavior of the WinGet client, such as enabling experimental features or changing default settings.

- **Open Settings:** Run `winget settings` to open your configuration file (`settings.json`) in your default text editor.
- **Customization:** Customize options such as auto-update intervals, visual progress bar styles, and package installers.

---

## Environment Configuration (.winget)

WinGet supports YAML-based configuration files to setup entire developer environments in a single command.

- **File Format:** `.winget` (e.g. `configuration.winget`)
- **Execute Configuration:**
  ```powershell
  winget configure -f developer-env.winget
  ```

> ⚠️ **Security Tip:** Always inspect the contents of `.winget` files before executing them to verify the resources being installed.

---

## Tips & Tricks

- **Silent Installations:** Add the `--silent` or `-h` flag to run installers silently without pop-up wizard windows:
  ```powershell
  winget install Google.Chrome --silent
  ```
- **Bulk Export:** Export your currently installed applications to a JSON file:
  ```powershell
  winget export -o my-apps.json
  ```
- **Bulk Import:** Install all applications exported to a file in a single command:
  ```powershell
  winget import -i my-apps.json
  ```

---

## Resources

- **Official WinGet Documentation:** [learn.microsoft.com](https://learn.microsoft.com/windows/package-manager/)
- **GitHub Repository:** [github.com/microsoft/winget-cli](https://github.com/microsoft/winget-cli)

---

## Quick Reference Card

```
┌──────────────────────────────────────────────────────────┐
│                 📦 WinGet Quick Reference                │
├──────────────────────────────────────────────────────────┤
│                                                          │
│  INSTALL & REMOVE          MANAGE                        │
│  winget install  .......  Install package /list          │
│  winget uninstall.......  Uninstall       /upgrade --all │
│  winget upgrade  .......  Upgrade package                │
│                                                          │
│  SEARCH & SHOW             IMPORT & EXPORT               │
│  winget search   .......  Search packages winget import  │
│  winget show     .......  Show details    winget export  │
│                                                          │
│  CONFIG                                                  │
│  winget settings .......  Settings Panel                 │
│  winget source   .......  Manage sources                 │
│                                                          │
└──────────────────────────────────────────────────────────┘
```

---

> **WinGet** — MIT Licensed — Developed with ❤️ by Microsoft
