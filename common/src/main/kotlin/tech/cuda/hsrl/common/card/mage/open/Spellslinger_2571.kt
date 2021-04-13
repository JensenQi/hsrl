package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Spellslinger_2571 : Card() {
    override val id = 2571
    override val name = "嗜法者"
    override val description = "<b>战吼：</b>随机将一张法术牌置入每个玩家的手牌。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Tgt
    override val background = "沉溺于法术而无法自拔的人，都应该送去治疗。"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4e24c9a7b42b9246926f08f214084998c51bec78d6f911f439e547aad0addfb2.png"
}
