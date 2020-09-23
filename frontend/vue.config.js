module.exports = {
  devServer: {
    proxy: {
      "/api": {
        target: "http://localhost:" + process.env.VUE_APP_SPRING_PORT,
        ws: true,
        changeOrigin: true
      }
    }
  },

  outputDir: "target/dist",
  assetsDir: "static"
};
