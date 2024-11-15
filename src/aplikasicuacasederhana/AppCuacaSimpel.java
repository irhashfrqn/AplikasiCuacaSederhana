/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasicuacasederhana;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.json.JSONObject;
import org.json.JSONArray;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author irhas
 */
public class AppCuacaSimpel extends javax.swing.JFrame {
    
    private final String API_KEY = "5f2e789bb9995298248f880da9cf06b3"; 
//    private final HashMap<String, double[]> cityCoordinates = new HashMap<>();
    private static final String WEATHER_API_URL = "https://api.openweathermap.org/data/2.5/weather";
    private static final String FORECAST_API_URL = "https://api.openweathermap.org/data/2.5/forecast";
    public AppCuacaSimpel() {
        System.setProperty("https.protocols", "TLSv1.2");
        
        
//        cityCoordinates.put("Banjarmasin", new double[]{-3.3244, 114.591});
//        cityCoordinates.put("Banjarbaru", new double[]{-3.4472, 114.7811});
//        cityCoordinates.put("Martapura", new double[]{-3.4167, 114.85});        
//        cityCoordinates.put("Pelaihari", new double[]{-3.799,114.705});
//        cityCoordinates.put("Kandangan", new double[]{-2.766, 115.249});
//        cityCoordinates.put("Barabai", new double[]{-2.5833, 115.3833});
//        cityCoordinates.put("Amuntai", new double[]{-3.4123, 115.2494});
//        cityCoordinates.put("Tanjung", new double[]{-3.4123, 114.8456});
//        cityCoordinates.put("Marabahan", new double[]{-3.4123, 114.8456});
//        cityCoordinates.put("Rantau", new double[]{-3.4123, 114.8456});

//        forecastTable.getColumnModel().getColumn(3).setCellRenderer(new DefaultTableCellRenderer() {
//            @Override
//            protected void setValue(Object value) {
//                if (value instanceof ImageIcon) {
//                    setIcon((ImageIcon) value);
//                    setText("");
//                } else {
//                    super.setValue(value);
//                }
//            }
//        });

        initComponents();
        setIconColumnRenderer();
        forecastTable.getColumnModel().getColumn(0).setPreferredWidth(50);        
        forecastTable.getColumnModel().getColumn(1).setPreferredWidth(15);
        forecastTable.getColumnModel().getColumn(2).setPreferredWidth(15);
        forecastTable.getColumnModel().getColumn(3).setPreferredWidth(20);

        
//         String urltest = "https://openweathermap.org/img/wn/10d@2x.png";
//        ImageIcon icontest = new ImageIcon(new URL(urltest));
//        weatherIcon.setIcon(icontest);
        
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cityComboBox = new javax.swing.JComboBox<>();
        checkWeatherButton = new javax.swing.JButton();
        currentWeatherLabel = new javax.swing.JLabel();
        forecastPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        forecastTable = new javax.swing.JTable();
        ramalanCuacaLabel = new javax.swing.JLabel();
        saveForecastDataBtn = new javax.swing.JButton();
        openForecastDataBtn = new javax.swing.JButton();
        weatherIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CUACA DAN PRAKIRAAN CUACA");
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel1.setNextFocusableComponent(cityComboBox);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Weather and Forecast");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Pilih Kota:");

