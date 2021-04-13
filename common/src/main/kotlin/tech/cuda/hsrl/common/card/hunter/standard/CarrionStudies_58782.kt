package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CarrionStudies_58782 : Card() {
    override val id = 58782
    override val name = "腐食研习"
    override val description = "<b>发现</b>一张<b>亡语</b>随从牌。你的下一张<b>亡语</b>随从牌法力值消耗减少（1）点。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "看，这就是传说中的毛边书。"
    override val artist = "Akkapoj T."
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/56b1d260f45048b678f86f837f006ea3f2ff651279a96f81413b6ee9cc41f610.png"
}
