package cc.suffro.bpmanalyzer.bpmanalyzing.analyzers.combfilter

import cc.suffro.bpmanalyzer.bpmanalyzing.analyzers.AnalyzerParams
import cc.suffro.bpmanalyzer.bpmanalyzing.analyzers.ParameterizedCacheAnalyzer
import cc.suffro.bpmanalyzer.data.TrackInfo
import cc.suffro.bpmanalyzer.wav.data.Wav
import java.nio.file.Path

class CombFilterCacheAnalyzerTestImpl : ParameterizedCacheAnalyzer<Wav, TrackInfo> {
    override fun analyze(data: Wav): TrackInfo {
        return TrackInfo(trackName = "test", bpm = 100.0)
    }

    override fun analyze(
        data: Wav,
        params: AnalyzerParams<TrackInfo>,
    ): TrackInfo {
        TODO("Not yet implemented")
    }

    override fun getAndAnalyze(path: String): TrackInfo {
        TODO("Not yet implemented")
    }

    override fun getAndAnalyze(path: Path): TrackInfo {
        TODO("Not yet implemented")
    }

    override fun close() {
        return
    }
}
