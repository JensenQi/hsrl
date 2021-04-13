package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SorcerersApprentice_614 : Card() {
    override val id = 614
    override val name = "巫师学徒"
    override val description = "你的法术的法力值消耗减少（1）点。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Legacy3
    override val background = "学徒们就是用来到处使唤的。“给我做点魔法面包，再来杯咖啡！我要魔法咖啡！”"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9f5d970a53fe172346e23d7df2ef10ff47fadbf951a093878ba75764fb20da4f.png"
}
