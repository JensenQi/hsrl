package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Bearshark_42711 : Card() {
    override val id = 42711
    override val name = "熊鲨"
    override val description = "无法成为法术或英雄技能的目标。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Kotf
    override val background = "它的分类让生物学家很是头疼。"
    override val artist = "Max Grecke"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/66da0d4c1be25d565e4af9bddcd4f324a920288aaab42da0420e6f19b4d4c536.png"
}
