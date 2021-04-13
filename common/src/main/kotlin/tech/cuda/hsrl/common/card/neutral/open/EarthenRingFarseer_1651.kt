package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EarthenRingFarseer_1651 : Card() {
    override val id = 1651
    override val name = "大地之环先知"
    override val description = "<b>战吼：</b> 恢复 3点生命值。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "他确实能看得很远，他才不像那些肮脏的海盗们需要用望远镜。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7605cc36bceac6a91d5a9a2f167c7d202356f13ea81ea03d3252399f23ae4bbf.png"
}
