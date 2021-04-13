package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LightningBloom_60016 : Card() {
    override val id = 60016
    override val name = "雷霆绽放"
    override val description = "在本回合中，获得两个法力水晶。<b>过载：</b>（2）"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "神奇的是，这种花不会在同一个地方绽放两次。"
    override val artist = "Vlad Botos"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c9b5a9ff3c1c05053c8e4334d64eb7c2160f4f353ebf00f51dcfaccd55a0c86b.png"
}
