package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Duplicate_1801 : Card() {
    override val id = 1801
    override val name = "复制"
    override val description = "<b>奥秘：</b>当一个友方随从死亡时，将两张该随从的复制置入你的手牌。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Naxx
    override val background = "您的本次卡牌复制行为不会导致账号被封停！"
    override val artist = "Alex Garner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2700356112367a2f5bef90052bae0d36f4d848bb441fd72a41fc36d5bd194c87.png"
}
