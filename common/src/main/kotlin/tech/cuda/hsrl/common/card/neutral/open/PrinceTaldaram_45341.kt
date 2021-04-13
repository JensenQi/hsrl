package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PrinceTaldaram_45341 : Card() {
    override val id = 45341
    override val name = "塔达拉姆王子"
    override val description = "<b>战吼：</b>如果你的牌库里没有法力值消耗为（3）的牌，则该随从变形成为一个随从的3/3的复制。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "三个王子站在一起，一个想要模仿兄弟。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/aa722906283413c546cf3bfaf96f18433ee734fd47aed798bd2b8f358adf5059.png"
}
