package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RattlingRascal_42422 : Card() {
    override val id = 42422
    override val name = "骷髅捣蛋鬼"
    override val description = "<b>战吼：</b>召唤一个5/5的骷髅。 <b>亡语：</b>为你的对手召唤一个5/5的骷髅。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "别放弃，骷髅！"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/602952112df9829f455b7b80556f6ff48ad6a7263362ae91a96f93e297cd10ee.png"
}
