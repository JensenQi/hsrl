package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Siegebreaker_54835 : Card() {
    override val id = 54835
    override val name = "攻城恶魔"
    override val description = "<b>嘲讽</b> 你的其他恶魔获得+1攻击力。"
    override var cost: Int? = 7
    override var health: Int? = 8
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Legacy1635
    override val background = "在攻城之前给城墙购买了保险。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/853a1b84608cb7dd03be6b3444fb7a2818a97f06fbb737b9612fe854cff57b1d.png"
}
