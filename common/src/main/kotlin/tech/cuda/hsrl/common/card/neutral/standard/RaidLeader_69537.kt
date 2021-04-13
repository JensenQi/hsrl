package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RaidLeader_69537 : Card() {
    override val id = 69537
    override val name = "团队领袖"
    override val description = "你的其他随从获得+1攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "“谁再敢OT的，扣掉50DKP！”"
    override val artist = "Phill Gonzales"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5e6eb0f81d38d8ef079e1d9814f07f2aa5b5b74abfe44a0b2def28893193ce48.png"
}
