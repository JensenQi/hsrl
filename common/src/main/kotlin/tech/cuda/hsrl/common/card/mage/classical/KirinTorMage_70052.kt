package tech.cuda.hsrl.common.card.mage.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KirinTorMage_70052 : Card() {
    override val id = 70052
    override val name = "肯瑞托法师"
    override val description = "<b>战吼：</b> 在本回合中，你使用的下一个<b>奥秘</b>的法力值消耗为（0）点。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ClassicCards
    override val background = "肯瑞托的法师们居住在飘浮之城达拉然。怎样让达拉然飘起来？只要用魔法把氢气球变成透明的就行了。"
    override val artist = "Popo Wei"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7c42f649bc7e20788b51655e9d97d9504761e7905a887291c060f683988fab54.png"
}
