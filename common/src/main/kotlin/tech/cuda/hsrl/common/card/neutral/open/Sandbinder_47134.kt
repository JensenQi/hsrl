package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Sandbinder_47134 : Card() {
    override val id = 47134
    override val name = "缚沙者"
    override val description = "<b>战吼：</b>从你的牌库中抽一张元素牌。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "秘诀就是用胶水。"
    override val artist = "Brian Despain"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4e93dc43cb1350ed4146f3bd39fd52762f6fe77cbb979b8548832530797a69ab.png"
}