        cityComboBox.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banjarmasin", "Banjarbaru", "Martapura", "Pelaihari", "Kandangan", "Barabai", "Amuntai", "Tanjung", "Marabahan", "Rantau" }));
        cityComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityComboBoxActionPerformed(evt);
            }
        });

        checkWeatherButton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        checkWeatherButton.setText("Lihat Cuaca");
        checkWeatherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkWeatherButtonActionPerformed(evt);
            }
        });

        currentWeatherLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        currentWeatherLabel.setText("Cuaca Sekarang:");

        forecastTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        forecastTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Waktu", "Temperatur", "Keterangan", "Ikon Cuaca"
            }
        ));
        forecastTable.setMinimumSize(new java.awt.Dimension(60, 20));
        forecastTable.setRowHeight(100);
        jScrollPane1.setViewportView(forecastTable);

        ramalanCuacaLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ramalanCuacaLabel.setText("Ramalan Cuaca :");

        saveForecastDataBtn.setText("Simpan Data Ramalan Cuaca");
        saveForecastDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveForecastDataBtnActionPerformed(evt);
            }
        });

        openForecastDataBtn.setText("Buka Data Ramalan Cuaca");
        openForecastDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openForecastDataBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout forecastPanelLayout = new javax.swing.GroupLayout(forecastPanel);
        forecastPanel.setLayout(forecastPanelLayout);
        forecastPanelLayout.setHorizontalGroup(
            forecastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forecastPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(forecastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(forecastPanelLayout.createSequentialGroup()
                        .addGroup(forecastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ramalanCuacaLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forecastPanelLayout.createSequentialGroup()
                        .addComponent(openForecastDataBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveForecastDataBtn)))
                .addContainerGap())
        );
        forecastPanelLayout.setVerticalGroup(
            forecastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, forecastPanelLayout.createSequentialGroup()
                .addComponent(ramalanCuacaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(forecastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveForecastDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openForecastDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        weatherIcon.setText("Pilih Kota Terlebih Dahulu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkWeatherButton))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(currentWeatherLabel)
                        .addGap(18, 18, 18)
                        .addComponent(weatherIcon)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(forecastPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(forecastPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkWeatherButton, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(cityComboBox))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(currentWeatherLabel)
                            .addComponent(weatherIcon))))
                .addGap(101, 101, 101))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cityComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityComboBoxActionPerformed

    private void checkWeatherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkWeatherButtonActionPerformed
        String selectedCity = (String) cityComboBox.getSelectedItem();
          
        fetchCurrentWeather(selectedCity);                
        fetchHourlyForecast(selectedCity);

    }//GEN-LAST:event_checkWeatherButtonActionPerformed

    private void openForecastDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openForecastDataBtnActionPerformed
        openForecastDataFromCSV();
    }//GEN-LAST:event_openForecastDataBtnActionPerformed

    private void saveForecastDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveForecastDataBtnActionPerformed
        saveForecastDataToCSV();
    }//GEN-LAST:event_saveForecastDataBtnActionPerformed

    
    private void fetchCurrentWeather(String city) {
        try {
            String apiUrl = WEATHER_API_URL + "?q=" + city + "&appid=" + API_KEY + "&units=metric&lang=id";
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                in.close();
                conn.disconnect();

                JSONObject json = new JSONObject(content.toString());
                double temp = json.getJSONObject("main").getDouble("temp");
                String description = json.getJSONArray("weather").getJSONObject(0).getString("description");
                String iconCode = json.getJSONArray("weather").getJSONObject(0).getString("icon");

                currentWeatherLabel.setText("Sekarang: " + temp + "°C, " + description);
                String iconCurrentURL = "https://lumnaphoto.com/irhash-api/weather/"+ iconCode +"@2x.png";
//                JLabel weatherIcon = new JLabel();
                weatherIcon.setText("");
                weatherIcon.setIcon(new ImageIcon(new URL(iconCurrentURL)));
//                JLabel iconLabel = new JLabel(icon);

            } else {
                JOptionPane.showMessageDialog(this, "Tidak dapat mengambil data cuaca", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void fetchHourlyForecast(String city) {
        try {
            // Gantikan dengan API key Anda
            String apiKey = "5f2e789bb9995298248f880da9cf06b3";
            String urlString = String.format(
                "https://api.openweathermap.org/data/2.5/forecast?q=%s&appid=%s&units=metric&lang=id",
                city, apiKey
            );

            StringBuilder sb;
            try (InputStream is = new URL(urlString).openStream()) {
                sb = new StringBuilder();
                int byteRead;
                while ((byteRead = is.read()) != -1) {
                    sb.append((char) byteRead);
                }
            }

            // Parse JSON respons
            JSONObject jsonResponse = new JSONObject(sb.toString());
            JSONArray hourlyForecast = jsonResponse.getJSONArray("list");

            // Ambil model tabel yang sudah ada
            DefaultTableModel model = (DefaultTableModel) forecastTable.getModel();
            model.setRowCount(0); // Hapus semua data lama di tabel
            
            // Iterasi data prakiraan cuaca (misalnya, untuk 8 interval ke depan)
            for (int i = 0; i < 12; i++) {
                JSONObject forecast = hourlyForecast.getJSONObject(i);

                // Ambil waktu, suhu, dan deskripsi cuaca
                String dateTime = forecast.getString("dt_txt");
                String[] parts = dateTime.split(" ");
                String datePart = parts[0]; // "2024-11-15"
                String timePart = parts[1]; // "19:00:00"
                
                SimpleDateFormat inputDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                SimpleDateFormat outputDateFormat = new SimpleDateFormat("dd MMM yyyy");
                Date date = inputDateFormat.parse(datePart);
                String formattedDate = outputDateFormat.format(date); // "15 Nov 2024"

                // Ubah format waktu
                SimpleDateFormat inputTimeFormat = new SimpleDateFormat("HH:mm:ss");
                SimpleDateFormat outputTimeFormat = new SimpleDateFormat("HH:mm");
                Date time = inputTimeFormat.parse(timePart);
                String formattedTime = outputTimeFormat.format(time); // "19:00"

                // Gabungkan hasilnya
                String formattedDateTime = formattedDate + " - " + formattedTime; // "15 Nov 2024 - 19:00"

                // Debug atau tambahkan ke GUI
                System.out.println(formattedDateTime);
                
                double temperature = forecast.getJSONObject("main").getDouble("temp");
                String description = forecast.getJSONArray("weather").getJSONObject(0).getString("description");
                String iconCode = forecast.getJSONArray("weather").getJSONObject(0).getString("icon");
                String iconUrl = "https://lumnaphoto.com/irhash-api/weather/" + iconCode + "@2x.png";

                // Tambahkan baris ke tabel
                model.addRow(new Object[]{formattedDateTime, temperature + "°C", description, new ImageIcon(new URL(iconUrl))});
                
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal mendapatkan data cuaca.");
        }
    }

    private void setIconColumnRenderer() {
        TableColumn iconColumn = forecastTable.getColumnModel().getColumn(3); // Kolom untuk ikon
        iconColumn.setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                // Jika nilai adalah ImageIcon, tampilkan ikon
                if (value instanceof ImageIcon) {
                    JLabel label = new JLabel((ImageIcon) value);
                    label.setHorizontalAlignment(JLabel.CENTER); // Pusatkan ikon
                    return label;
                }
                // Jika tidak, tampilkan teks default
                return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            }
        });
        
    }

    private void saveForecastDataToCSV() {
        try {
            // Pilih file untuk menyimpan
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showSaveDialog(this);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                if (!file.getName().endsWith(".csv")) {
                    file = new File(file.getAbsolutePath() + ".csv");
                }

                // FileWriter untuk menulis CSV
                FileWriter fileWriter = new FileWriter(file);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                // Menulis header
                bufferedWriter.write("Tanggal dan Waktu,Temperature,Deskripsi\n");

                // Ambil data dari tabel
                DefaultTableModel model = (DefaultTableModel) forecastTable.getModel();
                for (int row = 0; row < model.getRowCount(); row++) {
                    String dateTime = (String) model.getValueAt(row, 0);
                    String temperature = (String) model.getValueAt(row, 1);
                    String description = (String) model.getValueAt(row, 2);
                    bufferedWriter.write(dateTime + "," + temperature + "," + description + "\n");
                }

                bufferedWriter.close();
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan ke CSV!");
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan data.");
        }
    }
    
    private void openForecastDataFromCSV() {
        try {
            // Pilih file untuk dibuka
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(this);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();

                // FileReader untuk membaca CSV
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                DefaultTableModel model = (DefaultTableModel) forecastTable.getModel();

                // Kosongkan tabel sebelum mengisi data baru
                model.setRowCount(0);

                // Lewati header CSV
                bufferedReader.readLine();

                // Membaca baris per baris
                while ((line = bufferedReader.readLine()) != null) {
                    String[] data = line.split(",");
                    String dateTime = data[0];
                    String temperature = data[1];
                    String description = data[2];

                    // Menambahkan data ke dalam tabel
                    model.addRow(new Object[]{dateTime, temperature, description});
                }

                bufferedReader.close();
                JOptionPane.showMessageDialog(this, "Data berhasil dimuat dari CSV!");
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat membuka file.");
        }
    }


    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppCuacaSimpel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppCuacaSimpel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppCuacaSimpel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppCuacaSimpel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppCuacaSimpel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkWeatherButton;
    private javax.swing.JComboBox<String> cityComboBox;
    private javax.swing.JLabel currentWeatherLabel;
    private javax.swing.JPanel forecastPanel;
    private javax.swing.JTable forecastTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton openForecastDataBtn;
    private javax.swing.JLabel ramalanCuacaLabel;
    private javax.swing.JButton saveForecastDataBtn;
    private javax.swing.JLabel weatherIcon;
    // End of variables declaration//GEN-END:variables
}
