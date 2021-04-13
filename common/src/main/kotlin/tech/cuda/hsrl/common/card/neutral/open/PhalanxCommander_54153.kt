package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PhalanxCommander_54153 : Card() {
    override val id = 54153
    override val name = "方阵指挥官"
    override val description = "你的<b>嘲讽</b>随从获得+2攻击力。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "指挥水准名列前猫。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7f89f1ac09eb2679439a35af1c6279787d10b4d55c2886b15c3074b8797c658c.png"
}
