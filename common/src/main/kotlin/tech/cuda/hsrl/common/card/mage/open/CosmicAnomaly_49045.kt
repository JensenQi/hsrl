package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CosmicAnomaly_49045 : Card() {
    override val id = 49045
    override val name = "宇宙异象"
    override val description = "<b>法术伤害+2</b>"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.BoomsdayProject
    override val background = "配料表：星辰萃取物，蓝色一号色素，食用香精及防腐剂。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c957b46bb7c68a18221b83948e5473f34d9c2ddcf328364ae0d65879afd7e396.png"
}
