package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FlameJuggler_2580 : Card() {
    override val id = 2580
    override val name = "火焰杂耍者"
    override val description = "<b>战吼：</b>随机对一个敌人造成1点伤害。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "一开始他玩的是链锯，后来改玩火了。至于原因，他希望自己的节目会越来越火！"
    override val artist = "James Zhang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ec300955fac0e5e33ec1c27c989ea1c300072975fab339131db5a87c41e72c7a.png"
}
