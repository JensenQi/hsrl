package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PsionicProbe_45979 : Card() {
    override val id = 45979
    override val name = "灵能窥探"
    override val description = "复制你对手的牌库中的一张法术牌，并将其置入你的 手牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "她更喜欢管这叫作“心灵抚摸”。"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9e6073721f9641745e8caed88362f86a245d9129cebe2da2937f8345af2a748f.png"
}
