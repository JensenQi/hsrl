package tech.cuda.hsrl.common.card.rogue.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VanessaVancleef_62359 : Card() {
    override val id = 62359
    override val name = "梵妮莎·范克里夫"
    override val description = "<b>连击：</b>将你对手使用的上一张牌的一张复制置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Core
    override val background = "有人收集邮票，有人收集花朵。而她收集敌人。"
    override val artist = "Wayne Reynolds"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1fefdfea80ee8443ff29ff3dea4390c25e9ad5aacdb3265dad7ddaba86eb6db6.png"
}
