//
//  ContentView.swift
//  Modern language path
//
//  Created by Pablo Bautista on 11/04/21.
//

import SwiftUI

struct ContentView: View {
    var body: some View {
        NavigationView {
            Text("Hi! I'm a sample text to show the possibilities of declarative UI 😄🤓")
                .foregroundColor(.black)
                .font(.system(size: 48))
                .fontWeight(.medium)
            .navigationBarTitle("Modern languagues path", displayMode: .automatic)
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}


