import { defineConfig } from 'vite';

// Use defineConfig and export it as default
export default defineConfig({
  server: {
    host: '0.0.0.0',  // Allow external access
    port: 5173,        // Or change to another port if needed
  }
});

