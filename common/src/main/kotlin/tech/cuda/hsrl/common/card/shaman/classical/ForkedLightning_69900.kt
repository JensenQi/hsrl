package tech.cuda.hsrl.common.card.shaman.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ForkedLightning_69900 : Card() {
    override val id = 69900
    override val name = "叉状闪电"
    override val description = "随机对两个敌方随从造成 2点伤害，<b>过载：</b>（2）"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ClassicCards
    override val background = "配上勺状闪电和刀状闪电，你就集齐整套闪电餐具了。"
    override val artist = "Ralph Horsley"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4f18220b558fe92bfe73ebbe32ca2657a7ed4362c1aa8a41e97a9992e4135e79.png"
}
