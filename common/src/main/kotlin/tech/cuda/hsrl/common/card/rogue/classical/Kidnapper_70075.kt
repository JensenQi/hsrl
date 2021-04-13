package tech.cuda.hsrl.common.card.rogue.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Kidnapper_70075 : Card() {
    override val id = 70075
    override val name = "劫持者"
    override val description = "<b>连击：</b>将一个随从移回其拥有者的手牌。"
    override var cost: Int? = 6
    override var health: Int? = 3
    override var attack: Int? = 5
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ClassicCards
    override val background = "他只是希望有人能看看他在假期里拍摄的照片而已。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/450c45672ddb94d5f4774fdd395eba6cfb00ce8df3cb6029f216c86089d024cc.png"
}
