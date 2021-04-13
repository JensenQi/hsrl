package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ManaBind_41158 : Card() {
    override val id = 41158
    override val name = "法术共鸣"
    override val description = "<b>奥秘：</b>当你的对手施放一个法术时，将该法术的一张复制置入你的手牌，其法力值消耗变为（0）点。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Ungoro
    override val background = "好厉害的法术，我也要！"
    override val artist = "Izzy Hoover"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b885456148e5e8e6944f9d5b09a1d2b87825ea3344d24d5cefe4e19b7da95479.png"
}
