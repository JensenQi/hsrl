package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeadscaleKnight_42663 : Card() {
    override val id = 42663
    override val name = "死鳞骑士"
    override val description = "<b>吸血</b>"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "“死鱼翻身”的杰出代表。"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cf6c0a3f50d32006f9e08cac865e265cfac1965d7b4e9821bbcc3e27ad01c6e1.png"
}
