package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EducatedElekk_60090 : Card() {
    override val id = 60090
    override val name = "驯化的雷象"
    override val description = "每当使用一张法术牌，该随从会记住法术。<b>亡语：</b>将记住的法术牌洗入你的牌库。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“一看到它，我想起一句俗语，‘雷象永远不会……’什么来着。后面我忘了。”"
    override val artist = "Cheng Hao"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/00f32d81c6a583a2a1cb5ff5a0502ba5428a47a27376ab416101b10207276ebd.png"
}
