package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DragonEgg_2278 : Card() {
    override val id = 2278
    override val name = "龙蛋"
    override val description = "每当该随从受到伤害，便召唤一条2/1的雏龙。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Brm
    override val background = "究竟是先有龙，还是先有龙蛋？"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0d8b56b9128e85198f2d287eb4e9407097820c4adec3ef91914b5a4eb3778872.png"
}
