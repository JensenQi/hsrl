package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FurbolgMossbinder_43517 : Card() {
    override val id = 43517
    override val name = "缚雾熊怪"
    override val description = "<b>战吼：</b>将一个友方随从变形成为一个6/6的元素。"
    override var cost: Int? = 5
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "看啊，这就是迷雾那不可阻止的力量！"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1e741ec4bcc097ece763c46157e200e8c0778e56d7d130cb21e3d659b8cb3d49.png"
}
