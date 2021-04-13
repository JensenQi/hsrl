package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MadamGoya_41841 : Card() {
    override val id = 41841
    override val name = "郭雅夫人"
    override val description = "<b>战吼：</b>选择一个友方随从，与你牌库中的一个随从交换。"
    override var cost: Int? = 6
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "郭雅夫人在加基森开黑市只有一个目的，就是在三大家族争夺加基森的控制权时大赚一笔。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b343702164737fd8b5d2f75e00929059964f3f48ca6cff3d12b2f2cc52b470a6.png"
}
