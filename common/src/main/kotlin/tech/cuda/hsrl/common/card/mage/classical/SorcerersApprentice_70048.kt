package tech.cuda.hsrl.common.card.mage.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SorcerersApprentice_70048 : Card() {
    override val id = 70048
    override val name = "巫师学徒"
    override val description = "你的法术的法力值消耗减少（1）点。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ClassicCards
    override val background = "学徒们就是用来到处使唤的。“给我做点魔法面包，再来杯咖啡！我要魔法咖啡！”"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e2232c66bd58045f4e91a26f21eb26b85cb39480ec81a1da85a522a1ad398bcd.png"
}
