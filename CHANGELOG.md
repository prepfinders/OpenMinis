# Changelog

All notable user-visible changes to the OpenMinis apps (iOS and Android).
Format follows [Keep a Changelog](https://keepachangelog.com/en/1.1.0/).

## [Unreleased]

## [2.0] (iOS build 2, Android versionCode 26) — 2026-10-02

### Changed
- Rebranded both apps to **Auris AI** from the design handoff
  (`design_handoff_auris_rebrand`). Display name is "Auris AI"; UI copy,
  permission prompts, notifications, Shortcuts and Files/extension names say
  "Auris". Bundle identifiers, package names, file extensions (`.minisbak`),
  CLI tools (`minis-config`, `minis-open`) and sync/storage identifiers are
  unchanged so existing installs upgrade in place.
- New app icons built from the Halo mark (direction 1a): Deep ground with the
  Cream/Mist mark, and a `#141219` dark variant with the Mist/Royal mark.
  Android adaptive icon uses a Royal ground, plus a Halo monochrome layer for
  themed icons; the Light/Dark forced icons and shortcut icons follow.
- iOS launch screen now shows the Halo mark, the Auris AI wordmark and the
  "Think out loud." tagline on Deep.
- Brand palette applied to both themes: Ink / Deep / Royal / Mist / Cream with
  the handoff's light and dark semantic tokens (accent, primary actions, send
  button, links, chips, backgrounds, text, separators). Android maps them onto
  the Material 3 `ColorScheme` and `ChatColors`; iOS gets brand color sets and
  a Royal/Mist `AccentColor`.
- iOS legacy alternate icons ("Light (Legacy)", "Dark (Legacy)") keep the
  previous artwork.

## [1.13] — 2026-09-27

- Android chat, markdown, theme and interface work through the 1.13 line;
  provider, thinking and storage work; iSH submodule tracked on master.
