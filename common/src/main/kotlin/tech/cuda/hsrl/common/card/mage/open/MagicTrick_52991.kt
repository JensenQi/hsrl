package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MagicTrick_52991 : Card() {
    override val id = 52991
    override val name = "魔术戏法"
    override val description = "<b>发现</b>一张法力值消耗小于或等于（3）点的法术牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.RiseOfShadows
    override val background = "我发明了一个深奥复杂的魔术，可惜这里地方太小，施展不出来！"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fef0ad41a6efa00d0c100e2da4eca0b3ac7c71032c8f6407408742a78edbbf1d.png"
}
