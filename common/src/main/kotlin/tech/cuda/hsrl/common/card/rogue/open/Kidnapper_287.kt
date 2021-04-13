package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Kidnapper_287 : Card() {
    override val id = 287
    override val name = "劫持者"
    override val description = "<b>连击：</b>将一个随从移回其拥有者的手牌。"
    override var cost: Int? = 6
    override var health: Int? = 3
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Legacy3
    override val background = "他只是希望有人能看看他在假期里拍摄的照片而已。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a2e4dfff856bc1debdff39ed1d1a1890e0cbd336e26e2969e3eadf095fcd2622.png"
}
