package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SerpentWard_49800 : Card() {
    override val id = 49800
    override val name = "毒蛇守卫"
    override val description = "在你的回合结束时，对敌方英雄造成2点 伤害。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Totem
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "有点像救护车的标志，也可以送你上救护车。"
    override val artist = "Cicily He"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/664e74867d21f27068292d65aafd505e7056c2c2837e8a0585ed61c6bb2278e0.png"
}
