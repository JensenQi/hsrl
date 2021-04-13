package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Meteorologist_48693 : Card() {
    override val id = 48693
    override val name = "气象学家"
    override val description = "<b>战吼：</b>你每有一张手牌，便随机对一个敌人造成1点伤害。"
    override var cost: Int? = 6
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.BoomsdayProject
    override val background = "有人说世界将毁灭于火，有人说毁灭于冰。为什么不是冰与火呢？"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a808abd9a61633b5457814ebbf392613f03d5d6fa9c0626ba8f108e6e289eee9.png"
}
