package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Sprint_630 : Card() {
    override val id = 630
    override val name = "疾跑"
    override val description = "抽四张牌。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Legacy1635
    override val background = "潜行者们通常都不擅长慢跑。"
    override val artist = "James Zhang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/330111b7666a1a3824d8f92f3ca5ae163434ee0ecb0157619f3b6e4f03c6c467.png"
}
